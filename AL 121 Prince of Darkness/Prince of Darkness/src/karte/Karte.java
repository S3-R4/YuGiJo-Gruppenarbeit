package karte;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class Karte extends JPanel {

    private Held held;

    public Karte(Held held){
        this.setHeld(held);
        this.setLayout(new BorderLayout(10, 10));
        this.setBackground(Color.GRAY);

        //KOPFZEILE
        JPanel kopfzeilePnl = new JPanel(new BorderLayout(10, 10));
        kopfzeilePnl.setBackground(Color.RED);
        this.add(kopfzeilePnl, BorderLayout.NORTH);

        JLabel heldName = new JLabel(held.getName());
        heldName.setAlignmentX(JLabel.LEFT_ALIGNMENT);
        kopfzeilePnl.add(heldName, BorderLayout.WEST);

        JLabel heldTyp = new JLabel(held.getTyp());
        heldTyp.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
        kopfzeilePnl.add(heldTyp, BorderLayout.EAST);
        // ENDE KOPFZEILE
       

        //BILD:
        JPanel bildPnl = new JPanel();
        bildPnl.setBackground(Color.RED);
        bildPnl.add(new JLabel(held.getBild()));
        this.add(bildPnl, BorderLayout.CENTER);
        //ENDE BILD


        //INFOPANEL:
        JPanel infoPnl = new JPanel(new BorderLayout(10, 10));
        infoPnl.setBackground(Color.RED);
        //Beschreibung
        JPanel beschreibungPnl = new JPanel();
        beschreibungPnl.setBackground(Color.RED);
        JLabel beschreibung = new JLabel(held.getBeschreibung());
        beschreibungPnl.add(beschreibung);
        infoPnl.add(beschreibungPnl, BorderLayout.NORTH);

        infoPnl.add(beschreibungPnl, BorderLayout.NORTH);

        //Stats
        JPanel statsPnl = new JPanel();
        statsPnl.setBackground(Color.RED);
        statsPnl.setLayout(new BoxLayout(statsPnl, BoxLayout.Y_AXIS));
        JLabel lebenLbl = new JLabel("Leben: " + held.getMaxLeben());
        statsPnl.add(lebenLbl);

        JLabel ruestungLbl = new JLabel("Ruestung: " + held.getRuestung());
        statsPnl.add(ruestungLbl);

        JLabel magieresistenzLbl = new JLabel("Magieresistenz: " + held.getMagieresistenz());
        statsPnl.add(magieresistenzLbl);

        JLabel angriffLbl = new JLabel("Angriffswert: " + held.getAngriffswert());
        statsPnl.add(angriffLbl);
        infoPnl.add(statsPnl, BorderLayout.CENTER);
        //ENDE STATS
        //ENDE INFOPANEL


        this.add(infoPnl, BorderLayout.SOUTH);
        // Ende Komponenten
    }

    public Held getHeld(){
        return this.held;
    }
    public void setHeld(Held held){
        this.held = held;
    }
}
