package Ejercicio06;

public class Cafetera {

    private double cantAct;
    private double cantMax;

    public Cafetera() {
    }

    public Cafetera(double cantAct, double cantMax) {
        this.cantAct = cantAct;
        this.cantMax = cantMax;
    }

    public double getCantAct() {
        return cantAct;
    }

    public void setCantAct(double cantAct) {
        this.cantAct = cantAct;
    }

    public double getCantMax() {
        return cantMax;
    }

    public void setCantMax(double cantMax) {
        this.cantMax = cantMax;
    }
}
