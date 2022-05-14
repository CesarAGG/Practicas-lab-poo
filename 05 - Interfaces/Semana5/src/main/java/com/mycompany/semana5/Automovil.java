/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana5;

/**
 *
 * @author A
 */
public class Automovil extends Transporte implements ISistemaElectrico, ISistemaFrenos{
    
    public String avanzar(double gas) {
        if (gas > 1)
            return "Avanzado";
        else
            return "No se puede avanzar, no hay gasolina";
    }
    
    public String reversa(double gas) {
        if (gas > 1)
            return "Reversa";
        else
            return "No se puede ir en reversa, no hay gasolina";
    }
    
    @Override
    public String encender(double gas) {
        if (gas > 0)
            return "Auto Encendido";
        else
            return "No hay gasolina";
    }

    @Override
    public String apagar() {
        return "Auto Apagado";
    }
    
    @Override
    public String enciendeLuces() {
        return "Luces del automovil encendidas";
    }

    @Override
    public String apagarLuces() {
        return "Luces del automovil apagadas";
    }

    @Override
    public String frenar() {
        return "Frenos del auto activados";
    }
    
}
