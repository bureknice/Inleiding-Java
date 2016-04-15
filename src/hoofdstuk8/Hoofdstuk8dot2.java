package hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Hoofdstuk8dot2 extends Applet {
	Button knop;
	Button knop2;
	Button knop3;
	Button knop4;
	int mannen = 0;
	int vrouwen = 0;
	int mLeerling = 0;
	int vLeerling = 0;
	String schermMan = "Aantal mannen: ";
	String schermVrouw = "Aantal vrouwen: ";
	String schermMleerling = "Aantal Mannelijke Leerlingen: ";
	String schermVleerling = "Aantal Vrouwelijke Leerlingen: ";
	
public void init() {
	setSize(500,500);
	knop = new Button("Mannelijk");
	knop2 = new Button("Vrouwelijk");
	knop3 = new Button("Mannelijke Leerlingen");
	knop4 = new Button("Vrouwelijke Leerlingen");

	
	knop.addActionListener(new ManKnopListener());
	knop2.addActionListener(new VrouwKnopListener());
	knop3.addActionListener(new mLeerlingListener());
	knop4.addActionListener(new vLeerlingListener());
	
	add (knop);
	add (knop2);
	add (knop3);
	add (knop4);
	
}
	
 class ManKnopListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    	mannen++;
        repaint();
    }
 }
 
 class VrouwKnopListener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	vrouwen++;
	        repaint();
	    }
	 }
 
 class mLeerlingListener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	mLeerling++;
	        repaint();
	    }
 	}

 class vLeerlingListener implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	    	vLeerling++;
	        repaint();
	    }
	 }

 public void paint(Graphics g) {

	 g.drawString(schermMan + mannen , 30, 80);
	 g.drawString(schermVrouw + vrouwen , 30, 100);
	 g.drawString(schermMleerling + mLeerling , 30, 120);
	 g.drawString(schermVleerling + vLeerling , 30, 140);
	 g.drawString("Totaal: "+(mannen + vrouwen + mLeerling + vLeerling ), 30, 160);
 		}
}
