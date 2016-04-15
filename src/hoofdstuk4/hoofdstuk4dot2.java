package hoofdstuk4;

import java.applet.Applet;
import java.awt.Graphics;

public class hoofdstuk4dot2 extends Applet {
	
	
public void init () {
	setSize(500,500);
	
	
	
	}
public void paint (Graphics g){
	g.drawLine(50, 60, 100, 60 );
	g.drawLine(50, 60, 75, 20 );
	g.drawLine(75, 20, 100, 60 );
	g.drawRect(50, 60, 50, 50);
	g.drawRect(60, 70, 5, 5);
	g.drawRect(70, 95, 10, 15);
	
	
	}

}
