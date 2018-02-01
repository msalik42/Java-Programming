import java.awt.*;
class awt
{
	public static void main(String ar[])
	{
		Frame f = new Frame();
		f.setSize(500,400);
		f.setBackground(Color.cyan);
		f.setLayout(new FlowLayout());
		Button b1 = new Button("submit");
		Button b2 = new Button("cancle");
		f.add(b1);
		f.add(b2);
		f.setVisible(true);
	}
}
