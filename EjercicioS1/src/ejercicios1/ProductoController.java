package ejercicios1;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductoController {
    ArrayList<Producto> listProd = new ArrayList<>();

    public ProductoController() {
        
    }

    public ProductoController(Producto p) {
        this.listProd.add(p);
    }

    public void agregarProducto(Producto prod) {
        listProd.add(prod); 
    }

    public void listarProductos() {
        Producto prod;
        Iterator<Producto> iterProd = listProd.iterator();

        while (iterProd.hasNext()) {
            prod = iterProd.next();
            System.out.println(prod.getIdProducto());
            System.out.println(prod.getNombre());
            System.out.println(prod.getPrecio());
            System.out.println(prod.getStock());
        }
    }
}