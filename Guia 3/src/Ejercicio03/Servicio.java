package Ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public ArrayList crearAlumno() {

        String resp;
        ArrayList<Alumno> alumnos = new ArrayList();

        do {
            Alumno x = new Alumno();
            System.out.print("Ingrese el nombre del alumno: ");
            x.setNombre(leer.next());
            System.out.println("Ingrese las 3 notas: ");
            x.getNotas().add(leer.nextInt());
            x.getNotas().add(leer.nextInt());
            x.getNotas().add(leer.nextInt());
            alumnos.add(x);
            System.out.println("Desea agregar otro alumno? S/N");
            resp = leer.next().toUpperCase();

        } while (resp.equals("S"));

        return alumnos;
    }

    public void notaFinal(ArrayList<Alumno> x) {

        int suma = 0;
        System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombre = leer.next();
        for (Alumno aux : x) {
            if (aux.getNombre().equals(nombre)) {
                for (Integer aux2 : aux.getNotas()) {
                    suma += aux2;
//                  Sumar cada nota desde su posicion
//                  for (int i = 0; i < aux.getNotas().size(); i++) {           
//                      suma += aux.getNotas().get(i);
                }
            }
        }
        System.out.println("La nota final es: " + (suma / 3));
    }
}
