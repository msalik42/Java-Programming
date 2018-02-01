import java.awt.*;
import javax.swing.*;
class button{
	public static void main(String[] args) {
	JFrame f = new JFrame();
	Panel p =new Panel();
	p.setSize(300,300);
	p.setBackground(Color.blue);
	f.setSize(500,500);
	f.setLayout(new BorderLayout());
	p.setBounds(20,20,300,300);
	JButton b1 = new JButton("up");
	JButton b2 = new JButton("down");
	JButton b3 = new JButton("back");
	JButton b4 = new JButton("forword");
	p.add(b1,North);
	p.add(b2,South);
	p.add(b3,East);
	p.add(b4,West);
	f.add(p);
	/* JButton button = new JButton("");
	f.add(button);
	ImageIcon icon1 = new ImageIcon("exit.gif");
	button.setIcon(icon1);
	*/
	f.setVisible(true);
	}
}