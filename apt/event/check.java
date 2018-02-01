import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
 
public class SleepingBarbers extends JPanel implements ActionListener{
private ImageIcon asleep=new ImageIcon("barberAsleep.gif"),awake=new ImageIcon("barberAwake.gif");
private static BufferedImage[][] images=new BufferedImage[1][8];
private JButton addCustomer;
private BufferedImage backdrop;
private javax.swing.Timer timer=new javax.swing.Timer(30, this);
private LinkedList customers=new LinkedList(), seatedAtQueue=new LinkedList();
private boolean queued[]=new boolean[3], seated[]=new boolean[3];
private int customerCount=1, left=0, served=0;
private Barber barbers[]=new Barber[3];
private JLabel leftLabel=new JLabel("0"), servedLabel=new JLabel("0");
 
public SleepingBarbers() throws IOException{
super();
setLayout(null);
for(int ctr=0; ctr<3; ctr++){
try{
barbers[ctr]=new Barber();
add(barbers[ctr]);
}catch(IOException e){}
}
for(int ctr=0; ctr<8; ctr++){
try{
images[0][ctr]=ImageIO.read(new File("char"+0+"_"+ctr+".gif"));
}catch(Exception e){}
}
backdrop=ImageIO.read(new File("barbersBack.jpg"));
leftLabel.setForeground(Color.WHITE);
add(leftLabel);
leftLabel.setBounds(615,483,100,20);
servedLabel.setForeground(Color.WHITE);
add(servedLabel);
servedLabel.setBounds(615,470,100,20);
 
addCustomer=new JButton(new ImageIcon("addCust.jpg"));
add(addCustomer);
addCustomer.addActionListener(this);
addCustomer.setBounds(487,530,263,29);
addCustomer.setRolloverIcon(new ImageIcon("addCustOver.jpg"));
addCustomer.setPressedIcon(new ImageIcon("addCustPressed.jpg"));
addCustomer.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
barbers[0].setBounds(92,112,30,130);
barbers[1].setBounds(71,235,30,130);
barbers[2].setBounds(49,354,30,130);
 
timer.start();
}
 
public void actionPerformed(ActionEvent e){
Object src=e.getSource();
timer.stop();
if(src==addCustomer){
Customer currentCust=new Customer((int)(Math.random()*1));
add(currentCust);
customers.add(currentCust);
currentCust.setBounds(500,80,40,130);
 
}
if(src==timer&&!customers.isEmpty()){
Collections.sort(customers);
for(int ctr=0; ctr<customers.size();> remove(customers.get(ctr));
}
for(int ctr=0; ctr<customers.size();> add(customers.get(ctr));
}
for(int ctr=0; ctr<customers.size();> for(int ctr1=0; ctr1<seatedatqueue.size();> (seatedAtQueue.get(ctr1)).findBarber();
}
(customers.get(ctr)).animate();
if((customers.get(ctr)).exit){
remove(customers.get(ctr));
customers.remove(ctr);
//System.out.println("cutomer size "+customers.size());
}
}
}
repaint();
validate();
timer.restart();
}
 
private class Customer extends JPanel implements Comparable{
private int character, atQueue, move, time, barberNo;
private boolean beenQueued, exit, atBarber, sit, done;
private BufferedImage image;
private LinkedList actions=new LinkedList(), motions=new LinkedList();
//private Integer moveX, moveY;
 
private Customer(int c){
super(new BorderLayout());
character=c;
setOpaque(false);
motions.add(2);
actions.add("down");
actions.add("enter");
image=images[c][0];
}
 
public void animate(){
if(!actions.isEmpty()){
if(!motions.isEmpty()) move=(Integer)motions.getFirst();
//System.out.println(move+" moving ");
if(actions.getFirst().equals("down")){
setLocation(getX(), getY()+4);
if(!done)image=images[character][0];
else image=images[character][6];
move--;
}else if(actions.getFirst().equals("up")){
setLocation(getX(), getY()-4);
image=images[character][1];
move--;
}else if(actions.getFirst().equals("left")){
image=images[character][3];
setLocation(getX()-4, getY());
move--;
}else if(actions.getFirst().equals("right")){
if(!done)image=images[character][2];
else image=images[character][7];
setLocation(getX()+4, getY());
move--;
}else if(actions.getFirst().equals("exit")){
exit=true;
if(!atBarber){
left++;
leftLabel.setText(""+left);
}
return;
}else if(actions.getFirst().equals("sit")){
if(!sit){
sit=true;
setLocation(getX(), getY()-1);
image=images[character][4];
}
}
if(actions.getFirst().equals("cut")){
image=images[character][4];
setOpaque(false);
if(time==5100){
done=true;
served++;
servedLabel.setText(""+served);
actions.removeFirst();
//System.out.println("waiting "+time);
seated[barberNo]=false;
barbers[barberNo].sleep();
motions.add(20);
actions.add("right");
if(barberNo==0){
motions.add(64);
actions.add("down");
}else if(barberNo==1){
motions.add(33);
actions.add("down");
}else if(barberNo==2){
motions.add(3);
actions.add("down");
}
motions.add(50);
actions.add("right");
motions.add(10);
actions.add("down");
actions.add("exit");
}else{
barbers[barberNo].wakeUp();
time+=30;
}
return;
}
if(actions.getFirst().equals("enter")){
findBarber();
if(atBarber) return;
//System.out.println(actions.getFirst());
actions.removeFirst();
for(int ctr=0; ctr<3; ctr++){
if(!queued[ctr]){
seatedAtQueue.add(this);
queued[ctr]=true;
beenQueued=true;
atQueue=ctr;
if(ctr==0){
motions.add(33);
actions.add("left");
actions.add("sit");
 
}else if(ctr==1){
motions.add(24);
actions.add("right");
actions.add("sit");
 
}else if(ctr==2){
motions.add(39);
actions.add("right");
actions.add("sit");
}
//System.out.println("queue at "+ctr);
break;
}
}
//System.out.println(actions.getFirst());
if(!beenQueued){
actions.add("wander");
}
return;
}
if(actions.getFirst().equals("wander")){
actions.removeFirst();
beenQueued=true;
actions.add("left");
motions.add(10);
actions.add("right");
motions.add(20);
actions.add("left");
motions.add(10);
actions.add("up");
motions.add(15);
actions.add("exit");
return;
}
 
if(!motions.isEmpty()) motions.set(0, move);
if(move==0&&!motions.isEmpty()){
actions.removeFirst();
motions.removeFirst();
}
}
}
 
public void findBarber(){
//System.out.println("hello");
if(!motions.isEmpty()) return;
for(int ctr=0; ctr<3; ctr++){
if(!seated[ctr]){
seatedAtQueue.remove(this);
seated[ctr]=true;
atBarber=true;
barberNo=ctr;
actions.clear();
//System.out.println("going to "+ctr);
if(beenQueued){
setLocation(getX(), getY()+1);
queued[atQueue]=false;
if(atQueue==0){
//System.out.println("yep");
motions.add(43);
actions.add("left");
}else if(atQueue==1){
motions.add(101);
actions.add("left");
}else if(atQueue==2){
motions.add(115);
actions.add("left");
}
 
}else{
motions.add(77);
actions.add("left");
}
if(ctr==0){
motions.add(15);
actions.add("down");
motions.add(19);
actions.add("left");
}else if(ctr==1){
motions.add(46);
actions.add("down");
motions.add(24);
actions.add("left");
}else if(ctr==2){
motions.add(76);
actions.add("down");
motions.add(30);
actions.add("left");
}
 
actions.add("cut");
//System.out.println(actions.getFirst());
break;
}
}
}
 
public int compareTo(Object other){
if(((Customer)other).getY()>getY()){
return 1;
}else{
return -1;
}
}
 
public void paintComponent(Graphics g){
super.paintComponent(g);
if(actions.getFirst().equals("cut")) ((Graphics2D)g).drawImage(new ImageIcon("char0_5.gif").getImage(),0,0,this);
else ((Graphics2D)g).drawImage(image, null,0,0);
}
}
 
public void paintComponent(Graphics g){
super.paintComponent(g);
((Graphics2D)g).drawImage(backdrop, null, 0, 0);
}
 
private class Barber extends JPanel{
private ImageIcon barberImage;
private Barber() throws IOException{
super();
setOpaque(false);
sleep();
}
 
private void sleep(){
barberImage=asleep;
}
 
private void wakeUp(){
barberImage=awake;
}
 
public void paintComponent(Graphics g){
super.paintComponent(g);
((Graphics2D)g).drawImage(barberImage.getImage(),0,0,this);
}
}
public static void createAndShowGUI(){
try{
JFrame x=new JFrame("Sleeping Barber's Problem");
x.setSize(799,730);
x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
x.add(new SleepingBarbers());
x.setResizable(false);
x.setVisible(true);
}catch(IOException e){}
 
}
public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run() {
createAndShowGUI();
}
});
}
}