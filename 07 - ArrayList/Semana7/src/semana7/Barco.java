/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author A
 */
public class Barco extends Transporte implements ISistemaElectrico{

    public Barco(int velocidad, int gas, String marca, String modelo) {
        super(velocidad, gas, marca, modelo);
    }

    public void anclar() {
        System.out.println("El barco ha anclado");
    }
    
    @Override
    public void encender() {
        System.out.println("Gasolina: " + gas);
    }

    @Override
    public String prendeLuces() {
        return "Luces del barco prendidas";
    }

    @Override
    public String bajaSubeVidrios() {
        return "Vidrios del barco cambiados de posicion";
    }
    
}
