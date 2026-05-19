package karte;

import javax.swing.ImageIcon;

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
	
	// Konstruktor
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
	
	// Gibt den Angriffswert fr den Angriff zurck
	public int angreifen() {
		return this.angriffswert;
	}

	// Greift einen anderen Helden an
	public void angreifen(Held ziel) {
		ziel.leiden(this.angriffswert);
	}
	
	// Held erhält Schaden
	public void leiden(int schaden) {
		aktLeben = aktLeben - schaden;
		
		if(aktLeben < 0) {
			aktLeben = 0;
		}
	}
	
	// Held heilt sich
	public void heilen(int wert) {
		aktLeben = aktLeben + wert;
		
		if(aktLeben > maxLeben) {
			aktLeben = maxLeben;
		}
	}
	
	
	// Getter- und Settermethoden
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getTyp() {
		return this.typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	
	public String getBeschreibung() {
		return this.beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	
	public int getMaxLeben() {
		return this.maxLeben;
	}
	public void setMaxLeben(int maxLeben) {
		this.maxLeben = maxLeben;
		
		if (aktLeben > maxLeben) {
		        aktLeben = maxLeben;
		}
	}
	
	
	public int getAktLeben() {
		return this.aktLeben;
	}
	public void setAktLeben(int aktLeben) {
		this.aktLeben = aktLeben;
	}
	
	
	public int getAngriffswert() {
		return this.angriffswert;
	}
	public void setAngriffswert(int angriffswert) {
		this.angriffswert = angriffswert;
	}
	
	
	public int getRuestung() {
		return this.ruestung;
	}
	public void setRuestung(int ruestung) {
		this.ruestung = ruestung;
	}
	
	
	public int getMagieresistenz() {
		return this.magieresistenz;
	}
	public void setMagieresistenz(int magieresistenz) {
		this.magieresistenz = magieresistenz;
	}
	
	
	public ImageIcon getBild() {
		return this.bild;
	}
	public void setBild(String bildpfad) {
		this.bild = new ImageIcon(bildpfad);
	}
	
    @Override
    public String toString() {
        return "Held{" +
                "name='" + name + '\'' +
                ", typ='" + typ + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", maxLeben=" + maxLeben +
                ", aktLeben=" + aktLeben +
                ", angriffswert=" + angriffswert +
                ", ruestung=" + ruestung +
                ", magieresistenz=" + magieresistenz +
                ", bild=" + bild +
                '}';
    }	
}
