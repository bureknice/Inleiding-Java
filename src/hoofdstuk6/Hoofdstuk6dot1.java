package hoofdstuk6;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk6dot1 extends Applet {
	int uitkomst;		
	int a;
	int geld;
	
	public void init() {
	a = 4;
	geld = 113;
	uitkomst = geld / a;

	}

public void paint (Graphics g) {
	g.drawString("Iedereen krijgt: " + uitkomst , 50, 50);


	}



}
