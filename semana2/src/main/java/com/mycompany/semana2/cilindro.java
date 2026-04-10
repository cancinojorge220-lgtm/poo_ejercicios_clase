package com.mycompany.semana2;

public class cilindro {
    //Atributos
    private int radio;
    private int altura;
    
    //Constructor
    
    public cilindro(){
        
    }

    public cilindro(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public int getRadio() {
        return radio;
    }

    public int getAltura() {
        return altura;
    }
    
        
    //Metodo volumen del cilindro
    public double Volumen() {
        double res;
        res = Math.PI * (radio * radio) * altura;
        res = Math.round(res * 100.0) / 100.0;
        return res;
    }
    
}
