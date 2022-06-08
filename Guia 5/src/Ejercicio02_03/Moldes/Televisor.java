package Ejercicio02_03.Moldes;

public class Televisor extends Electrodomestico {

    protected int pulgadas;
    protected boolean tdt;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tdt, double precio, String color, char consumoEne, double peso) {
        super(precio, color, consumoEne, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public Televisor crearTelevisor() {

        Televisor x = new Televisor();
        this.crearElectrodomestico();
        System.out.print("De cuantas pulgadas es el TV: ");
        pulgadas = leer.nextInt();
        System.out.print("Posee sintonizador TDT (S/N): ");
        String resp = leer.next();
        if (resp.equalsIgnoreCase("S")) {
            this.tdt = true;
        }
        return x;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.pulgadas > 40) {
            precio = precio + (precio * 0.3);
        } else if (this.tdt == true) {
            precio = +500;
        }
    }

}
