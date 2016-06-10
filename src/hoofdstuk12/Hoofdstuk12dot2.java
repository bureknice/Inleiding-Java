package hoofdstuk12;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk12dot2 {

Button[] knoppen = new Button[25];
	
    public void init() {
    	for(int i = 0; i < knoppen.length; i++) {
    		knoppen[i] = new Button("Knop "+(i+1));
    		add(knoppen[i]);
    	}
    }

    public void paint(Graphics g) {
    	
    }

}

