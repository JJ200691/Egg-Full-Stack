package Ejercicio02;

public class Prueba {

    public static void main(String[] args) {

        //Ejercicio 2
        /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
        de tipo real. A continuación, se deben crear los siguientes métodos:
            a) Método constructor que inicialice el radio pasado como parámetro.
            b) Métodos get y set para el atributo radio de la clase Circunferencia.
            c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
            d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
            e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).*/
       
        Servicio s1 = new Servicio();
        Circunferencia c1 = s1.crearCircunferencia();
        System.out.println(s1.area(c1));
        System.out.println(s1.perimetro(c1));
    }
}
