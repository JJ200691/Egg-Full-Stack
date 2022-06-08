package Ejercicio01;

public class Prueba {

    public static void main(String[] args) {

        //Ejercicio 1
        /*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
        Autor, Número de páginas, y un constructor con todos los atributos pasados por
        parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
        datos al usuario y luego informar mediante otro método el número de ISBN, el título,
        el autor del libro y el numero de páginas*/
      
        Servicio s1 = new Servicio();
        Libro l1 = s1.crearLibro();
        s1.mostrarLibro(l1);
    }
}
