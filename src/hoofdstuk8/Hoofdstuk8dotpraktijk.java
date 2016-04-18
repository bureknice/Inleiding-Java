package hoofdstuk8;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk8dotpraktijk extends Applet {
	Button keer;
	Button delen;
	Button plus;
	Button min;
	TextField tekst;
	TextField tekst2;
	double getal;
	double getal2;
	double uitkomst;
	
public void init() {
	setSize(500,500);
	
	tekst = new TextField("                 ");
	add (tekst);
	
	tekst2 = new TextField("                ");
	add (tekst2);
	
	keer = new Button("*");
	keer.addActionListener(new keerlistener());
	add (keer);
	
	delen = new Button("/");
	delen.addActionListener(new delenlistener());
	add (delen);
	
	plus = new Button("+");
	plus.addActionListener(new pluslistener());
	add (plus);
	
	min = new Button("-");
	min.addActionListener(new minlistener());
	add (min);
	
		
	}

public void paint(Graphics g) {
	
	
	}

	class keerlistener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getal2 = Double.parseDouble(tekst2.getText());
			getal = Double.parseDouble(tekst.getText());
			uitkomst = getal * getal2;
			tekst.setText(""  + uitkomst);
			tekst2.setText("");
			}
	}

	class delenlistener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getal2 = Double.parseDouble(tekst2.getText());
			getal = Double.parseDouble(tekst.getText());
			uitkomst = getal / getal2;
			tekst.setText(""  + uitkomst);
			tekst2.setText("");
    		}
	}

	class pluslistener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getal2 = Double.parseDouble(tekst2.getText());
			getal = Double.parseDouble(tekst.getText());
			uitkomst = getal + getal2;
			tekst.setText(""  + uitkomst);
			tekst2.setText("");
			}
	}

	class minlistener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			getal2 = Double.parseDouble(tekst2.getText());
			getal = Double.parseDouble(tekst.getText());
			uitkomst = getal - getal2;
			tekst.setText(""  + uitkomst);
			tekst2.setText("");
			}
	}

}
