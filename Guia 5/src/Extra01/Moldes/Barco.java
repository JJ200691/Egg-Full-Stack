package Extra01.Moldes;

import java.time.LocalDate;
import java.util.Scanner;

public class Barco extends Alquiler {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected String matricula;
    protected int eslora;
    protected int añoFabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int añoFabricacion, String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posicionAmarre, Barco barco) {
        super(nombre, dni, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion + '}';
    }

    @Override
    public long calcularAlquiler() {
        long fecha = super.calcularAlquiler();
        long calculo = fecha * (eslora * 10);
        return calculo;
    }

    public void crearBarco() {

        System.out.print("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.print("Ingrese su dni: ");
        dni = leer.nextInt();
        System.out.print("Ingrese fecha de alquiler: ");
        fechaAlquiler = LocalDate.of(leer.nextInt(), leer.nextInt(), leer.nextInt());
        System.out.print("Ingrese fecha de devolución: ");
        fechaDevolucion = LocalDate.of(leer.nextInt(), leer.nextInt(), leer.nextInt());
        System.out.print("Ingrese la posicion del amarre: ");
        posicionAmarre = leer.nextInt();
        System.out.print("Ingrese matricula: ");
        matricula = leer.next();
        System.out.print("Ingrese la eslora del barco: ");
        eslora = leer.nextInt();
        System.out.print("Ingrese año de fabricacion: ");
        añoFabricacion = leer.nextInt();
    }

    public void menu() {

        int opc = 0;

        do {
            System.out.println("Que tipo de barco desea alquilar \n"
                    + "1- Velero \n"
                    + "2- Barco a motor \n"
                    + "3- Yate \n"
                    + "4- Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    Velero v = new Velero();
                    v.crearVelero();
                    System.out.println(v.calcularAlquiler());
                    break;
                case 2:
                    BarcoMotor b = new BarcoMotor();
                    b.crearBarcoMotor();
                    System.out.println(b.calcularAlquiler());
                    break;
                case 3:
                    Yate y = new Yate();
                    y.crearYate();
                    System.out.println(y.calcularAlquiler());
                    break;
                case 4:
                    System.out.println("Hasta la próxima...");
                    break;
            }

        } while (opc != 4);

    }
}
