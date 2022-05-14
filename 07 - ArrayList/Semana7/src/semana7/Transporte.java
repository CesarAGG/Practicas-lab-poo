/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

/**
 *
 * @author A
 */
public abstract class Transporte {
    public int velocidad, gas;
    
    private final String marca, modelo; // Solo se modifica una vez
    
    public Transporte(int velocidad, int gas, String marca, String modelo) {
        this.velocidad = velocidad;
        this.gas = gas;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void acelerar() {
        if (gas > 10)
            System.out.println("Velocidad: " + velocidad);
        else
            System.out.println("No hay suficiente gasolina");
    }
    
    public abstract void encender();

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }
}
