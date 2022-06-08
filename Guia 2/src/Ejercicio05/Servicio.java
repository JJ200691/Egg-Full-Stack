package Ejercicio05;

import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {

        Cuenta c1 = new Cuenta();
        System.out.println("-----Bienvenido-----\nIngrese sus datos");
        System.out.print("Número de cuenta: ");
        c1.setNroCuenta(leer.nextInt());
        System.out.print("DNI: ");
        c1.setDni(leer.nextLong());
        System.out.print("Saldo actual: ");
        c1.setSaldoAct(leer.nextDouble());
        return c1;
    }

    public void ingresar(Cuenta c1) {

        System.out.print("Ingrese el importe a depositar: ");
        double ingreso = leer.nextDouble();
        c1.setSaldoAct(c1.getSaldoAct() + ingreso);
        System.out.println("Su saldo actual es: $" + c1.getSaldoAct());
    }

    public void retirar(Cuenta c1) {

        System.out.print("Ingrese el importe a retirar: ");
        double retiro = leer.nextDouble();
        if (retiro > c1.getSaldoAct()) {
            c1.setSaldoAct(0);
            System.out.println("Su saldo es insuficiente");
        } else {
            c1.setSaldoAct(c1.getSaldoAct() - retiro);
        }
        System.out.println("Su saldo actual es: $" + c1.getSaldoAct());
    }

    public void extraccionRap(Cuenta c1) {

        System.out.print("Se puede retirar como máximo el 20% de su saldo actual\n"
                + "Ingrese el importe a retirar: ");
        double retiro = leer.nextDouble();
        if (retiro > c1.getSaldoAct() * 0.20) {
            System.out.println("El importe ingresado supera el 20% de su saldo actual");
        } else {
            c1.setSaldoAct(c1.getSaldoAct() - retiro);
            System.out.println("Su saldo actual es: $" + c1.getSaldoAct());
        }
    }

    public void consultarSaldo(Cuenta c1) {

        System.out.println("Su saldo actual es: $" + c1.getSaldoAct());
    }

    public void consultarDatos(Cuenta c1) {

        System.out.println("Sus datos son los siguientes: \n"
                + "Número de cuenta: " + c1.getNroCuenta() + "\n"
                + "DNI: " + c1.getDni());
    }

    public void menu(Cuenta c1) {

        int opc = 0;

        do {

            System.out.println("-----MENU-----\n"
                    + "1 - Ingresar dinero\n"
                    + "2 - Retirar dinero\n"
                    + "3 - Extracción rápida\n"
                    + "4 - Consultar saldo\n"
                    + "5 - Consultar datos\n"
                    + "6 - Salir\n"
                    + "**************************");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    ingresar(c1);
                    break;
                case 2:
                    retirar(c1);
                    break;
                case 3:
                    extraccionRap(c1);
                    break;
                case 4:
                    consultarSaldo(c1);
                    break;
                case 5:
                    consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("Usted ha salido de su cuenta");
            }
        } while (opc != 6);
    }
}
