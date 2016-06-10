package hoofdstuk11;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk11dot9 extends Applet {

	
	
	public void init () {
	
	

	}



	public void paint (Graphics g) {
	int x = 50;
	int y = 50;
	
	for (int kolom = 0; kolom < 8; kolom++) {
		g.drawRect(x, y, 50, 50);
		
		
	}
	
	
	}
}
