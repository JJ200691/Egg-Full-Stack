package Ejercicio04.Moldes;

public class Rectangulo implements CalculosFormas {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void areaCir() {
    }

    public void perimetroCir() {
    }

    public void areaRec() {
        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);
    }

    public void perimetroRec() {
        double perimetro = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

}
