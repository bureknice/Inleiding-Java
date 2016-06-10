package hoofdstuk11;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofstuk11dotpraktijk extends Applet {
	TextField tekst;
	Button knop;
	Label label;
	int getal;
	String s, scherm = "";
	
	public void init () {
		
	setSize(500,500);
	
	label = new Label("De tafel van uw getal: ");
	add(label);
	
	
	tekst = new TextField("", 20);
	add(tekst);	
	
	
	knop = new Button("Oke");
	add(knop);
	knop.addActionListener(new KnopListener()); 
	}
	
	
	public void paint (Graphics g) {
		g.drawString("" + scherm, 10, 50);
		
	
		
	}

	class KnopListener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	String s = tekst.getText();
	    	getal = Integer.parseInt( s);
	    	if (getal == 0 || getal > 10 ) scherm = "Ongeldige Cijfer";
	    	else if (getal == 1) scherm = "1x1 = 1, 1x2 = 2, 1x3 = 3, 1x4 = 4, 1x5 = 5, 1x6 = 6, 1x7 = 7, 1x8 = 8, 1x9 = 9, 1x10 = 10";
	    	else if (getal == 2) scherm = "2x1 = 2, 2x2 = 4, 2x3 = 6, 2x4 = 8, 2x5 = 10, 2x6 = 12, 2x7 = 14, 2x8 = 16, 2x9 = 18, 2x10 = 20";
	    	else if (getal == 3) scherm = "3x1 = 3, 3x2 = 6, 3x3 = 9, 3x4 = 12, 3x5 = 15, 3x6 = 18, 3x7 = 21, 3x8 = 24, 3x9 = 27, 3x10 = 30";
	    	else if (getal == 4) scherm = "4x1 = 4, 4x2 = 8, 4x3 = 12, 4x4 = 16, 4x5 = 20, 4x6 = 24, 4x7 = 28, 4x8 = 32, 4x9 = 36, 4x10 = 40";
	    	else if (getal == 5) scherm = "5x1 = 5, 5x2 = 10, 5x3 = 15, 5x4 = 20, 5x5 = 25, 5x6 = 30, 5x7 = 35, 5x8 = 40, 5x9 = 45, 5x10 = 50";
	    	else if (getal == 6) scherm = "6x1 = 6, 6x2 = 12, 6x3 = 18, 6x4 = 24, 6x5 = 30, 6x6 = 36, 6x7 = 42, 6x8 = 48, 6x9 = 54, 6x10 = 60";
	    	else if (getal == 7) scherm = "7x1 = 7, 7x2 = 14, 7x3 = 21, 7x4 = 28, 7x5 = 35, 7x6 = 42, 7x7 = 49, 7x8 = 56, 7x9 = 63, 7x10 = 70";
	    	else if (getal == 8) scherm = "8x1 = 8, 8x2 = 16, 8x3 = 24, 8x4 = 32, 8x5 = 40, 8x6 = 48, 8x7 = 56, 8x8 = 64, 8x9 = 72, 8x10 = 80";
	    	else if (getal == 9) scherm = "9x1 = 9, 9x2 = 18, 9x3 = 27, 9x4 = 36, 9x5 = 45, 9x6 = 54, 9x7 = 63, 9x8 = 72, 9x9 = 81, 9x10 = 90";
	    	else if (getal == 10) scherm = "10x1 = 10, 10x2 = 20, 10x3 = 30, 10x4 = 40, 10x5 = 50, 10x6 = 60, 10x7 = 70, 10x8 = 80, 10x9 = 90, 10x10 = 100";
	    	repaint();
	    	
	      }
	}
}
