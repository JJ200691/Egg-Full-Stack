package Extra01.Moldes;

import java.time.LocalDate;

public class Velero extends Barco {

    protected int nroMastiles;

    public Velero() {
    }

    public Velero(int nroMastiles, String matricula, int eslora, int añoFabricacion, String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        super(matricula, eslora, añoFabricacion, nombre, dni, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return super.toString() + "Velero{" + "nroMastiles=" + nroMastiles + '}';
    }

    @Override
    public long calcularAlquiler() {
        long formula = super.calcularAlquiler();
        return formula + nroMastiles;
    }

    public Velero crearVelero() {
        super.crearBarco();
        System.out.print("Ingrese numero de mastiles: ");
        nroMastiles = leer.nextInt();
        return new Velero(nroMastiles, matricula, eslora, añoFabricacion, nombre, dni, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
    }

}
