package Ejercicio06;

public class Auto {

    private String nombre;
    private Integer precio;

    public Auto() {
    }

    public Auto(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

}
