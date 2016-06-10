package hoofdstuk11;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk11dot5 extends Applet {

	
	
	
	
public void init () {
	
	
}



public void paint (Graphics g) {
	int x = 40;
	int y = 40;
	
	for (int i = 0; i < 5; i++) {
			g.drawRect(x, y, 10, 10);
		y += 10;
		x += 10;
		
	}
	
	
	}
}
