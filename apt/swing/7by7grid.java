import java.awt.*;
import java.swing.*;
public class grid extends JFrame
{
	grid(){
		super("Test Frame");
		setBackground(Color.black);
		setLayout(new GridLayout(7,7,2,2));
		for(int i=0;i<49;i++){
			JPanel jp = new JPanel();
			jp.setBackground(new Color((int)(Math.random()*16777215)));
			add(jp);
		}
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new grid();
	}
}