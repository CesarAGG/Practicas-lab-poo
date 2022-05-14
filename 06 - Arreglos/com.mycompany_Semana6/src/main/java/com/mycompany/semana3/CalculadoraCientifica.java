/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author A
 */
public class CalculadoraCientifica extends Calculadora implements IOperacionesAvanzadas {


    @Override
    public double raiz(double a) {
        return Math.sqrt(a);
    }

    @Override
    public String porcentaje(double a) {
        return (a * 100) + "%";
    }
}
