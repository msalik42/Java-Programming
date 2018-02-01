import java.awt.*;
import javax.swing.*;
class Demo{
	static JLabel l;
	public static void main(String[] args) {
	JFrame f = new JFrame("salik");
	///f.setUndecorated(true);for hiding the task bar
	JPanel p = new JPanel();
	p.setLayout(new BorderLayout());
	p.setBackground(Color.cyan);
	l = new JLabel(new ImageIcon("salik.png"));
	l.setHorizontalAlignment(JLabel.CENTER);
	//l.addMouseListener(new MyListener());
	p.add(l);
	f.add(p);
	Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	int sw = (int)d.getWidth();
	int sh = (int)d.getHeight();
	f.setSize(700,600);
	f.setLocation((sw-700)/2,(sh-600)/2);
	f.setVisible(true);
	}
}
