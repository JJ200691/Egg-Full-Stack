package Persistencia;

import Moldes.Fabricante;

public final class FabricanteDAO extends DAO {

    public void ingresarFabricante(Fabricante x) throws Exception {

        try {
            if (x == null) {
                throw new Exception("Ingrese un fabricante");
            }
            String query = "INSERT INTO Fabricante VALUES ('" + x.getCodigo() + "','" + x.getNombre() + "',)'";
            insertarModificarEliminar(query);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void editarFabricate(Fabricante x) throws Exception {

        try {
            if (x == null) {
                throw new Exception("Indique el fabricante a modificar");
            }
            String query = "UPDATE Producto SET nombre = '" + x.getNombre() + "' WHERE codigo = '" + x.getCodigo() + "'";
            insertarModificarEliminar(query);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

}
