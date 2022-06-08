package Ejercicio01.Moldes;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void alimento() {
        super.alimento();
    }

}
