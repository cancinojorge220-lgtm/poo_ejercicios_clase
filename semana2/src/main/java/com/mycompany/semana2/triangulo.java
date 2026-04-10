package com.mycompany.semana2;

public class triangulo {
    //Atributos del Triangulo
    private int base;
    private int altura;
    
    //Cosntructores
    public triangulo() {

    }
    
    public triangulo (int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //Calculo del Área
    public double Area(){
        double res;
        res = (base * altura)/2;
        return res;
    }
            
}
