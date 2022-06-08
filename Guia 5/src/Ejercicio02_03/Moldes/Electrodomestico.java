package Ejercicio02_03.Moldes;

import java.util.Scanner;

public abstract class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected double precio;
    protected String color;
    protected char consumoEne;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEne, double peso) {
        this.precio = 1000;
        this.color = color;
        this.consumoEne = consumoEne;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEne() {
        return consumoEne;
    }

    public void setConsumoEne(char consumoEne) {
        this.consumoEne = consumoEne;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "leer=" + leer + ", precio=" + precio + ", color=" + color + ", consumoEne=" + consumoEne + ", peso=" + peso + '}';
    }

    private void comprobarConsumoEnergetico(char consumoEne) {

        Character.toUpperCase(consumoEne);
        if (consumoEne == 'A' || consumoEne == 'B' || consumoEne == 'C' || consumoEne == 'D' || consumoEne == 'E' || consumoEne == 'F') {
            this.consumoEne = consumoEne;
        } else {
            this.consumoEne = 'F';
        }
    }

    private void comprobarColor(String color) {

        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            this.color = color;
        } else {
            this.color = "blanco";
        }
    }

    public void crearElectrodomestico() {

        System.out.print("Ingrese el consumo energético del electrodoméstico: ");
        consumoEne = leer.next().charAt(0);
        this.comprobarConsumoEnergetico(consumoEne);
        System.out.print("Ingrese el color del electrodoméstico: ");
        color = leer.next();
        this.comprobarColor(color);
        System.out.print("Ingrese el peso del electrodoméstico: ");
        peso = leer.nextDouble();
    }

    public void precioFinal() {

        switch (consumoEne) {
            case 'A':
                precio = precio + 1000;
                break;
            case 'B':
                precio = precio + 800;
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 500;
                break;
            case 'E':
                precio = precio + 300;
                break;
            case 'F':
                precio = precio + 100;
                break;
        }
        if (peso >= 1 && peso <= 19) {
            precio = precio + 100;
        } else if (peso >= 20 && peso <= 49) {
            precio = precio + 500;
        } else if (peso >= 50 && peso <= 79) {
            precio = precio + 800;
        } else if (peso >= 80) {
            precio = precio + 1000;
        }
    }

}
