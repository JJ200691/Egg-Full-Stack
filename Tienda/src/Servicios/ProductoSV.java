package Servicios;

import Moldes.Producto;
import Persistencia.ProductoDAO;

public class ProductoSV {

    private ProductoDAO dao;

    public ProductoSV(ProductoDAO dao) {
        this.dao = dao;
    }

    public void crearProducto(String nombre, double precio, int codFabricante) throws Exception {

        try {
            //Validación
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            //Creación de Producto
            Producto x = new Producto();
            x.setCodigo(codFabricante);
            x.setNombre(nombre);
            x.setPrecio(precio);
            x.setCodFabricante(codFabricante);
            dao.guardarProducto(x);
        } catch (Exception e) {
            throw e;
        }
    }

}
