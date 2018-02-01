import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Demo extends JFrame{
	static JLabel l,l2;
	Timer t;
	Demo(){
		setUndecorated(true); //for hiding the task bar
		JPanel p = new JPanel();
		l2 = new JLabel("Mohammad salik");
		p.setLayout(null);
		JPanel p2 = new JPanel();
		p.add(l2);
		add(p2);
		p.setBackground(Color.cyan);
		l = new JLabel(new ImageIcon("sa.png"));
		l.setHorizontalAlignment(JLabel.CENTER);
		p.add(l2);
		p.add(l);
		add(l2);
		add(p);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int sw = (int)d.getWidth();
		int sh = (int)d.getHeight();
		setSize(800,500);
		setLocation((sw-800)/2,(sh-500)/2);
		setVisible(true);
		addKeyListener(new MyListener());
		t = new Timer(30,new TimerClass());
		t.start();
		}
	int kc;
	public class MyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e){ //over riding the keyPressed  methow written in KeyAdopter class  
			kc = e.getKeyCode();
		}
	}
	int x = 100,y = 100;
	public class TimerClass implements ActionListener{
		public void actionPerformed(ActionEvent e){ //over riding the actionPerformed  methow written in ActionListener class
			if(kc==37){
				x=x>-50?x-5:800;
			}
			else if(kc==39){
				x=x<800?x+5:0;
			}
			else if(kc==38){
				y=y>-55?y-5:500;
			}
			else if(kc==40){
				y=y<500?y+5:0;
			}
			l.setBounds(x,y,50,55);
		}
	}
	public static void main(String[] args) {
		new  Demo();
	}
}
