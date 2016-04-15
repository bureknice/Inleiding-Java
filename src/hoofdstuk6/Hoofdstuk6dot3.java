package hoofdstuk6;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk6dot3 extends Applet {
	int a;	
	int b;
	int uitkomst;
	
public void init(){
	a = 38322328;
	b = 12022021;
	uitkomst = a * b;
	setSize(500,500);
	
	}

public void paint(Graphics g) {
	g.drawString("De uitkomst van de som is: " + uitkomst, 50, 50);




	}
}
