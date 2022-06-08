package Ejercicio04.Moldes;

public class Circulo implements CalculosFormas {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
  
    public void areaCir() {
        double area = CalculosFormas.pi * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }

    public void areaRec() {
    }

    public void perimetroCir() {
        double perimetro = CalculosFormas.pi * (radio * 2);
        System.out.println("El perimetro del circulo es: " + perimetro);
    }

    public void perimetroRec() {
    }

}
