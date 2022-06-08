package Moldes;

public class Producto {

    private Integer codigo;
    private String nombre;
    private double precio;
    private Integer codFabricante;

    public Producto() {
    }

    public Producto(Integer codigo, String nombre, double precio, Integer codFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codFabricante = codFabricante;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getCodFabricante() {
        return codFabricante;
    }

    public void setCodFabricante(Integer codFabricante) {
        this.codFabricante = codFabricante;
    }

}
