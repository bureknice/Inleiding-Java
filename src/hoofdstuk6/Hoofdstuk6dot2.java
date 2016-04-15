package hoofdstuk6;

import java.applet.Applet;
import java.awt.Graphics;

public class Hoofdstuk6dot2 extends Applet {
	int uur;
	int dag;
	int jaar;
	int minuut;
	int uitkomst;
	
public void init() {
	minuut = 60;
	uur = minuut * 60;
	dag = uur * 24;
	jaar = dag * 365;
	setSize(500,500);
	}

public void paint(Graphics g) {
	g.drawString("Aantal seconden in minuut = " + minuut,50 ,50);
	g.drawString("Aantal seconden in uur = " + uur , 50, 65);
	g.drawString("Aantal seconden in dag = " + dag , 50, 80);
	g.drawString("Aantal seconden in jaar = " + jaar , 50, 95);
	}
}
