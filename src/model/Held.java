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
	
	private Bild bild;
	
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
		bild = new Bild();
	}
	
	// Vollparametrisierter Konstruktor
	public Held(String name, String typ, String beschreibung, 
				int maxLeben, int angriffswert, int ruestung, int magieresistenz, Bild bild) {
		
		this.name = name;
		this.typ = typ;
		this.beschreibung = beschreibung;
		this.maxLeben = maxLeben;
		this.aktLeben = maxLeben;
		this.angriffswert = angriffswert;
		this.ruestung = ruestung;
		this.magieresistenz = magieresistenz;
		this.bild = bild;
	}
	
	// Methoden
	
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
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	
	
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	
	public int getMaxLeben() {
		return maxLeben;
	}
	public void setMaxLeben(int maxLeben) {
		this.maxLeben = maxLeben;
		
		if (aktLeben > maxLeben) {
		        aktLeben = maxLeben;
		}
	}
	
	
	public int getAktLeben() {
		return aktLeben;
	}
	public void setAktLeben(int aktLeben) {
		this.aktLeben = aktLeben;
	}
	
	
	public int getAngriffswert() {
		return angriffswert;
	}
	public void setAngriffswert(int angriffswert) {
		this.angriffswert = angriffswert;
	}
	
	
	public int getRuestung() {
		return ruestung;
	}
	public void setRuestung(int ruestung) {
		this.ruestung = ruestung;
	}
	
	
	public int getMagieresistenz() {
		return magieresistenz;
	}
	public void setMagieresistenz(int magieresistenz) {
		this.magieresistenz = magieresistenz;
	}
	
	
	public Bild getBild() {
		return bild;
	}
	public void setBild(Bild bild) {
		this.bild = bild;
	}
	
	
	@Override
	public String toString() {
		return "Held {" + " Name= '" + name + '\'' + 
				", Typ= '" + typ + '\'' + 
				", Aktuelles Leben= " + aktLeben +
                "/" + maxLeben +
                ", Angriffswert= " + angriffswert +
                ", Ruestung= " + ruestung +
                ", Magieresistenz=" + magieresistenz +
                '}';
	}
	
	
}
