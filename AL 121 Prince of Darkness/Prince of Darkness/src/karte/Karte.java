package karte;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

/**
 * Die Klasse Karte stellt einen Helden grafisch
 * als Spielkarte dar.
 * 
 * Eine Karte enthält:
 * Kopfzeile mit Name und Typ
 * Bild des Helden
 * Beschreibung
 * Werte wie Leben, Angriff und Rüstung
 * 
 * Die Klasse erweitert JPanel und kann dadurch
 * direkt in Swing-Fenstern verwendet werden.
 * 
 * @author Ahmet Zafer und Kommentare von Ehsanullah Zaini
 * @version 1.0 vom 18.05.2026
 */
public class Karte extends JPanel {

    private Held held;        // Der Held, der auf der Karte dargestellt wird

     /**
     * Konstruktor der Klasse Karte.
     * Erstellt eine grafische Karte für einen Helden.
     * 
     * @param held Der darzustellende Held
     */
    public Karte(Held held){
        this.setHeld(held);        // Helden speichern
        this.setLayout(new BorderLayout(10, 10));         // Layout des Hauptpanels festlegen
        this.setBackground(Color.GRAY);            // Hintergrundfarbe der Karte

        //KOPFZEILE    Panel für Name und Typ
        JPanel kopfzeilePnl = new JPanel(new BorderLayout(10, 10));  
        kopfzeilePnl.setBackground(Color.RED);
        this.add(kopfzeilePnl, BorderLayout.NORTH);        // Kopfzeile oben einfügen

        JLabel heldName = new JLabel(held.getName());         // Name des Helden anzeigen
        heldName.setAlignmentX(JLabel.LEFT_ALIGNMENT);         // Text links ausrichten
        kopfzeilePnl.add(heldName, BorderLayout.WEST);         // Label links hinzufügen

        JLabel heldTyp = new JLabel(held.getTyp());        // Typ des Helden anzeigen
        heldTyp.setAlignmentX(JLabel.RIGHT_ALIGNMENT);         // Text rechts ausrichten
        kopfzeilePnl.add(heldTyp, BorderLayout.EAST);         // Label rechts hinzufügen
        // ENDE KOPFZEILE
       

        //BILD:         Panel für das Heldenbild
        JPanel bildPnl = new JPanel();
        bildPnl.setBackground(Color.RED);    
        bildPnl.add(new JLabel(held.getBild()));        // Bild des Helden hinzufügen
        this.add(bildPnl, BorderLayout.CENTER);        // Bild in die Mitte der Karte setzen
        //ENDE BILD


        //INFOPANEL:    Hauptpanel für Beschreibung und Werte
        JPanel infoPnl = new JPanel(new BorderLayout(10, 10));
        infoPnl.setBackground(Color.RED);
        //Beschreibung
        JPanel beschreibungPnl = new JPanel();
        beschreibungPnl.setBackground(Color.RED);
        JLabel beschreibung = new JLabel(held.getBeschreibung());        // Beschreibung des Helden
        beschreibungPnl.add(beschreibung);        // Beschreibung hinzufügen
        infoPnl.add(beschreibungPnl, BorderLayout.NORTH);        // Beschreibung oben im Infopanel anzeigen

        infoPnl.add(beschreibungPnl, BorderLayout.NORTH);

        //Stats        Panel für die Werte des Helden
        JPanel statsPnl = new JPanel();
        statsPnl.setBackground(Color.RED);
        statsPnl.setLayout(new BoxLayout(statsPnl, BoxLayout.Y_AXIS));        // Elemente untereinander anordnen

        // Lebenspunkte anzeigen
        JLabel lebenLbl = new JLabel("Leben: " + held.getMaxLeben());         
        statsPnl.add(lebenLbl);

        // Rüstung anzeigen
        JLabel ruestungLbl = new JLabel("Ruestung: " + held.getRuestung());
        statsPnl.add(ruestungLbl);

        // Magieresistenz anzeigen
        JLabel magieresistenzLbl = new JLabel("Magieresistenz: " + held.getMagieresistenz());
        statsPnl.add(magieresistenzLbl);

        // Angriffswert anzeigen
        JLabel angriffLbl = new JLabel("Angriffswert: " + held.getAngriffswert());
        statsPnl.add(angriffLbl);
        infoPnl.add(statsPnl, BorderLayout.CENTER);        // Wertepanel in die Mitte setzen
        //ENDE STATS
        //ENDE INFOPANEL


        this.add(infoPnl, BorderLayout.SOUTH);
        // Ende Komponenten
    }

    /**
     * Gibt den Helden der Karte zurück.
     * 
     * @return Held der Karte
     */
    public Held getHeld(){
        return this.held;
    }
    /**
     * Setzt den Helden der Karte.
     * 
     * @param held Neuer Held
     */
    public void setHeld(Held held){
        this.held = held;
    }
}
