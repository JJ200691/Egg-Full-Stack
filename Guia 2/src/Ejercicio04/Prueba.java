package Ejercicio04;

public class Prueba {

    public static void main(String[] args) {

        //Ejercicio 4
        /*Crear una clase Rectángulo que modele rectángulos por medio de un atributo
        privado base y un atributo privado altura. La clase incluirá un método para crear el
        rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
        método para calcular la superficie del rectángulo y un método para calcular el
        perímetro del rectángulo. Por último, tendremos un método que dibujará el
        rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
        los métodos getters, setters y constructores correspondientes*/
       
        Servicio s1 = new Servicio();
        Rectangulo r1 = s1.crearRec();
        System.out.println(s1.calcularSup(r1));
        System.out.println(s1.calcularPer(r1));
        s1.dibujarRec(r1);
    }
}
