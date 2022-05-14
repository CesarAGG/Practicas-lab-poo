/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;

import java.util.Scanner;

/**
 *
 * @author FCFM
 */
public class RunAppSemana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Television[] tvs = new Television[5];
        Scanner objTvM = new Scanner(System.in);

        Calculadora[] calcs = new Calculadora[5];
        Scanner objCalcM = new Scanner(System.in);

        CalculadoraCientifica[] calcScs = new CalculadoraCientifica[5];
        Scanner objCalcScM = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Television #" + (i + 1));
            tvs[i] = new Television();

            System.out.println("Marca: ");
            String marcaTv = objTvM.next();
            tvs[i].setMarca(marcaTv);

            System.out.println("Color: ");
            String colorTv = objTvM.next();
            tvs[i].setColor(colorTv);

            System.out.println("Modelo: ");
            String modeloTv = objTvM.next();
            tvs[i].setModelo(modeloTv);
        }

        for (Television tv : tvs) {
            System.out.println(tv.getMarca());
            System.out.println(tv.getColor());
            System.out.println(tv.getModelo());

            tv.encender();

            System.out.println("Cambiar canal: ");
            int canal = objTvM.nextInt();
            tv.cambiarCanal(canal);

            System.out.println("Cambiar volumen: ");
            int volumen = objTvM.nextInt();
            tv.cambiarVolumen(volumen);

            System.out.println("Cambiar brillo: ");
            int brillo = objTvM.nextInt();
            tv.cambiarBrillo(brillo);

            System.out.println("Entrada: ");
            String entrada = objTvM.next();
            tv.seleccionarEntrada(entrada);

            System.out.println("Encender sonido surround? 1/0: ");
            boolean encender = (objTvM.nextInt() != 0);
            tv.sonidoSurround(encender);

            System.out.println(tv.apagar());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Calculadora #" + (i + 1));
            calcs[i] = new Calculadora();

            System.out.println("Marca: ");
            String marca = objCalcM.next();
            calcs[i].setMarca(marca);

            System.out.println("Modelo: ");
            String modelo = objCalcM.next();
            calcs[i].setModelo(modelo);
        }

        System.out.println("Ingresar 2 numeros para cada una de las siguientes"
                + "operaciones");

        for (Calculadora calc : calcs) {
            System.out.println(calc.getMarca());
            System.out.println(calc.getModelo());

            calc.encender();

            double a, b;

            System.out.println("Suma: ");
            a = objCalcM.nextDouble();
            b = objCalcM.nextDouble();
            System.out.println(calc.suma(a, b));

            System.out.println("Resta: ");
            a = objCalcM.nextDouble();
            b = objCalcM.nextDouble();
            System.out.println(calc.resta(a, b));

            System.out.println("Multiplicacion: ");
            a = objCalcM.nextDouble();
            b = objCalcM.nextDouble();
            System.out.println(calc.multiplicacion(a, b));

            System.out.println("Division: ");
            a = objCalcM.nextDouble();
            b = objCalcM.nextDouble();
            System.out.println(calc.division(a, b));

            System.out.println(calc.apagar());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Calculadora cientifica #" + (i + 1));
            calcScs[i] = new CalculadoraCientifica();

            System.out.println("Marca: ");
            String marca = objCalcM.next();
            calcScs[i].setMarca(marca);

            System.out.println("Modelo: ");
            String modelo = objCalcM.next();
            calcScs[i].setModelo(modelo);
        }

        System.out.println("La operacion porcentaje y raiz solo ocupa un numero");

        for (CalculadoraCientifica calcSc : calcScs) {
            System.out.println(calcSc.getMarca());
            System.out.println(calcSc.getModelo());

            calcSc.encender();

            double a, b;

            System.out.println("Suma: ");
            a = objCalcScM.nextDouble();
            b = objCalcScM.nextDouble();
            System.out.println(calcSc.suma(a, b));

            System.out.println("Resta: ");
            a = objCalcScM.nextDouble();
            b = objCalcScM.nextDouble();
            System.out.println(calcSc.resta(a, b));

            System.out.println("Multiplicacion: ");
            a = objCalcScM.nextDouble();
            b = objCalcScM.nextDouble();
            System.out.println(calcSc.multiplicacion(a, b));

            System.out.println("Division: ");
            a = objCalcScM.nextDouble();
            b = objCalcScM.nextDouble();
            System.out.println(calcSc.division(a, b));

            System.out.println("Raiz: ");
            a = objCalcM.nextDouble();
            System.out.println(calcSc.raiz(a));

            System.out.println("Division: ");
            a = objCalcM.nextDouble();
            System.out.println(calcSc.porcentaje(a));

            System.out.println(calcSc.apagar());
        }
        objCalcScM.close();
        objCalcM.close();
        objTvM.close();
    }

}
