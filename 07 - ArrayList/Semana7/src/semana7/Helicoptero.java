/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author A
 */
public class Helicoptero extends Transporte implements IVolar {

    public Helicoptero(int i, int i1, String string, String string1) {
        super(i, i1, string, string1);
    }
    
    public void descender() {
        System.out.println("El helicoptero ha descendido");
    }
    
    @Override
    public void encender() {
        System.out.println("Gasolina: " + gas);
    }

    @Override
    public String volar() {
        return "El helicoptero avanza de posicion";
    }
    
}
