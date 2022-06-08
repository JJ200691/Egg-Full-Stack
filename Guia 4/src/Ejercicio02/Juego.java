package Ejercicio02;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> x;
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> x, RevolverDeAgua revolver) {
        this.x = x;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getX() {
        return x;
    }

    public void setX(ArrayList<Jugador> x) {
        this.x = x;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "x=" + x + ", revolver=" + revolver + '}';
    }

}
