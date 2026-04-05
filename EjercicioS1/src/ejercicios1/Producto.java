package ejercicios1;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        this.idProducto = 0;
        this.nombre = "";
        this.precio = 0.00;
        this.stock = 0;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio + 1;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
        
}
