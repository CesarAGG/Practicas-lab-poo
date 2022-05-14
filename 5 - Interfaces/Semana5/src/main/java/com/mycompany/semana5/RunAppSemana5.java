/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana5;

/**
 *
 * @author A
 */
public class RunAppSemana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\nClase Automovil");
        Automovil topaz = new Automovil();
        
        topaz.setMarca("BMW");
        topaz.setModelo("Azul");
        System.out.println(topaz.getMarca());
        System.out.println(topaz.getModelo());
        System.out.println(topaz.encender(0));
        System.out.println(topaz.encender(3));
        System.out.println(topaz.enciendeLuces());
        System.out.println(topaz.apagarLuces());
        System.out.println(topaz.avanzar(0));
        System.out.println(topaz.avanzar(2));
        System.out.println(topaz.frenar());
        System.out.println(topaz.reversa(1));
        System.out.println(topaz.reversa(2));
        System.out.println(topaz.apagar());
        
        System.out.println("\nClase abstracta");
        Transporte topazGuia = new Automovil();
        
        System.out.println(topazGuia.encender(3));
        topazGuia.setMarca("Guia");
        topazGuia.setModelo("Guia");
        System.out.println(topazGuia.getMarca());
        System.out.println(topazGuia.getModelo());
        System.out.println(topazGuia.encender(2));
        System.out.println(topazGuia.apagar());
        
        System.out.println("\nInterfaz ISistemaElectrico");
        ISistemaElectrico topazE = new Automovil();
        
        System.out.println(topazE.enciendeLuces());
        System.out.println(topazE.apagarLuces());
        
        System.out.println("\nAvion");
        Avion condor = new Avion();
        
        condor.setMarca("Boeing");
        condor.setModelo("384");
        System.out.println(condor.getMarca());
        System.out.println(condor.getModelo());
        System.out.println(condor.encender(2));
        System.out.println(condor.volar());
        System.out.println(condor.despegar());
        System.out.println(condor.despegar());
        System.out.println(condor.volar());
        System.out.println(condor.enciendeLuces());
        System.out.println(condor.apagarLuces());
        System.out.println(condor.apagar());
        
        System.out.println("\nInterfaz ISistemaVuelo");
        ISistemaVuelo condorF = new Avion();
        
        System.out.println(condorF.volar());
    }
    
}
