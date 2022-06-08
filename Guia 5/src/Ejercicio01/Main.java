package Ejercicio01;

import Ejercicio01.Moldes.Animal;
import Ejercicio01.Moldes.Caballo;
import Ejercicio01.Moldes.Gato;
import Ejercicio01.Moldes.Perro;

public class Main {

    public static void main(String[] args) {
        
        //Ejercicio 1
        /*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
        La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
        Animal.
        Crear un método en la clase Animal a través del cual cada clase hija deberá
        mostrar luego un mensaje por pantalla informando de que se alimenta.*/

        Animal perro1 = new Perro("Bilbo", "Carne", "Mestizo", 12);
        perro1.alimento();
        Perro perro2 = new Perro("Pitu", "Alimento balanceado", "Boxer", 7);
        perro2.alimento();
        Animal gato = new Gato("Ares", "Pescado", "Bombay", 5);
        gato.alimento();
        Animal caballo = new Caballo("Pepe", "Heno", "Frisón", 3);
        caballo.alimento();

    }

}
