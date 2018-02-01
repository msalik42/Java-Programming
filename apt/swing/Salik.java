import java.awt.*;
import javax.swing.*;
class Salik{
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		//f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar mbr = new JMenuBar();
		
		JMenu file = new JMenu("File");
				JMenuItem save1 = new JMenuItem("Save");
				JMenuItem saveas = new JMenuItem("Save As..");
				JMenuItem openfile = new JMenuItem("Open");
				JMenu save = new JMenu("Save");
					save.add(save1);
					save.add(saveas);
				file.add(save);
				file.add(openfile);
		JMenu edit = new JMenu("Edit");
				JMenuItem cut = new JMenuItem("Cut");
				JMenuItem copy = new JMenuItem("Copy");
				JMenuItem paste = new JMenuItem("paste");
				edit.add(cut);
				edit.add(copy);
				edit.add(paste);
		JMenu language = new JMenu("Language");
				JMenuItem  c= new JMenuItem("C");
				JMenuItem  cpp = new JMenuItem("C++");
				JMenuItem  java= new JMenuItem("JAVA");
				JMenuItem js = new JMenuItem("JAVA SCRIPT");
				JMenuItem  python= new JMenuItem("PYTHON");
				JMenuItem  html= new JMenuItem("HTML");
				language.add(c);
				language.add(cpp);
				language.add(java);
				language.add(js);
				language.add(python);
				language.add(html);
		JMenu help = new JMenu("Help");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
			mbr.add(file);
			mbr.add(edit);
			mbr.add(language);
			mbr.add(help);
		f.setJMenuBar(mbr);
		JTextArea ta = new JTextArea(30,34);
		p2.add(ta);
		f.add(p2);
	}
}