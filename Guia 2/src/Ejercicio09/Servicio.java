package Ejercicio09;

public class Servicio {

    public double devolverMayor(Matematica m) {

        System.out.print("El número mayor es: ");
        double mayor = Math.max(m.getNum1(), m.getNum2());
        return mayor;
    }

    public double calcuarPotencia(Matematica m) {

        System.out.print("La potencia del número mayor elevado al número menor es: ");
        Math.round(m.getNum1());
        Math.round(m.getNum2());
        double potencia = Math.pow((Math.max(m.getNum1(), m.getNum2())), (Math.min(m.getNum1(), m.getNum2())));
        return potencia;
    }

    public double calcularRaiz(Matematica m) {

        System.out.print("La raiz cuadrada del menor número es: ");
        double numabs = Math.abs(Math.min(m.getNum1(), m.getNum2()));
        double raiz = Math.sqrt(numabs);
        return raiz;
    }
}
