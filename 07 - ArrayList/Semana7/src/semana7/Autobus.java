/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author A
 */
public class Autobus extends Transporte implements IFrenos, ISistemaElectrico{

    public Autobus(int velocidad, int gas, String marca, String modelo) {
        super(velocidad, gas, marca, modelo);
    }
    
    public void abrirPuertas() {
        System.out.println("Se han abierto las puertas del autobus");
    }

    @Override
    public void encender() {
        System.out.println("Gasolina: " + gas);
    }

    @Override
    public String frenar() {
        return "Autobus frenado";
    }

    @Override
    public String prendeLuces() {
        return "Luces del autobus prendidas";
    }

    @Override
    public String bajaSubeVidrios() {
        return "Vidrios del autobus cambiados de posicion";
    }
    
}
