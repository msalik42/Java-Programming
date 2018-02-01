import javax.swing.*;
import java.awt.*;
class cal extends JFrame{
	public static void main(String[] args) {
		JFrame f= new JFrame();
		f.setSize(600,200);
		f.setLayout(null);
		JLabel l1 = new JLabel("UserName");
		l1.setBounds(50,30,100,30);
		f.add(l1);

		TextField tf1 = new TextField();
		tf1.setBounds(150,30,200,30);
		f.add(tf1);



		JLabel l2 = new JLabel("Password");
		l2.setBounds(50,70,100,30);
		f.add(l2);

		TextField tf2 = new TextField();
		tf2.setBounds(150,70,200,30);
		f.add(tf2);
		JButton submit = new JButton("Submit");
		submit.setBounds(50,120,100,30);
		f.add(submit);
		JButton close = new JButton("Close");
		close.setBounds(200,120,100,30);
		f.add(close);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}