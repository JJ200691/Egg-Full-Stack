package Extra03;

import java.time.LocalDate;

public class Poliza {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private int nroPoliza;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int nroCuotas;
    private Enum formaPago;
    private int montoAsegurado;
    private Boolean granizo;
    private int montoGranizo;
    private Enum tipoCobertura;

    public Poliza(Cliente cliente, Vehiculo vehiculo, int nroPoliza, LocalDate fechaInicio, LocalDate fechaFin, int nroCuotas, Enum formaPago, int montoAsegurado, Boolean granizo, int montoGranizo, Enum tipoCobertura) {
    }

    public Poliza() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNroCuotas() {
        return nroCuotas;
    }

    public void setNroCuotas(int nroCuotas) {
        this.nroCuotas = nroCuotas;
    }

    public Enum getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(Enum formaPago) {
        this.formaPago = formaPago;
    }

    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(int montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public int getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(int montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public Enum getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(Enum tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", nroPoliza=" + nroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", nroCuotas=" + nroCuotas + ", formaPago=" + formaPago + ", montoAsegurado=" + montoAsegurado + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }

}
