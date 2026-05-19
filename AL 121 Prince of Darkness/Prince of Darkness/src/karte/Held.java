package karte;

import javax.swing.ImageIcon;

/**
* Die Klasse Held enthählt die Daten eines Heldes.
* @author Ehsanullah Zaini
* @version 1.0 from 19.05.2026
*/
public class Held {
	
	
	// Alle Attribute
	private String name;
	private String typ;
	private String beschreibung;
	private int maxLeben;
	private int aktLeben;
	private int angriffswert;
	private int ruestung;
	private int magieresistenz;
	
	private ImageIcon bild;
	
	// Parameterloser Konstruktor
	public Held() {
		// TODO Auto-generated constructor stub
		name = "";
		typ = "";
		beschreibung = "";
		maxLeben = 100;
		aktLeben = maxLeben;
		angriffswert = 0;
		ruestung = 0;
		magieresistenz = 0;
		bild = new ImageIcon();
	}

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
	* @param
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
	// Greift einen anderen Helden an
	public void angreifen(Held ziel) {
		ziel.leiden(this.angriffswert);
	}

	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
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
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
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
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public String getName() {
		return this.name;
	}
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public String getTyp() {
		return this.typ;
	}
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public String getBeschreibung() {
		return this.beschreibung;
	}
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public int getMaxLeben() {
		return this.maxLeben;
	}
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
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
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public int getAktLeben() {
		return this.aktLeben;
	}
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public void setAktLeben(int aktLeben) {
		this.aktLeben = aktLeben;
	}
	
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public int getAngriffswert() {
		return this.angriffswert;
	}
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public void setAngriffswert(int angriffswert) {
		this.angriffswert = angriffswert;
	}
	
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public int getRuestung() {
		return this.ruestung;
	}
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public void setRuestung(int ruestung) {
		this.ruestung = ruestung;
	}
	
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public int getMagieresistenz() {
		return this.magieresistenz;
	}
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public void setMagieresistenz(int magieresistenz) {
		this.magieresistenz = magieresistenz;
	}
	
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public ImageIcon getBild() {
		return this.bild;
	}
	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
	* @return
	*/
	public void setBild(String bildpfad) {
		this.bild = new ImageIcon(bildpfad);
	}

	/**
	* Held hat die Eigenschaft zu angreifen. Gibt den Angriffswert für den Angriff zurück.
	* @param
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
