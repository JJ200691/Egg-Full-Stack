package Extra02.Moldes;

public class Polideportivo extends Edificio {

    protected String nombre;
    protected Enum instalacion;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Enum instalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Enum getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Enum instalacion) {
        this.instalacion = instalacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Polideportivo{" + "nombre=" + nombre + ", instalacion=" + instalacion + '}';
    }

    @Override
    public void calcularVolumen() {
        super.calcularVolumen();
    }

    @Override
    public void calcularSuperficie() {
        super.calcularSuperficie();
    }

}
