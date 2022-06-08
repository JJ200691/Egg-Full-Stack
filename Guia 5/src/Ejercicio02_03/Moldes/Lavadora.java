package Ejercicio02_03.Moldes;

public class Lavadora extends Electrodomestico {

    protected double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumoEne, double peso) {
        super(precio, color, consumoEne, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {

        Lavadora x = new Lavadora();
        this.crearElectrodomestico();
        System.out.print("Ingrese la capacidad de carga de la lavadora: ");
        this.carga = leer.nextDouble();
        return x;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio = precio + 500;
        } else if (carga <= 30) {
            precio = precio;
        }
    }

}
