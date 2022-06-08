package Ejercicio01.Moldes;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void alimento() {
        super.alimento();
    }

}
