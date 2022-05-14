/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author A
 */
public class Automovil extends Transporte implements IFrenos, ISistemaElectrico{

    public Automovil(int velocidad, int gas, String marca, String modelo) {
        super(velocidad, gas, marca, modelo);
    }
    
    public void encenderRadio() {
        System.out.println("Radio encendido");
    }

    @Override
    public void encender() {
        System.out.println("Gasolina: " + gas);
    }

    @Override
    public String frenar() {
        return "Automovil frenado";
    }

    @Override
    public String prendeLuces() {
        return "Luces del automovil prendidas";
    }

    @Override
    public String bajaSubeVidrios() {
        return "Vidrios del automovil cambiados de posicion";
    }
    
}
