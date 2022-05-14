/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author FCFM
 */
public class Television extends DispositivoElectronico implements IMenuConfig {
    
    private String color;

    @Override
    public void encender() {
        System.out.println("Television enciende");
    }
    
    public void cambiarVolumen(int volumen) {
        System.out.println("Volumen cambiado a " + volumen);
    }
    
    public void cambiarCanal(int canal) {
        System.out.println("Canal cambiado a " + canal);
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void seleccionarEntrada(String entrada) {
        System.out.println("Entrada cambiada a: " + entrada);
    }

    @Override
    public void cambiarBrillo(int nuevo) {
        System.out.println("Brillo cambiado a " + nuevo);
    }

    @Override
    public void sonidoSurround(boolean activado) {
        if (activado == true)
            System.out.println("Sonido surround activado");
        else
            System.out.println("Sonido surround desactivado");
    }
    
}
