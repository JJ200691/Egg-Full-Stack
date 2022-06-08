package Extra03;

import java.time.LocalDate;

public class Cuota {

    private int nroCuota;
    private int montoTotal;
    private Boolean pago;
    private LocalDate fechaVenc;
    private Enum formaPago;

    public Cuota(int nroCuota, int montoTotal, Boolean pago, LocalDate fechaVenc, Enum formaPago) {
    }

    public Cuota() {
    }

    public int getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public Enum getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(Enum formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "nroCuota=" + nroCuota + ", montoTotal=" + montoTotal + ", pago=" + pago + ", fechaVenc=" + fechaVenc + ", formaPago=" + formaPago + '}';
    }

}
