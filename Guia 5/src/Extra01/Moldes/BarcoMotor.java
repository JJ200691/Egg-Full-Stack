package Extra01.Moldes;

import java.time.LocalDate;

public class BarcoMotor extends Barco {

    protected int potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV, String matricula, int eslora, int añoFabricacion, String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        super(matricula, eslora, añoFabricacion, nombre, dni, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return super.toString() + "BarcoMotor{" + "potenciaCV=" + potenciaCV + '}';
    }

    @Override
    public long calcularAlquiler() {
        long formula = super.calcularAlquiler();
        return formula + potenciaCV;
    }

    public BarcoMotor crearBarcoMotor() {
        super.crearBarco();
        System.out.print("Ingrese la potencia: ");
        potenciaCV = leer.nextInt();
        return new BarcoMotor(potenciaCV, matricula, eslora, añoFabricacion, nombre, dni, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
    }

}
