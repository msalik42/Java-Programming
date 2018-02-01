import java.awt.*;  
class Demo extends Frame
{ 

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setVisible(true); 
		f.setSize(400,400);
		f.setBackground(Color.green);
		f.setTitle("my first app");
		f.setLayout(new FlowLayout());
		Panel p1 = new Panel();
		p1.setSize(400,400);
		p1.setBackground(Color.blue);
		Panel p2 = new Panel();
		p2.setBackground(Color.YELLOW);
		p2.setSize(400,400);
		Panel p3 = new Panel();
		p3.setSize(400,400);
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

		Label lb1 = new Label("username");
		Label lb2 = new Label("password");
		TextField tf1 = new TextField(30);
		TextField tf2 = new TextField(30);
		Button b = new Button("Submit");
		Choice ch = new Choice();
		ch.setBackground(Color.green);
		ch.addItem("India");
		ch.addItem("Saudi Arabia");
		ch.addItem("Bangladedh");
		Checkbox cb1 = new Checkbox("Continue Anyway");
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb3 = new Checkbox("Male",cbg,true);
		Checkbox cb4 = new Checkbox("Female",cbg,false);
		p3.add(cb3);
		p3.add(cb4);

		
		p3.add(ch);
		p1.add(lb1);
		p1.add(tf1);
		p2.add(lb2);
		p2.add(tf2);
		p3.add(cb1);
		p3.add(b);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		}
}