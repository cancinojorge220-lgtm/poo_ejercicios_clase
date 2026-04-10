package com.mycompany.semana2;

public class Semana2 {

    public static void main(String[] args) {
        //Manejo de Triangulo
        triangulo tri = new triangulo(5,8);
        System.out.println("El Área del Triangulo es: " + tri.Area());
        
        //Manejo de Cuadrados y Cubos de un Número Real
        numero num = new numero(5);
        System.out.println("El Cuadrado de Numero es: " + num.Cuadrado());
        System.out.println("El Cubo de Numero es: " + num.Cubo());
        
        //Manejo del Cilindro
        cilindro cil = new cilindro(2,4);
        System.out.println("El Volumen del Cilindro es: " + cil.Volumen());
                
        //Manejo de Triangulo Rectangulo
        trianguloRectangulo tr = new trianguloRectangulo(2,1);
        System.out.println("El Área del Triangulo Rectangulo es: " + tr.calcularArea());
        System.out.println("La Hipotenusa es: " + tr.calcularHipotenusa());
        System.out.println("El Perímetro es : " + tr.calcularPerimetro());
    }

}
