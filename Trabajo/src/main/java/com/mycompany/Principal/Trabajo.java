/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.Principal;
import logica.ContadorPalabras;

/**
 *
 * @author Erik Hernandez
 */
public class Trabajo {

    public static void main(String[] args) {
        ContadorPalabras contador = new ContadorPalabras(); // Crear un objeto de clase ContadorPalabras
        System.out.println(contador.contarPalabras(" hh ")); // Prubea del método para contar palabras

        System.out.println(contador.palabrasMayores("hola hola hola", 0)); // Prueba del método para contar las
        // palabras de largo mayor al indicado por x
    }
}
