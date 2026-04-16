package com.mycompany.ejerciciosem2;

public class trabajador {
        //Mis Atributos
    private String nombre;
    private double precioxHora;
    private int horasTrabajadas;
    
    // Constructor
    public trabajador(String nombre, double precioHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.precioxHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecioHora() {
        return precioxHora;
    }
    
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecioHora(double precioHora) {
        this.precioxHora = precioHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    //Metodos
    public double SalarioBruto() {
        return precioxHora * horasTrabajadas;
    }

    public double Impuesto() {
        return SalarioBruto() * 0.10;
    }

    public double SalarioNeto() {
        return SalarioBruto() - Impuesto();
    }
}
