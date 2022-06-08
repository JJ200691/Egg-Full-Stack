
import Servicios.AutorService;
import Servicios.EditorialService;
import Servicios.LibroService;

public class Test {

    public static void main(String[] args) {

        AutorService as = new AutorService();
        as.menu();
        EditorialService es = new EditorialService();
        es.menu();
        LibroService ls = new LibroService();
        ls.menu();
    }
}
