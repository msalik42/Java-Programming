import javax.swing.JFrame;
import java.awt.*;  
class Demo extends Frame
{ 

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true); 
		f.setSize(1000,1000);
		f.setTitle("my first app");
		f.setLayout(new FlowLayout());
		MenuBar mbr = new MenuBar();
		Menu file = new Menu("File");
		Menu edit = new Menu("Edit");
		Menu view = new Menu("View");
		Menu help = new Menu("Help");
		Menu newfile = new Menu("New File");
			MenuItem ofile = new MenuItem("File");
			Menu project = new Menu("Project");
				MenuItem c = new MenuItem("C");
				MenuItem java = new MenuItem("Java");
				MenuItem website = new MenuItem("Website");
				project.add(c);
				project.add(java);
				project.add(website);
		MenuItem openfile = new MenuItem("Open File");
		MenuItem save = new MenuItem("Save");
		MenuItem saveas = new MenuItem("Save As");
		MenuItem cut = new MenuItem("Cut");
		MenuItem copy = new MenuItem("Copy");
		MenuItem paste = new MenuItem("Paste");
		MenuItem hidetabs = new MenuItem("Hide Tabs");
		MenuItem fullscreen = new MenuItem("Full Screen");
		MenuItem twitter = new MenuItem("Twitter");
		MenuItem aboutus = new MenuItem("About Us");


		newfile.add(ofile);
		newfile.add(project);
		file.add(newfile);
		file.add(openfile);
		file.add(save);
		file.add(saveas);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		view.add(hidetabs);
		view.add(fullscreen);
		help.add(twitter);
		help.add(aboutus);
		mbr.add(file);
		mbr.add(edit);
		mbr.add(view);
		mbr.add(help);
		f.setMenuBar(mbr);

		}
}