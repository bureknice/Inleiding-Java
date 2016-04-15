package hoofdstuk5;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class hoofdstuk5dot2 extends Applet {
	int gewicht1;
	int gewicht2;
	int gewicht3;
	
	
public void init() {
	setSize(1000,1000);
	gewicht1 = 40;	
	gewicht2 = 100;
	gewicht3 = 80;
	
	}

public void paint (Graphics g) {
	
	g.drawLine(50, 200, 300, 200);
	g.drawLine(50, 200, 50, 10);
	g.drawLine(45, 190, 55, 190);
	g.drawLine(45, 180, 55, 180);
	g.drawLine(45, 170, 55, 170);
	g.drawLine(45, 160, 55, 160);
	g.drawLine(45, 150, 55, 150);
	g.drawLine(45, 140, 55, 140);
	g.drawLine(45, 130, 55, 130);
	g.drawLine(45, 120, 55, 120);
	g.drawLine(45, 110, 55, 110);
	g.drawLine(45, 100, 55, 100);
	
		g.setColor(Color.red);
		g.fillRect(60, 200-gewicht1, 20, gewicht1);
	
		g.setColor(Color.blue);
		g.fillRect(90, 200-gewicht2, 20, gewicht2);
	
		g.setColor(Color.CYAN);
		g.fillRect(120, 200-gewicht3, 20, gewicht3);
		
		g.setColor(Color.red);
		g.drawString("Valerie", 200, 110);
		g.setColor(Color.BLUE);
		g.drawString("Jeroen", 200, 120);
		g.setColor(Color.CYAN);
		g.drawString("Hans", 200, 130);
	
	}
}
