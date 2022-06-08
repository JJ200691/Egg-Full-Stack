package Ejercicio02;

public class Prueba {

    public static void main(String[] args) {

        //Ejercicio 2
        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
        pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. 
        Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
        la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
        y se mostrará la lista ordenada.*/
        
        Servicio s1 = new Servicio();
        Perro p = s1.IngresarRazas();
        s1.buscarRaza(p);

    }

}
