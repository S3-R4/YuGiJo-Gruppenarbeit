package karte;

import java.awt.BorderLayout;
import javax.swing.*;

public class Karte extends JPanel {

    private Held held;

    public Karte(Held held){
        this.setHeld(held);
        this.setLayout(new BorderLayout(10, 10));

        //KOPFZEILE
        JPanel kopfzeilePnl = new JPanel(new BorderLayout());
        this.add(kopfzeilePnl, BorderLayout.NORTH);

        JLabel heldName = new JLabel(held.getName());
        kopfzeilePnl.add(heldName, BorderLayout.WEST);

        JLabel heldTyp = new JLabel(held.getTyp());
        kopfzeilePnl.add(heldTyp, BorderLayout.EAST);
        // ENDE KOPFZEILE
       

        //BILD:
        JPanel bildPnl = new JPanel();
        bildPnl.add(new JLabel(held.getBild()));
        this.add(bildPnl, BorderLayout.CENTER);
        //ENDE BILD


        //INFOPANEL:
        JPanel infoPnl = new JPanel(new BorderLayout());
        //Beschreibung
        JLabel beschreibung = new JLabel(held.getBeschreibung());
        infoPnl.add(beschreibung, BorderLayout.NORTH);

        //Stats
        JPanel statsPnl = new JPanel();
        statsPnl.setLayout(new BoxLayout(statsPnl, BoxLayout.Y_AXIS));
        JLabel lebenLbl = new JLabel("" + held.getMaxLeben());
        statsPnl.add(lebenLbl);

        JLabel ruestungLbl = new JLabel("" + held.getRuestung());
        statsPnl.add(ruestungLbl);

        JLabel magieresistenzLbl = new JLabel("" + held.getMagieresistenz());
        statsPnl.add(magieresistenzLbl);

        JLabel angriffLbl = new JLabel("" + held.getAngriffswert());
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
