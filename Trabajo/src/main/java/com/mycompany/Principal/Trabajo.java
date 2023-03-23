/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.Principal;
import logica.ContadorPalabras;
import logica.FileReader;

import java.io.FileNotFoundException;

import static logica.FileReader.reader;

public class Trabajo {

    public static void main(String[] args) throws FileNotFoundException {
        ContadorPalabras contador = new ContadorPalabras(); // Crear un objeto de clase ContadorPalabras
        
        System.out.println("Cantidad de palabras: " + contador.contarPalabras("Hoy es 8 de marzo")); // Prubea del método para contar palabras
        System.out.println("Cantidad de vocales: " + contador.countVowels("Holaa ")); //Imprimimos la cantidad de vocales
        System.out.println("Cantidad de consonantes: " + contador.countConsonant("Holaa ")); //Imprimimos la cantidad de consonantes
        System.out.println("Cantidad de palabras mayor a 2: " + contador.palabrasMayores("Hoy es 8 de marzo", 2)); // Prueba del método para contar las
        // palabras de largo mayor al indicado por x

        String[] words = FileReader.reader("../Trabajo/src/main/java/com/mycompany/Principal/info.txt");
        for(int i=0; i<words.length;i++){
            System.out.println(words[i]);   //Corroborando que el array contenga las lineas del archivo
        }
        System.out.println("Cantidad de palabras en el archivo: " + FileReader.amountOfWords(words)); //Corroborando que se cuente bien la cantidad de palabras
    }
}
