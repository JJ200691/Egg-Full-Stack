package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author JuanJo.Martinez
 */
public class Ejercicio07 {

    public static void main(String[] args) {

        //Ejercicio 7
        /*Implementar un programa que dado dos números enteros determine cuál es el 
        mayor y lo muestre por pantalla.*/
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese dos números");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        if (num1 > num2) {
            System.out.println("El número mayor es " + num1);
        } else {
            System.out.println("El número mayor es " + num2);
        }
    }

}
