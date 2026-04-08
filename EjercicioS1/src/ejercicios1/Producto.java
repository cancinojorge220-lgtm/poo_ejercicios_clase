package ejercicios1;

//cambio de prueba investigacion 
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private int stock;
    private String pais;

    public Producto(int idProducto, String nombre, double precio, int stock, String pais) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.pais = pais;
    }

    public Producto() {
        this.idProducto = 0;
        this.nombre = "";
        this.precio = 0.0;
        this.stock = 0;
        this.pais = "";
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
    
    public String getPais() {
        return pais;
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
    
    public void setPais(String pais){
    this.pais = pais;
    }
        
}
