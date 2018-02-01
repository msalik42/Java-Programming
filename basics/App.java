import java.awt.*;
import java.applet.*;
public class App extends Applet

/*
<applet
		code="App.class"
		width=200
		height=200>
</applet>

*/
{
	public void paint(Graphics g)
	{
      g.drawOval(0,0,100,100);

      g.drawOval(30,30,10,10);

      g.drawOval(70,30,10,10);

      g.drawOval(30,80,40,10);
	  g.drawLine(50,50,45,55);
	  g.drawLine(50,50,55,55);
	  g.drawLine(45,55,55,55);
	  
		


	}
}