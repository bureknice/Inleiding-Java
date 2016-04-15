package hoofdstuk4;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class hoofdstuk4dot5 extends Applet {
	
	
public void init() {
	setSize(600,600);
	setBackground(Color.blue);
	}

public void paint(Graphics g) {
	g.setColor(Color.yellow);
	g.fillArc(50, 50, 500, 200, 0, 360);
	
	
	}
}
