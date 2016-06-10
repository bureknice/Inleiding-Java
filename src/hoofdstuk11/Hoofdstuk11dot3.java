package hoofdstuk11;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk11dot3 extends Applet {

	
	
public void init() {
	
	
}


public void paint (Graphics g) {
	int a = 0;
	int b = 1;
	int c = a + b;
	
	for(int i = 0; i < 20; i++) {
		g.drawString(""+c,10, 20+(10*i));
		c = a + b;
		a = b;
		b = c;
	}
	
}
}
