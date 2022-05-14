/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author FCFM
 */
public class RunAppSemana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Television tv = new Television();
        Calculadora calc = new Calculadora();
        
        System.out.println("Television");
        tv.setMarca("Hitachi");
        System.out.println(tv.getMarca());
        tv.encender();
        tv.cambiarCanal(5);
        tv.cambiarVolumen(20);
        System.out.println(tv.apagar());
        
        System.out.println("Calculadora");
        calc.setMarca("Casio");
        System.out.println(calc.getMarca());
        calc.encender();
        System.out.println("Suma 2 + 6: " + calc.suma(2, 6));
        System.out.println("Resta 9 - 4: " + calc.resta(2, 4));
        System.out.println("Multiplicacion 3.5 * 2: " + calc.multiplicacion(3.5, 2));
        System.out.println("Division 9 / 4: " + calc.division(9, 4));
        calc.apagar();
        
    }
    
}
