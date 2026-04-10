package ejercicios1;

public class EjercicioS1 {
    public static void main(String[] args) {
        ProductoController listProd = new ProductoController();

        Producto p1 = new Producto(1, "libro", 50, 10);
        Producto p2 = new Producto(1, "libro", 50, 10);
        Producto p3 = new Producto(1, "libro", 50, 10);
        
        listProd.agregarProducto(p1);
        listProd.agregarProducto(p2);
        listProd.agregarProducto(p3);
        
        System.out.println("Lista de Productos");
        listProd.listarProductos();
    }

}
