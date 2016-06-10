package hoofdstuk11;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk11dot8 extends Applet {


	
	
	
public void init () {
	setSize(600, 600);
	
	
}

public void paint (Graphics g){
	int width = 2;
	int height = 2;
	int positie = 50;
	
	for (int i = 0;  i < 100; i++) {
	
		width += 5;
		height += 5;
		
		
		g.drawOval(positie, positie, width, height);
	}
	
	

	
	

	}
}
