package Ejercicio01;

public class Prueba {

    public static void main(String[] args) {

        //Ejercicio 1
        /*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
        dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
        Persona con atributos: nombre, apellido, edad, documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
        que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
        mostrar desde la clase Persona, la información del Perro y de la Persona.*/
        
        Servicio s1 = new Servicio();
        Perro p1 = s1.crearPerro();
        Perro p2 = s1.crearPerro();
        Persona pe1 = s1.crearPersona(p1);
        Persona pe2 = s1.crearPersona(p2);
        System.out.println(pe1.toString() + "\n"
                + pe2.toString());

    }

}
