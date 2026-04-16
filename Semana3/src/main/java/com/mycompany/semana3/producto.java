package com.mycompany.semana3;

public class producto {

    //Atributos
    private int codProducto;
    private String nomProducto;
    private double precioProducto;
    static int cantidadProducto = 0;
    
    public producto(){
        
    }

    public producto(int codProducto, String nomProducto, double precioProducto) {
        this.codProducto = codProducto;
        this.nomProducto = nomProducto;    
        this.precioProducto = precioProducto;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public void MostrarProducto(){
        System.err.print("El producto con codigo: "+ codProducto + ", se llama: " + nomProducto + ", y cuesta: "+ precioProducto);
    }
    
}
