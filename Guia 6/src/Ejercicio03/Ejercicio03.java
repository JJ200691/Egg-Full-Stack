package Ejercicio03;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        //Ejercicio 3
        /*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner 
        para leer dos números en forma de cadena. A continuación, utilice el método 
        parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en 
        dos variables de tipo int. Por ultimo realizar una división con los dos numeros y 
        mostrar el resultado. 
        Todas estas operaciones puede tirar excepciones a manejar, el ingreso por 
        teclado puede causar una excepción de tipo InputMismatchException, el método 
        Integer.parseInt() si la cadena no puede convertirse a entero, arroja una 
        NumberFormatException y además, al dividir un número por cero surge una 
        ArithmeticException. Manipule todas las posibles excepciones utilizando bloques 
        try/catch para las distintas excepciones */
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero x = new DivisionNumero();
        try {
            System.out.print("Ingrese un número: ");
            x.setN1(leer.next());
            System.out.print("Ingrese otro número: ");
            x.setN2(leer.next());
            System.out.println(x.convertir(x.getN1(), x.getN2()));
        } catch (InputMismatchException e) {
            System.out.println("Se ingresó una letra en vez de un número");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }

    }

}
