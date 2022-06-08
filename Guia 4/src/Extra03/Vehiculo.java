package Extra03;

public class Vehiculo {

    private String marca;
    private String modelo;
    private int anio;
    private int nroMotor;
    private int nroChasis;
    private Enum color;
    private Enum tipo;

    public Vehiculo(String marca, String modelo, int anio, int nroMotor, int nroChasis, Enum color, Enum tipo) {
    }

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNroMotor() {
        return nroMotor;
    }

    public void setNroMotor(int nroMotor) {
        this.nroMotor = nroMotor;
    }

    public int getNroChasis() {
        return nroChasis;
    }

    public void setNroChasis(int nroChasis) {
        this.nroChasis = nroChasis;
    }

    public Enum getColor() {
        return color;
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", nroMotor=" + nroMotor + ", nroChasis=" + nroChasis + ", color=" + color + ", tipo=" + tipo + '}';
    }

}
