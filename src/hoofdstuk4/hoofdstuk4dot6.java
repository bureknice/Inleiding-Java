package hoofdstuk4;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class hoofdstuk4dot6 extends Applet {

	
public void init() {
	setSize(500,500);
	
	
	}
public void paint (Graphics g) {
	g.setColor(Color.black);
	g.fillRoundRect(50, 50, 75, 150, 50, 50);
	g.setColor(Color.red);
	g.fillOval(65, 55, 40, 40);
	g.setColor(Color.orange);
	g.fillOval(65, 100, 40, 40);
	g.setColor(Color.green);
	g.fillOval(65, 145, 40, 40);
	g.setColor(Color.BLACK);
	g.fillRect(75, 190, 10, 500);
	}

}
