package Extra02.Moldes;

public class EdificioDeOficinas extends Edificio {

    protected int nroOficinas;
    protected int cantPersonasXoficina;
    protected int nroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nroOficinas, int cantPersonasXoficina, int nroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.cantPersonasXoficina = cantPersonasXoficina;
        this.nroPisos = nroPisos;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getCantPersonasXoficina() {
        return cantPersonasXoficina;
    }

    public void setCantPersonasXoficina(int cantPersonasXoficina) {
        this.cantPersonasXoficina = cantPersonasXoficina;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }

    @Override
    public String toString() {
        return super.toString() + "EdificioDeOficinas{" + "nroOficinas=" + nroOficinas + ", cantPersonasXoficina=" + cantPersonasXoficina + ", nroPisos=" + nroPisos + '}';
    }

    @Override
    public void calcularVolumen() {
        super.calcularVolumen();
    }

    @Override
    public void calcularSuperficie() {
        super.calcularSuperficie();
    }

    public void calcularPersonasEdifico() {
        System.out.print("Ingrese cuantas personas entran en una oficina: ");
        cantPersonasXoficina = leer.nextInt();
        System.out.print("Ingrese cuantas oficinas hay en un piso: ");
        nroOficinas = leer.nextInt();
        System.out.print("Ingrese cuantos pisos tiene el edificio: ");
        nroPisos = leer.nextInt();
        System.out.println("En un piso ingresan " + cantPersonasXoficina * nroOficinas + " personas");
        System.out.println("En todo el edificio ingresan " + cantPersonasXoficina * nroOficinas * nroPisos + " personas");
    }

}
