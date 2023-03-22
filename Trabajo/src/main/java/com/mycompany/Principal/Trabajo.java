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
        ContadorPalabras contador = new ContadorPalabras();
        System.out.println(contador.contarPalabras("  "));
    }
}
