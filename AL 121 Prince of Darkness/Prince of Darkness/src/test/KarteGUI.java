package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import karte.Held;
import karte.Karte;

/**
  *
  * GUI-Klasse zum testweisen Anzeigen einer Karte
  *
  * @version 1.0 from 19.10.2012
  * @author Tenbusch
  */

public class KarteGUI extends JFrame {
  // Anfang Attribute
  Held h = new Held("Kitty", "D�mon", "Mistvieh", 25, 75, 50, 50);
  Karte k = new Karte(h);
  // Ende Attribute

  public KarteGUI (String title) {
    super (title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 500;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    Container cp = getContentPane();
    cp.setLayout(new BorderLayout());
    cp.add(k, BorderLayout.CENTER);
    // Anfang Komponenten


    JPanel p = new JPanel(new BorderLayout(10, 10));

    //KOPFZEILE
    JPanel kopfzeile = new JPanel(new BorderLayout());
    p.add(kopfzeile, BorderLayout.NORTH);

    JLabel heldName = new JLabel();




    // Ende Komponenten
    setResizable(true);
    setVisible(true);
  }

  // Anfang Methoden
  // Ende Methoden

  public static void main(String[] args) {
    new KarteGUI("KarteGUI");
  }
}
