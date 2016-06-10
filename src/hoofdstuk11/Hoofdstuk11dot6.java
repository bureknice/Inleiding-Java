package hoofdstuk11;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk11dot6 extends Applet {

	
	
	
	
public void init () {
	
	
}



public void paint (Graphics g) {
	int width = 10;
	int height = 10;
	int positie = 100;
	
	for (int i = 0; i < 5; i++) {
		
			
		width += 10;
		height += 10;
		positie -= 5;
		g.drawOval(positie, positie, width, height);
	}
	
	
	}
}
