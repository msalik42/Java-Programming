import java.awt.*;
import java.applet.*;
public class Kite extends Applet

/*
<applet
		code="Kite.class"
		width=200
		height=200>
</applet>

*/
{
		int x[]={40,50,60,40};
		int y[]={120,100,120,120};
		int n=x.length;
		
	public void paint(Graphics g)
	{

	
	  g.drawLine(10,50,50,10);
	  g.drawLine(55,10,100,50);
	  g.drawLine(100,50,50,100);
	  g.drawLine(40,120,60,120);
	  g.drawLine(50,100,10,50);
	  g.drawLine(50,10,50,100);
	  g.drawArc(10,50,100,50,0,180);
	  g.fillPolygon(x,y,n);
	  
	  
		


	}
}