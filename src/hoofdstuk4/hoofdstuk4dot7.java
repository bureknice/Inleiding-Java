package hoofdstuk4;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class hoofdstuk4dot7 extends Applet {

	
	
public void init() {
	
	
	}

public void paint (Graphics g) {
	g.drawRoundRect(50, 50, 150, 150, 20, 20);
	g.setColor(Color.BLACK);
	g.fillOval(60, 60, 50, 50);
	g.fillOval(140, 60, 50, 50);
	g.fillOval(60, 140, 50, 50);
	g.fillOval(140, 140, 50, 50);
}
}
