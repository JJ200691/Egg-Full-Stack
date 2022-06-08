package Extra01.Moldes;

import java.time.LocalDate;

public class Yate extends BarcoMotor {

    protected int nroCamarotes;

    public Yate() {
    }

    public Yate(int nroCamarotes, int potenciaCV, String matricula, int eslora, int añoFabricacion, String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        super(potenciaCV, matricula, eslora, añoFabricacion, nombre, dni, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.nroCamarotes = nroCamarotes;
    }

    public int getNroCamarotes() {
        return nroCamarotes;
    }

    public void setNroCamarotes(int nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    @Override
    public String toString() {
        return super.toString() + "Yate{" + "nroCamarotes=" + nroCamarotes + '}';
    }

    @Override
    public long calcularAlquiler() {
        long formula = super.calcularAlquiler();
        return formula + (super.potenciaCV + nroCamarotes);
    }

    public Yate crearYate() {
        super.crearBarcoMotor();
        System.out.print("Ingrese el numero de camarotes: ");
        nroCamarotes = leer.nextInt();
        return new Yate(nroCamarotes, potenciaCV, matricula, eslora, añoFabricacion, nombre, dni, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
    }

}
