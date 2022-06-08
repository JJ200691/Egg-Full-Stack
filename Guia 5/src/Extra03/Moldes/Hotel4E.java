package Extra03.Moldes;

public class Hotel4E extends Alojamiento {

    protected int cantHabitaciones;
    protected int nroCamas;
    protected int cantPisos;
    protected char gimansio;
    protected String nombreRest;
    protected int capacidadRest;
    protected double precioHabitacion;

    public Hotel4E() {
    }

    public Hotel4E(int cantHabitaciones, int nroCamas, int cantPisos, char gimansio, String nombreRest, int capacidadRest, double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.nroCamas = nroCamas;
        this.cantPisos = cantPisos;
        this.gimansio = gimansio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
        this.precioHabitacion = precioHabitacion;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNroCamas() {
        return nroCamas;
    }

    public void setNroCamas(int nroCamas) {
        this.nroCamas = nroCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public char getGimansio() {
        return gimansio;
    }

    public void setGimansio(char gimansio) {
        this.gimansio = gimansio;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        super.toString();
        return "Hotel4E{" + "cantHabitaciones=" + cantHabitaciones + ", nroCamas=" + nroCamas + ", cantPisos=" + cantPisos + ", gimansio=" + gimansio + ", nombreRest=" + nombreRest + ", capacidadRest=" + capacidadRest + ", precioHabitacion=" + precioHabitacion + '}';
    }

    public Hotel4E crearHotel4E() {

        Hotel4E x = new Hotel4E();
        System.out.print("Nombre del hotel: ");
        x.setNombre(leer.next());
        System.out.print("Dirección: ");
        x.setDireccion(leer.next());
        System.out.print("Localidad: ");
        x.setLocalidad(leer.next());
        System.out.print("Gerente a cargo: ");
        x.setGerente(leer.next());
        System.out.print("Cantidad de habitaciones: ");
        x.setCantHabitaciones(leer.nextInt());
        System.out.print("Número de camas: ");
        x.setNroCamas(leer.nextInt());
        System.out.print("Cantidad de pisos: ");
        x.setCantPisos(leer.nextInt());
        System.out.print("Tipo de gimnasio: ");
        x.setGimansio(leer.next().charAt(0));
        System.out.print("Nombre del restaurant: ");
        x.setNombreRest(leer.next());
        System.out.print("Capacidad del restaurant: ");
        x.setCapacidadRest(leer.nextInt());
        int aux = 0;
        int aux2 = 0;
        if (x.getCapacidadRest() < 30) {
            aux = 10;
        } else if (x.getCapacidadRest() >= 30 && x.getCapacidadRest() <= 50) {
            aux = 30;
        } else if (x.getCapacidadRest() < 50) {
            aux = 50;
        }
        if (x.getGimansio() == 'A') {
            aux2 = 50;
        } else if (x.getGimansio() == 'B') {
            aux2 = 30;
        }
        double precio = 50 + x.getNroCamas() + aux + aux2;
        x.setPrecioHabitacion(precio);

        return x;
    }

}
