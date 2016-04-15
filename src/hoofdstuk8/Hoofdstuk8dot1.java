package hoofdstuk8;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.*;
public class Hoofdstuk8dot1 extends Applet {
	private static final long serialVersionUID = 1L;
	
Button knop;
TextField tekst;
Button knop1; 
String schermtekst;

OkListener OkKnop = new OkListener();
ResetListener ResetKnop = new ResetListener();

public void init() {
	knop = new Button("Ok");
	knop1 = new Button("Reset");
	tekst = new TextField(" ");
	
	add(knop);
	add(knop1);
	add(tekst);
	tekst.requestFocus();

	knop.addActionListener(OkKnop);
	knop1.addActionListener(ResetKnop);
	repaint();
	
	schermtekst = "";
	}


	public void paint(Graphics g){
	
		g.drawString(schermtekst, 50, 50);
	
	
	}
	
	class OkListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			schermtekst = tekst.getText();
			repaint();
		}
	}
	
	class ResetListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			schermtekst = " ";
			tekst.setText("");
			repaint();
		}
	}
	
}













