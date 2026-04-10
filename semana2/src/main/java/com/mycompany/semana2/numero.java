package com.mycompany.semana2;
import java.lang.Math.*;

public class numero {
    //Atributos
    private double numeroReal;
    
    //Cosntructores
    public numero() {

    }
    
    public numero(double numeroReal){
      this.numeroReal = numeroReal;  
    }

    public double getNumeroReal() {
        return numeroReal;
    }

    public void setNumeroReal(double numeroReal) {
        this.numeroReal = numeroReal;
    }
    
    //Calculo del cuadrado
    public double Cuadrado(){
        double res;
        res = Math.pow(numeroReal, 2);
        return res;
    }
    
    public double Cubo(){
        double res;
        res = Math.pow(numeroReal, 3);
        return res;
    }
      
}
