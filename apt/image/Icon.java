import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
class Icon{
	public static void main(String[] args) {
	JFrame f = new JFrame();
	f.setSize(500,500);
	ImageIcon img = new ImageIcon("salik.png");
	f.setIconImage(img.getImage());
	f.setBackground(img.getImage());
	f.setVisible(true);
	}
}