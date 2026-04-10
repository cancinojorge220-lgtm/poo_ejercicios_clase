package com.mycompany.semana2;

public class TrianguloRectangulo {
    //Atributos
    private double cateto1;
    private double cateto2;

    //Constructores
    public TrianguloRectangulo() {

    }
    
    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double getCateto1() {
        return cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }
    
    //Métodos para calcular el área
    public double calcularArea() {
        double res;
        res = (cateto1 * cateto2) / 2.0;
        return res;
    }
    
    //Métodos para calcular la hipotenusa 
    public double calcularHipotenusa() {
        double res;
        res = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return res;
    }
    
    //Métodos para calcular el perímetro
    public double calcularPerimetro() {
        double res;
        res = cateto1 + cateto2 + calcularHipotenusa();
        return res;
    }
}
