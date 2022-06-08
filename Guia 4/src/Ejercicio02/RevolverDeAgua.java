package Ejercicio02;

public class RevolverDeAgua {

    private int posActual;
    private int posAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }

}
