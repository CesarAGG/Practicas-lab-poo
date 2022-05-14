/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author FCFM
 */

public class Calculadora extends DispositivoElectronico implements IOperacionesEstandar{
    
    @Override
    public void encender() {
        System.out.println("Calculadora enciende");
    }
    
    @Override
    public double suma(double a, double b) {
        return a + b;
    }
    
    @Override
    public double resta(double a, double b) {
        return a - b;
    }
    
    @Override
    public double division(double a, double b) {
        return a / b;
    }
    
    @Override
    public double multiplicacion(double a, double b) {
        return a * b;
    }
}
