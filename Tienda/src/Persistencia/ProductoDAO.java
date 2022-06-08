package Persistencia;

import Moldes.Producto;
import java.util.ArrayList;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto x) throws Exception {
        try {
            if (x == null) {
                throw new Exception("Debe indicar el producto");
            }

            String query = "INSERT INTO Producto VALUES ( '" + x.getCodigo() + "' , '" + x.getNombre()
                    + "' , '" + x.getPrecio() + "' , '" + x.getCodFabricante() + "')'";
            insertarModificarEliminar(query);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public ArrayList<Producto> listarTodosLosProductos() throws Exception {
        try {
            String query = "SELECT * FROM Producto";
            consultarBase(query);
            Producto x = null;
            ArrayList<Producto> listaProductos = new ArrayList();
            while (resultado.next()) {
                x = new Producto();
                x.setCodigo(resultado.getInt(1));
                x.setNombre(resultado.getString(2));
                x.setPrecio(resultado.getDouble(3));
                x.setCodFabricante(resultado.getInt(4));
                listaProductos.add(x);
            }
            desconectarBase();
            return listaProductos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<Producto> listarProductosPorNombreYPrecio() throws Exception {

        try {
            String query = "SELECT nombre, precio FROM Producto";
            consultarBase(query);
            Producto x = null;
            ArrayList<Producto> listaProductos = new ArrayList();
            while (resultado.next()) {
                x = new Producto();
                x.setNombre(resultado.getString(1));
                x.setPrecio(resultado.getDouble(2));
                listaProductos.add(x);
            }
            desconectarBase();
            return listaProductos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<Producto> listarProductoEntre120Y202() throws Exception {

        try {
            String query = "SELECT * FROM Producto WHERE precio BETWEEN '" + 120 + "','" + 202 + "'";
            consultarBase(query);
            Producto x = null;
            ArrayList<Producto> listaProductos = new ArrayList();
            while (resultado.next()) {
                x = new Producto();
                x.setPrecio(1);
                listaProductos.add(x);
            }
            desconectarBase();
            return listaProductos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public ArrayList<Producto> listarProductosPortatiles() throws Exception {

        try {
            String aux = "portátil";
            String query = "SELECT * FROM Producto WHERE nombre LIKE '%" + aux + "%'";
            consultarBase(query);
            Producto x = null;
            ArrayList<Producto> listaProductos = new ArrayList();
            while (resultado.next()) {
                x = new Producto();
                x.setPrecio(1);
                listaProductos.add(x);
            }
            desconectarBase();
            return listaProductos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Producto listarProductoMasBarato() throws Exception {

        try {
            String query = "SELECT nombre, precio FROM Producto ORDER BY precio ASC";
            consultarBase(query);
            Producto x = null;
            while (resultado.next()) {
                x = new Producto();
                x.setPrecio(1);
            }
            desconectarBase();
            return x;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void ingresarProducto(Producto x) throws Exception {

        try {
            if (x == null) {
                throw new Exception("Ingrese un producto");
            }
            String query = "INSERT INTO Producto VALUES ('" + x.getCodigo() + "','" + x.getNombre() + "','"
                    + x.getPrecio() + "','" + x.getCodFabricante() + "')'";
            insertarModificarEliminar(query);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void editarProducto(Producto x) throws Exception {

        try {
            if (x == null) {
                throw new Exception("Indique el producto a modificar");
            }
            String query = "UPDATE Producto SET nombre = '" + x.getNombre() + "' WHERE precio = '" + x.getPrecio() + "'";
            insertarModificarEliminar(query);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

}
