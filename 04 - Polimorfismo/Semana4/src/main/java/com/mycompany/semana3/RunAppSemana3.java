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
        CalculadoraCientifica calcSc = new CalculadoraCientifica();
        
        System.out.println("Television");
        tv.setMarca("Hitachi");
        System.out.println(tv.getMarca());
        
        tv.encender();
        tv.cambiarCanal(5);
        tv.cambiarVolumen(20);
        System.out.println(tv.apagar());
        
        tv.cambiarBrillo(50);
        tv.seleccionarEntrada("HDMI");
        tv.sonidoSurround(true);
        tv.sonidoSurround(false);
        
        System.out.println("\nCalculadora Basica");
        calc.setMarca("Casio");
        System.out.println(calc.getMarca());
        calc.setModelo("2022B");
        System.out.println(calc.getModelo());
        
        calc.encender();
        System.out.println("Suma 2 + 6: " + calc.suma(2, 6));
        System.out.println("Resta 9 - 4: " + calc.resta(2, 4));
        System.out.println("Multiplicacion 3.5 * 2: " + calc.multiplicacion(3.5, 2));
        System.out.println("Division 9 / 4: " + calc.division(9, 4));
        calc.apagar();
        
        System.out.println("\nCalculadora Cientifica");
        calcSc.setMarca("Casio");
        System.out.println(calcSc.getMarca());
        calcSc.setModelo("2022C");
        System.out.println(calcSc.getModelo());
        
        calcSc.encender();
        System.out.println("Suma 2 + 6: " + calcSc.suma(2, 6));
        System.out.println("Resta 9 - 4: " + calcSc.resta(2, 4));
        System.out.println("Multiplicacion 3.5 * 2: " + calcSc.multiplicacion(3.5, 2));
        System.out.println("Division 9 / 4: " + calcSc.division(9, 4));
        System.out.println("Raiz de 64: " + calcSc.raiz(64));
        System.out.println("Convertir a porcentaje 0.56: " + calcSc.porcentaje(0.56));
        calcSc.apagar();
    }
    
}
