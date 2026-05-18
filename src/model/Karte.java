package model;

public class Karte {
    private Held held;

    public Karte(Held held){
        this.setHeld(held);
    }

    //KartenGui muss noch gebaut werden.

    public Held getHeld(){
        return this.held;
    }
    public void setHeld(Held held){
        this.held = held;
    }
}
