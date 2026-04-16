package com.mycompany.ejerciciosem2;
import java.lang.Math.*;

public class movil {
    //Atributos
    private double velocidadInicial;
    private double tiempo;
    private double aceleracion;

    //Constructor
    public movil(double velocidadInicial, double tiempo, double aceleracion) {
        this.velocidadInicial = velocidadInicial;
        this.tiempo = tiempo;
        this.aceleracion = aceleracion;
    }

    public double getVelocidadInicial() {
        return velocidadInicial;
    }
    
    public double getTiempo() {
        return tiempo;
    }
        
    public double getAceleracion() {
        return aceleracion;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    // Método => Fórmula: e = v0*t + (1/2)*a*t²
    public double Espacio() {
        return (velocidadInicial * tiempo) + (0.5 * aceleracion * Math.pow(tiempo, 2));
    }
}
