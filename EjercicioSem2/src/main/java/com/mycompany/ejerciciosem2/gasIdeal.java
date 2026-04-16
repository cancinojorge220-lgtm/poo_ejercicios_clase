package com.mycompany.ejerciciosem2;

public class gasIdeal {
    //Usaremos una constante universal
    private static final double R = 0.0821;

    //Atributos
    private double temp;
    private double numeroMoles;
    private double vol;

    // Constructor
    public gasIdeal(double temp, double numeroMoles, double vol) {
        this.temp = temp;
        this.numeroMoles = numeroMoles;
        this.vol = vol;
    }

    public double getTemperatura() {
        return temp;
    }
    
    public double getVolumen() {
        return vol;
    }

    public double getNumeroDeMoles() {
        return temp;
    }

    public void setTemperatura(double temp) {
        this.temp = temp;
    }

    public void setNumeroDeMoles(double numeroMoles) {
        this.numeroMoles = numeroMoles;
    }

    public void setVolumen(double vol) {
        this.vol = vol;
    }

    //Método para calcular la presión => Fórmula: P = (n * R * T) / V
    public double Presion() {
        return (numeroMoles * R * temp) / vol;
    }
}
