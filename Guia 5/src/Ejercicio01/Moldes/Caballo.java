package Ejercicio01.Moldes;

public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, String raza, int edad) {
        super(nombre, alimento, raza, edad);
    }

    @Override
    public void alimento() {
        super.alimento();
    }
    
}
