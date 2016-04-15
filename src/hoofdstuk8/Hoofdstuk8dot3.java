package hoofdstuk8;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk8dot3 extends Applet {
	Button knop;
	TextField tekst;
	Label label;
	String bedrag;
	double getal;

public void init() {
	setSize(500,500);
	label = new Label("Bereken uw prijs inclusief BTW: ");
	add(label);
	
	tekst = new TextField("Bedrag");
	add(tekst);
	
	knop = new Button("Ok");
	knop.addActionListener(new KnopListener());
	add(knop);
	
	bedrag = "";
	}

public void paint (Graphics g) {
	g.drawString("Uw prijs inclusief BTW = " + getal, 30, 80);
	}

class KnopListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	getal = Double.parseDouble(tekst.getText());
    	getal = getal * 1.21;
    	repaint();
    	
      }
 }
}