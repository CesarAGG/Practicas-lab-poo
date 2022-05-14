/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana2;

/**
 *
 * @author A
 */

import java.util.Scanner;

public class RunSemana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);

        CalculadoraBasica casio = new CalculadoraBasica();

        System.out.println("Ingresar la marca");
        casio.setMarca(sm.nextLine());

        System.out.println("Ingresar el modelo");
        casio.setModelo(sm.nextLine());

        System.out.println("Marca: " + casio.getMarca());
        System.out.println("Modelo: " + casio.getModelo());

        System.out.println("Suma: " + casio.suma(6.5, 9));
        System.out.println("Resta: " + casio.resta(12.5, 3.5));
        System.out.println("Multiplicacion: " + casio.mult(9, 9));
        System.out.println("Division: " + casio.div(39, 5));

        sm.close();
    }

}
