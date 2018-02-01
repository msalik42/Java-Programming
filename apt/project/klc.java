import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
class klc{
	public JTextField num1,num2;
	public JLabel fn,sn,opt;
	public JButton button;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.setVisible(true);
		f.getContentPane().setBackground(Color.blue);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JLabel fn = new JLabel("First Number: ");
		JLabel sn = new JLabel("Second Number: ");
		JLabel opt = new JLabel("");
		JTextField num1 = new JTextField(30);
		JTextField num2 = new JTextField(30);
		JButton button = new JButton("ADD");
		p1.add(fn);
		p1.add(num1);
		p2.add(sn);
		p2.add(num2);
		p3.add(button);
		p3.add(opt);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		button.addActionListener(new ML());



		
	}
	public static class ML implements ActionListener {
		public void actionPerformed(ActionEvent e){
			int a,b,s;
			a = Integer.parseInt(num1.getText());
			b = Integer.parseInt(num2.getText());
			s=a+b;
			opt.setText("Sum is: "+s);
		}
	}
}