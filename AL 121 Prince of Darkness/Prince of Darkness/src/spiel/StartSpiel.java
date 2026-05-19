package spiel;

import karte.Held;

/**
  *
  * Klasse für das Starten des Spiels
  *
  * @version 1.0 vom 16.10.2012
  * @author Tenbusch
  */

public class StartSpiel {

  public static void main(String[] args) {
    Held kitty = new Held("Kitty", "Dämon", "Dschinn der 4. Kategorie", 10, 100, 0, 90);
    Held muffin = new Held("Monstermuffins", "Dämon", "Böses Lebensmittel", 50, 149, 0, 1);
    new PrinceOfDarkness("Prince of Darkness", kitty, muffin);
  }
}
