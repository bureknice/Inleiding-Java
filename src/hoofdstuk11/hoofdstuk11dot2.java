package hoofdstuk11;

import java.applet.Applet;
import java.awt.Graphics;

public class hoofdstuk11dot2 extends Applet {

	
	
public void init () {
	
	
}


public void paint (Graphics g) {
	int teller = 21;
	int y = 0;
	
	while(teller > 10) {
	y += 10;
	teller--;
	g.drawString(" " + teller, 0, y);
	}
	
}
}
