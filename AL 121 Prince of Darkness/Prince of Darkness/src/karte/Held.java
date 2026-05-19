package karte;

import javax.swing.ImageIcon;

/**
* Die Klasse Held beschreibt einen spielbaren Helden
* mit verschiedenen Eigenschaften wie Leben, Angriff,
* Rüstung und Magieresistenz.
* 
* Außerdem besitzt jeder Held ein Bild.
* 
* @author Ehsanullah Zaini
* @version 1.0 from 19.05.2026
*/
public class Held {
	
	
	// Alle Attribute

	private String name;		// Name des Helden
	private String typ;			// Typ des Helden
	private String beschreibung;	// Beschreibung des Helden
	private int maxLeben;			// Maximale Lebenspunkte
	private int aktLeben;			// Aktuelle Lebenspunkte
	private int angriffswert;		// Angriffsstärke des Helden
	private int ruestung;			// Schutz gegen normalen Schaden
	private int magieresistenz;		// Schutz gegen magischen Schaden
	
	private ImageIcon bild;			// Bild des Helden

	// Konstruktoren
	
	/**
	 * Parameterloser Konstruktor.
	 * Erstellt einen Standard-Helden mit Default-Werten.
	 */
	public Held() {
		// TODO Auto-generated constructor stub
		name = "";
		typ = "";
		beschreibung = "";

		// Standardwerte
		maxLeben = 100;
		aktLeben = maxLeben;

		
		angriffswert = 0;
		ruestung = 0;
		magieresistenz = 0;

		// Leeres Bildobjekt
		bild = new ImageIcon();
	}

	/**
	 * Konstruktor ohne Bildpfad.
	 * Ein Standardbild wird automatisch gesetzt.
	 * 
	 * @param name Name des Helden
	 * @param typ Typ des Helden
	 * @param beschreibung Beschreibung des Helden
	 * @param maxLeben Maximale Lebenspunkte
	 * @param angriffswert Angriffsstärke
	 * @param ruestung Rüstungswert
	 * @param magieresistenz Magieresistenz
	 */
    public Held(String name, String typ, String beschreibung, 
            int maxLeben, int angriffswert, 
            int ruestung, int magieresistenz) {

		// Werte mit Setter-Methoden setzen
        this.setName(name);
		this.setTyp(typ);
		this.setBeschreibung(beschreibung);
		this.setMaxLeben(maxLeben);
		this.setAktLeben(maxLeben);				// Aktuelles Leben startet bei maximalem Leben
        this.setAngriffswert(angriffswert);
		this.setRuestung(ruestung);
		this.setMagieresistenz(magieresistenz);

		// Standardbild setzen
        this.setBild("AL 121 Prince of Darkness/Prince of Darkness/bin/bilder/Kitty.jpg"); // Die Datei hat denselben Namen wie der Kartenname
    }
	
	/**
	 * Vollparametrisierter Konstruktor.
	 * Erstellt einen Helden mit eigenem Bild.
	 * 
	 * @param name Name des Helden
	 * @param typ Typ
	 * @param beschreibung Beschreibung
	 * @param maxLeben Maximale Lebenspunkte
	 * @param angriffswert Angriffsstärke
	 * @param ruestung Rüstungswert
	 * @param magieresistenz Magieresistenz
	 * @param bild Bildpfad des Helden
	 */
	public Held(String name, String typ, String beschreibung, 
            int maxLeben, int angriffswert, 
            int ruestung, int magieresistenz, String bild) {

		// Aufruf des anderen Konstruktors
		this(name, typ, beschreibung, maxLeben, angriffswert, ruestung, magieresistenz);
		this.setBild(bild);			// Eigenes Bild setzen
    }
	
	// Methoden
	
	/**
	* Gibt den Angriffswert für den Angriff zurück.
	* 
	* @return Angriffswert
	*/
	public int angreifen() {
		return this.angriffswert;
	}

	/**
 	* Greift einen anderen Helden an.
	* Der Zielheld verliert Lebenspunkte.
	* 
	* @param ziel Angegriffener Held
	*/
	public void angreifen(Held ziel) {
		ziel.leiden(this.angriffswert);		// Zielheld erhält Schaden
	}

	/**
	* Der Held erhält Schaden.
	* Die Lebenspunkte werden reduziert.
	* 
	* @param schaden Höhe des Schadens
	*/
	public void leiden(int schaden) {
		aktLeben = aktLeben - schaden;		// Schaden vom aktuellen Leben abziehen

		// Leben darf nicht kleiner als 0 werden
		if(aktLeben < 0) {		
			aktLeben = 0;
		}
	}

