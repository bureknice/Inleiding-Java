package hoofdstuk11;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk11dot7 extends Applet {

	
	
	
public void init ()  {
	
	
}


public void paint (Graphics g) {
	int width = 10;
	int height = 10;
	int positie = 300;
	
	
	for (int i = 0; i < 50; i++) {
		 
		width += 10;
		height += 10;
		positie -= 5;
		
		g.drawOval(positie, positie, width, height);
		
		
	}
}
}
