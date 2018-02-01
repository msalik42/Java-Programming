import javax.swing.*;
import java.awt.*;
class Button{
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.blue);
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		MenuBar mb = new MenuBar();
		Menu file = new Menu("File");
		Menu newf = new Menu("New");
		MenuItem nfile = new MenuItem("File");
		MenuItem project = new MenuItem("project");

		//JColorChooser jcc = new JColorChooser();
		//f.add(jcc);
		//JComboBox jcb = new JComboBox();
		//f.add(jcb);
		newf.add(nfile);
		newf.add(project);
		file.add(newf);
		mb.add(file);
		f.setMenuBar(mb);
		
		
	}
}