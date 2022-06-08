package Ejercicio03;

import java.util.HashSet;

public class Baraja {

    private HashSet<Carta> baraja = new HashSet();

    public Baraja() {
    }

    public HashSet<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(HashSet<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }

}
