package hoofdstuk10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk10dot1 extends Applet {
	TextField tekst;
	Label label;
	double schermgetal = 0;
	

public void init() {

	label = new Label("Schrijf hier je nummer");
	add(label);
	
	tekst = new TextField();
	tekst.addActionListener(new tekstlistener());
	add(tekst);
	
	
	}

public void paint(Graphics g) {
	
	g.drawString("" + schermgetal , 40, 60);
	



	}	

class tekstlistener implements ActionListener {
	public void actionPerformed (ActionEvent e) {
		double input = Double.parseDouble(tekst.getText());
		if ( input > schermgetal) {
			schermgetal = input;
		}
		repaint();
		
	}
}



}
