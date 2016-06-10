package hoofdstuk11;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk11dot1 extends Applet {
	
	
	

public void init (){
	
	
	
}


public void paint (Graphics g) {
    int teller = 0;
    int y = 0;
	
    while(teller < 10) {
        y += 20;
        g.drawLine(y , 50, y, 300 );
        teller++;
    }


	}
}
