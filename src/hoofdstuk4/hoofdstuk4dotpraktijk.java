package hoofdstuk4;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class hoofdstuk4dotpraktijk extends Applet {

	int lengte = 190;
	int hoogte = 100;
	Color paars = Color.magenta;
	Color zwart = Color.black;
	
public void init() {
	setSize(1000,1000);
	


}

public void paint (Graphics g) {
	g.drawLine(10, 20, 200, 20);
	g.drawString("Lijn", 100, 32);
	
	g.drawRect(10, 40, lengte, hoogte);
	g.drawString("Rechthoek", 75, 155);
	
	g.drawRoundRect(10, 160, lengte, 100, 40, 40);
	g.drawString("Afgeronde rechthoek", 50, 280);
	
	g.setColor(paars);
	g.fillRect(220, 40, lengte, hoogte);
	g.setColor(zwart);
	g.drawOval(220, 40, lengte, hoogte);
	g.drawString("Gevulde rechthoek met ovaal", 235, 155);
	
	g.setColor(paars);
	g.fillOval(220, 160, lengte, hoogte);
	g.setColor(zwart);
	g.drawString("Gevulde ovaal", 270, 280);
	
	g.drawOval(420, 40, lengte, hoogte);
	g.setColor(paars);
	g.fillArc(420, 40, lengte, hoogte, 0, 45);
	g.setColor(zwart);
	g.drawString("Taartpunt met ovaal eromheen", 425, 160);
	
	g.drawOval(450, 160, 120, 120);
	g.drawString("Cirkel", 490, 295);

	
	
	
	
	
	
	
	
	
	
	}
}
