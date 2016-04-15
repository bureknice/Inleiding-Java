package hoofdstuk4;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class hoofdstuk4dot4 extends Applet {
	
	
	
public void init() {
	setSize(500,500);
	
	}
public void paint(Graphics g) {
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
		g.fillRect(60, 160, 20, 40);
	
		g.setColor(Color.blue);
		g.fillRect(90, 100, 20, 100);
	
		g.setColor(Color.CYAN);
		g.fillRect(120, 120, 20, 80);
		
		g.setColor(Color.red);
		g.drawString("Valerie", 200, 110);
		g.setColor(Color.BLUE);
		g.drawString("Jeroen", 200, 120);
		g.setColor(Color.CYAN);
		g.drawString("Hans", 200, 130);
	
	
	
	
	}
}
