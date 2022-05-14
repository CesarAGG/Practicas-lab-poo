/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana5;

/**
 *
 * @author A
 */
public class Avion extends Transporte implements ISistemaElectrico, ISistemaVuelo {

    private boolean volando;
    
    public String despegar() {
        if (!volando) {
            volando = true;
            return "El avion ha despegado";
        }else 
            return "El avion ya esta en el aire";
    }
    
    @Override
    public String encender(double gas) {
        if (gas > 0)
            return "Avion encendido";
        else
            return "Error, no hay gasolina";
    }

    @Override
    public String apagar() {
        return "Avion apagado";
    }

    @Override
    public String enciendeLuces() {
        return "Luces del avion encendidas";
    }

    @Override
    public String apagarLuces() {
        return "Luces del avion apagadas";
    }

    @Override
    public String volar() {
        if (volando)
            return "El avion ha avanzado en el aire";
        else
            return "Error: El avion no esta en el aire";
    }
    
}
