package Ejercicio03;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {

        Operacion op1 = new Operacion();
        System.out.print("Ingrese el primer número: ");
        op1.setNumero1(leer.nextInt());
        System.out.print("Ingrese el segundo número: ");
        op1.setNumero2(leer.nextInt());
        return op1;
    }

    public void suma(Operacion op1) {
        
        int suma = op1.getNumero1() + op1.getNumero2();
        System.out.println("La suma de los números es: " + suma);
    }

    public void resta(Operacion op1) {
        
        int resta = op1.getNumero1() - op1.getNumero2();
        System.out.println("La resta de los números es: " + resta);
    }

    public void multiplicacion(Operacion op1) {
        
        int multi = op1.getNumero1() * op1.getNumero2();
        System.out.println("La multiplicación de los números es: " + multi);
    }

    public void division(Operacion op1) {
        
        double div = op1.getNumero1() / op1.getNumero2();
        System.out.println("La división de los números es: " + div);
    }

}
