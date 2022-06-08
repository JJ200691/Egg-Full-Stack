package Ejercicio05;

public class Cuenta {

    private int nroCuenta;
    private long dni;
    private double saldoAct;

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, long dni, double saldoAct) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;
        this.saldoAct = saldoAct;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoAct() {
        return saldoAct;
    }

    public void setSaldoAct(double saldoAct) {
        this.saldoAct = saldoAct;
    }
}
