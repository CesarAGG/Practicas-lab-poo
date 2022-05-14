/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana7;

import java.util.ArrayList;

/**
 *
 * @author A
 */
public class Semana7App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Transporte> tr = new ArrayList<>();
        tr.add(new Automovil(60, 0, "Chevy", "Sonic"));
        tr.add(new Autobus(40, 15, "Dina", "Buller"));
        tr.add(new Avion(200, 5, "Boeing", "747"));
        tr.add(new Helicoptero(150, 25, "Bell", "204"));
        tr.add(new Barco(100, 20, "Azimut", "45"));
        
        for (Transporte tra : tr) {
            System.out.println("Clase: " + tra.getClass().toString());
            tra.encender();
            
            tra.acelerar();
            if (tra.gas <= 10) { // Rellenar gasolina e intentar otra vez
                tra.gas += 15;
                tra.acelerar();
            }
            
            System.out.println("Marca: " + tra.getMarca());
            System.out.println("Modelo: " + tra.getModelo());
            
            if (tra instanceof IFrenos iFrenos) { // instanceof pattern
                System.out.println(iFrenos.frenar());
            }
            
            if (tra instanceof ISistemaElectrico iSistemaElectrico) {
                System.out.println(iSistemaElectrico.prendeLuces());
                System.out.println(iSistemaElectrico.bajaSubeVidrios());
            }
            
            if (tra instanceof IVolar iVolar) {
                System.out.println(iVolar.volar());
            }
            
            if (tra instanceof Automovil automovil) {
                automovil.encenderRadio();
            }
            
            if (tra instanceof Autobus autobus) {
                autobus.abrirPuertas();
            }
            
            if (tra instanceof Avion avion) {
                avion.despegar();
            }
            
            if (tra instanceof Helicoptero helicoptero) {
                helicoptero.descender();
            }
            
            if (tra instanceof Barco barco) {
                barco.anclar();
            }
            
            System.out.println(""); // Imprime linea vacia para separar
        }
    }
    
}
