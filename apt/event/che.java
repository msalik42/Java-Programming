import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class che{
	JPanel p;
	JTextField t;
	JComboBox box;
	public che(){
		JFrame f =new JFrame();
		p = new JPanel();
		JLabel l = new JLabel("Name");
		p.add(l);
		t = new JTextField(30);
		p.add(t);
		JButton b = new JButton("submit");
		b.addMouseListener(new MyListener());
		p.add(b);
		box = new JComboBox();
		p.add(box);
		f.add(p);
		f.setSize(500,500);
		f.setVisible(true);
	}
	class MyListener implements MouseListener{
		public void mouseClicked(MouseEvent e){
			String s = t.getText();;
			box.addItem(s);
		}
	}
	public static void main(String[] args) {
		che ch = new che();
	}
}