	/**
	* Heilt den Helden um einen bestimmten Wert.
	*
	* @param wert Heilungswert
	*/
	// Held heilt sich
	public void heilen(int wert) {
		aktLeben = aktLeben + wert;		// Heilung hinzufügen

		// Leben darf nicht über Maximum steigen
		if(aktLeben > maxLeben) {
			aktLeben = maxLeben;
		}
	}
	
	
	// Getter- und Settermethoden

	/**
	* Gibt den Namen zurück.
	* 
	* @return Name des Helden
	*/
	public String getName() {
		return this.name;
	}
	/**
	* Setzt den Namen.
	*
	* @param name Neuer Name
	*/
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	* Gibt den Typ zurück.
	* 
	* @return Typ des Helden
	*/
	public String getTyp() {
		return this.typ;
	}
	/**
	* Setzt den Typ.
	*
	* @param typ Neuer Typ
	*/
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	/**
	* Gibt die Beschreibung zurück.
	* 
	* @return Beschreibung
	*/
	public String getBeschreibung() {
		return this.beschreibung;
	}
	/**
	* Setzt die Beschreibung.
	*
	* @param beschreibung Neue Beschreibung
	*/
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	/**
	* Gibt die maximalen Lebenspunkte zurück.
	* 
	* @return Maximales Leben
	*/
	public int getMaxLeben() {
		return this.maxLeben;
	}
	/**
	* Setzt das maximale Leben.
	*
	* Falls das aktuelle Leben größer ist,
	* wird es automatisch angepasst.
	*
	* @param maxLeben Neues maximales Leben
	*/
	public void setMaxLeben(int maxLeben) {
		this.maxLeben = maxLeben;

		// Aktuelles Leben begrenzen
		if (aktLeben > maxLeben) {
		        aktLeben = maxLeben;
		}
	}
	
	/**
	 * Gibt das aktuelle Leben zurück.
	 * 
	 * @return Aktuelle Lebenspunkte
	 */
	public int getAktLeben() {
		return this.aktLeben;
	}
	/**
	 * Setzt das aktuelle Leben.
	 * 
	 * @param aktLeben Neues aktuelles Leben
	 */
	public void setAktLeben(int aktLeben) {
		this.aktLeben = aktLeben;
	}
	
	/**
	 * Gibt den Angriffswert zurück.
	 * 
	 * @return Angriffswert
	 */
	public int getAngriffswert() {
		return this.angriffswert;
	}
	/**
	 * Setzt den Angriffswert.
	 * 
	 * @param angriffswert Neuer Angriffswert
	 */
	public void setAngriffswert(int angriffswert) {
		this.angriffswert = angriffswert;
	}
	
	/**
	 * Gibt die Rüstung zurück.
	 * 
	 * @return Rüstungswert
	 */
	public int getRuestung() {
		return this.ruestung;
	}
	/**
	 * Setzt die Rüstung.
	 * 
	 * @param ruestung Neuer Rüstungswert
	 */
	public void setRuestung(int ruestung) {
		this.ruestung = ruestung;
	}
	
	/**
	 * Gibt die Magieresistenz zurück.
	 * 
	 * @return Magieresistenz
	 */
	public int getMagieresistenz() {
		return this.magieresistenz;
	}
	/**
	 * Setzt die Magieresistenz.
	 * 
	 * @param magieresistenz Neue Magieresistenz
	 */
	public void setMagieresistenz(int magieresistenz) {
		this.magieresistenz = magieresistenz;
	}
	
	/**
	 * Gibt das Bild des Helden zurück.
	 * 
	 * @return Bildobjekt
	 */
	public ImageIcon getBild() {
		return this.bild;
	}
	/**
	 * Lädt ein Bild über einen Dateipfad.
	 * 
	 * @param bildpfad Pfad zum Bild
	 */
	public void setBild(String bildpfad) {
		this.bild = new ImageIcon(bildpfad);		// Bild aus Datei laden
	}

	/**
	 * Gibt alle Informationen des Helden
	 * als Text zurück.
	 * 
	 * @return Informationen des Helden
	 */
    @Override
	public String toString() {
		return "Held {" + 
			   "\nName: " + name +
				"\nTyp: " + typ +
				"\nLeben: " + aktLeben + "/" + maxLeben +
                "\nAngriffswert: " + angriffswert +
                "\nRuestung: " + ruestung +
                "\nMagieresistenz: " + magieresistenz +
                "\n}";
	}
}
