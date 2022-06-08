package Ejercicio10;

import java.util.Arrays;

public class Prueba {

    public static void main(String[] args) {

        //Ejercicio 10
        /*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
        A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
        programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
        pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
        10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
        elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
        elementos y el combinado de 20.*/
        
        double A[] = new double[50];
        double B[] = new double[20];

        for (int i = 0; i < A.length; i++) {
            Arrays.fill(A, i, i + 1, Math.random() * 20);
        }
        
        System.out.println("Vector A sin ordenar");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("[%.1f]", A[i]); //Metodo para imprimir cantidad de decimales y tipo de dato (despues de %)
        }

        Arrays.sort(A); //Orden de mayor a menor
        
        System.out.println(" ");
        System.out.println("Vector A ordenado de mayor a menor");
         for (int i = 0; i < A.length; i++) {
            System.out.printf("[%.1f]", A[i]); 
        }

        B = Arrays.copyOf(A, 20); //Le copiamos a B todos los elementos con A

        for (int i = 10; i < B.length; i++) { //Despues pisamos los 10 últimos con el valor 0,5
            B[i] = 0.5;
        }
        
        System.out.println(" ");
        System.out.println("Vector B");
        for (int i = 0; i < B.length; i++) {
            System.out.printf("[%.1f]", B[i]);
        }
    }
}
