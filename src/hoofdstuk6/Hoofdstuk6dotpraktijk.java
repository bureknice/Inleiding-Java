package hoofdstuk6;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk6dotpraktijk extends Applet {
	double cijfer1;
	double cijfer2;
	double cijfer3;
	double gemiddelde;
	int gemiddeldeint;
	
public void init() {
	setSize(500,500);
	cijfer1 = 5.9;
	cijfer2 = 6.3;
	cijfer3 = 6.9;
	gemiddelde =(int) ((cijfer1 + cijfer2 + cijfer3) / 3 * 10);
	
	
	}
public void paint (Graphics g){
	g.drawString("Het gemiddelde is: " + gemiddelde / 10, 50, 50) ;
	
	
	}

}
