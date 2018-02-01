import java.awt.*;
import javax.swing.*;
public class grid extends JFrame
{
	grid(){
		super("Test Frame");
		getContentPane().setBackground(Color.black);
		setLayout(new GridLayout(10,10,5,2));
		for(int i=0;i<100;i++){
			JPanel jp = new JPanel();
			jp.setBackground(new Color((int)(Math.random()*16777215)));
			add(jp);
		}
		setSize(700,700);
		setVisible(true);
	}
	public static void main(String[] args) {
		new grid();
	}
}