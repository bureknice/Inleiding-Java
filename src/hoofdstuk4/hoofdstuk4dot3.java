package hoofdstuk4;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class hoofdstuk4dot3 extends Applet {

	
	
public void init () {
	
}


public void paint (Graphics g) {
	g.drawLine(50, 300, 50, 10);
	g.setColor(Color.red);
	g.fillRect(51, 10, 100, 50);
	g.setColor(Color.white);
	g.fillRect(51, 60, 100, 50);
	g.setColor(Color.blue);
	g.fillRect(51, 110, 100, 50);
	
	
	
	
}
}
