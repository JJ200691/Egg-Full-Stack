package Ejercicio07;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPer() {

        Persona p = new Persona();
        System.out.println("***Ingrese los siguiente datos***");
        System.out.print("Nombre: ");
        p.setNombre(leer.next());
        System.out.print("Sexo(H - M - O): ");
        String sexo;
        do {
            sexo = leer.next();
            p.setSexo(sexo);
            sexo = sexo.toUpperCase();
            if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
                System.out.println("***Dato correcto***");
            } else {
                System.out.println("***Dato incorrecto***");
            }
        } while (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O"));
        System.out.print("Edad: ");
        p.setEdad(leer.nextInt());
        System.out.print("Peso: ");
        p.setPeso(leer.nextInt());
        System.out.print("Altura: ");
        p.setAltura(leer.nextDouble());
        return p;
    }

    public double calcularIMC(Persona p) {

        System.out.println("A continuación se calculará su IMC (índice de masa corporal) de acuerdo a su peso y altura");
        double imc = p.getPeso() / (Math.pow(p.getAltura(), 2));
        if (imc < 20) {
            imc = -1;
            System.out.println("Usted se encuentra por debajo de su peso ideal");
        } else if (imc >= 20 || imc <= 25) {
            imc = 0;
            System.out.println("Usted se encuentra en el peso ideal");
        } else if (imc > 25) {
            imc = 1;
            System.out.println("Usted tiene sobrepeso");
        }
        return imc;
    }

    public boolean esMayorDeEdad(Persona p) {

        boolean val;
        if (p.getEdad() >= 18) {
            System.out.println("Usted es mayor de edad");
            val = true;
        } else {
            System.out.println("Usted es menor de edad");
            val = false;
        }
        return val;
    }
}
