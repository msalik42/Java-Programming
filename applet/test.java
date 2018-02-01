import java.applet.Applet;  
import java.awt.*;  
public class MyApplet extends Applet{
	Label l1,l2;
	TextField t1,t2;
	Button b;
	public void init(){
		setLayout(null);
		l1 = new Label("username");
		t1 = new TextField();
		l2 = new Label("password");
		t2 = new TextField();
		b = new Button("Submit");
		add("l1");
		add("t1");
		add("l2");
		add("t2");
		add("b");
	}
}