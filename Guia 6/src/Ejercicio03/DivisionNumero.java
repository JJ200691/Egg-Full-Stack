package Ejercicio03;


public class DivisionNumero {

    private String n1;
    private String n2;

    public DivisionNumero() {
    }

    public DivisionNumero(String n1, String n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public int convertir(String a, String b) {
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        return c / d;
    }

}
