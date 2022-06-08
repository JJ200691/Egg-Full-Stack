package Ejercicio02;


public class Ejercicio02 {

    public static void main(String[] args) {

        //Ejercicio 2
        /*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el 
        código para generar y capturar una excepción ArrayIndexOutOfBoundsException
        (índice de arreglo fuera de rango). */
        
        int[] array = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException x) {
            System.out.println("Su array está fuera de limite");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
