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
	 * @param typ Typ/Klasse des Helden
	 * @param beschreibung Beschreibung des Helden
	 * @param maxLeben Maximale Lebenspunkte
	 * @param angriffswert Angriffsstärke
	 * @param ruestung Rüstungswert
	 * @param magieresistenz Magieresistenz
	 */
    public Held(String name, String typ, String beschreibung, 
            int maxLeben, int angriffswert, 
            int ruestung, int magieresistenz) {

        this.setName(name);
		this.setTyp(typ);
		this.setBeschreibung(beschreibung);
		this.setMaxLeben(maxLeben);
		this.setAktLeben(maxLeben);
        this.setAngriffswert(angriffswert);
		this.setRuestung(ruestung);
		this.setMagieresistenz(magieresistenz);
        this.setBild("AL 121 Prince of Darkness/Prince of Darkness/bin/bilder/Kitty.jpg"); // Die Datei hat denselben Namen wie der Kartenname
    }
	
	// Vollparametrisierter Konstruktor
	public Held(String name, String typ, String beschreibung, 
            int maxLeben, int angriffswert, 
            int ruestung, int magieresistenz, String bild) {

		this(name, typ, beschreibung, maxLeben, angriffswert, ruestung, magieresistenz);
		this.setBild(bild);
    }
	
	// Methoden
	
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* 
	* @return
	*/
	public int angreifen() {
		return this.angriffswert;
	}

	/**
 	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public void angreifen(Held ziel) {
		ziel.leiden(this.angriffswert);
	}

	/**
	*
	* @param
	* @return
	*/
	// Held erhält Schaden
	public void leiden(int schaden) {
		aktLeben = aktLeben - schaden;
		
		if(aktLeben < 0) {
			aktLeben = 0;
		}
	}

	/**
	*
	* @param
	* @return
	*/
	// Held heilt sich
	public void heilen(int wert) {
		aktLeben = aktLeben + wert;
		
		if(aktLeben > maxLeben) {
			aktLeben = maxLeben;
		}
	}
	
	
	// Getter- und Settermethoden

	/**
	*
	* 
	* @return
	*/
	public String getName() {
		return this.name;
	}
	/**
	*
	* @param
	* @return
	*/
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	*
	* 
	* @return
	*/
	public String getTyp() {
		return this.typ;
	}
	/**
	*
	* @param
	* @return
	*/
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	/**
	*
	* 
	* @return
	*/
	public String getBeschreibung() {
		return this.beschreibung;
	}
	/**
	*
	* @param
	* @return
	*/
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	/**
	*
	* 
	* @return
	*/
	public int getMaxLeben() {
		return this.maxLeben;
	}
	/**
	*
	* @param
	* @return
	*/
	public void setMaxLeben(int maxLeben) {
		this.maxLeben = maxLeben;
		
		if (aktLeben > maxLeben) {
		        aktLeben = maxLeben;
		}
	}
	
	/**
	*
	* 
	* @return
	*/
	public int getAktLeben() {
		return this.aktLeben;
	}
	/**
	*
	* @param
	* @return
	*/
	public void setAktLeben(int aktLeben) {
		this.aktLeben = aktLeben;
	}
	
	/**
	*
	* 
	* @return
	*/
	public int getAngriffswert() {
		return this.angriffswert;
	}
	/**
	*
	* @param
	* @return
	*/
	public void setAngriffswert(int angriffswert) {
		this.angriffswert = angriffswert;
	}
	
	/**
	*
	* 
	* @return
	*/
	public int getRuestung() {
		return this.ruestung;
	}
	/**
	*
	* @param
	* @return
	*/
	public void setRuestung(int ruestung) {
		this.ruestung = ruestung;
	}
	
	/**
	*
	* 
	* @return
	*/
	public int getMagieresistenz() {
		return this.magieresistenz;
	}
	/**
	*
	* @param
	* @return
	*/
	public void setMagieresistenz(int magieresistenz) {
		this.magieresistenz = magieresistenz;
	}
	
	/**
	*
	* 
	* @return
	*/
	public ImageIcon getBild() {
		return this.bild;
	}
	/**
	*
	* @param
	* @return
	*/
	public void setBild(String bildpfad) {
		this.bild = new ImageIcon(bildpfad);
	}

	/**
	*
	* 
	* @return
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
