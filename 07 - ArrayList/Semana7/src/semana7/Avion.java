/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author A
 */
public class Avion extends Transporte implements IVolar {

    public Avion(int velocidad, int gas, String marca, String modelo) {
        super(velocidad, gas, marca, modelo);
    }

    public void despegar() {
        System.out.println("El avion ha despegado");
    }
    
    @Override
    public void encender() {
        System.out.println("Gasolina: " + gas);
    }

    @Override
    public String volar() {
        return "Avion avanza en el aire";
    }
    
}
