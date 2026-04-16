package com.mycompany.ejerciciosem2;

public class EjercicioSem2 {

    public static void main(String[] args) {
        //Manejo de Salarios
        System.out.println("Manejo de Salarios: ");
        trabajador tra = new trabajador("Keiko Fujimori", 25.0, 160);
        System.out.println("Trabajador: " + tra.getNombre());
        System.out.println("Salario Bruto : S/ " + tra.SalarioBruto());
        System.out.println("Impuesto (10%): S/ " + tra.Impuesto());
        System.out.println("Salario Neto  : S/ " + tra.SalarioNeto());
        
        //Manejo de Gas Ideal
        System.out.println("\nManejo de Gas Ideal: ");
        gasIdeal gas = new gasIdeal(100, 1.5, 5.0);
        System.out.println("Presión: " + gas.Presion() + " atm");
        
        //Manejo de movil
        System.out.println("\nManejo de Movil: ");
        movil m = new movil(5.0, 2.0, 3.0);
        System.out.println("Espacio recorrido: " + m.Espacio() + " m");
    }
}
