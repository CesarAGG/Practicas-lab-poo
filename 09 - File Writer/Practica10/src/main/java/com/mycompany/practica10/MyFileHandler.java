/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author A
 */
public class MyFileHandler {
    /**
     * Intenta leer un archivo en el mismo directorio y regresa una lista de strings
     * en la que cada elemento es un renglon del archivo.
     * 
     * @param fileName nombre del archivo
     * @return renglones del archivo
     */
    private static String[] leerArchivo(String fileName) {
        ArrayList<String> lista = new ArrayList<>();
        try {
            try (Scanner in = new Scanner(new java.io.File(fileName))) {
                String linea;
                while (in.hasNextLine()) {
                    linea = in.nextLine();
                    lista.add(linea);
                }
            }
            return lista.toArray(String[]::new);
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * Escribe un archivo en el mismo directorio. Si no existe el archivo lo crea.
     * 
     * @param fileName nombre del archivo
     */
    private static void escribirArchivo(String fileName) {
        try {
            Scanner in;
            try (java.io.FileWriter fw = new java.io.FileWriter(fileName)) {
                in = new Scanner(System.in);
                String linea;
                System.out.println("Escriba el contenido del archivo");
                do {
                    linea = in.nextLine();
                    fw.write(linea + "\n");
                } while (!linea.equals(""));
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }

    /**
     * Intenta leer el archivo e imprimirlo
     * 
     * @param fileName nombre del archivo
     */
    public static void imprimirArchivo(String fileName) {
        String[] renglones = leerArchivo(fileName);
        if (renglones != null) {
            for (String renglon : renglones) {
                System.out.println(renglon);
            }
        } else {
            System.out.println("Error al leer el archivo, creando archivo");
            escribirArchivo(fileName);
        }
    }
}
