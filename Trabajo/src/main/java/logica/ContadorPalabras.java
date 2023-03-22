package logica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Erik Hernandez
 */
public class ContadorPalabras {
        boolean hayLetra = false;
    public int contarPalabras(String frase){
        int cantPalabras = 0;
        int posicion = 0;
        String palabra;
        frase = frase.trim() + " ";
        for(int i=1; i<frase.length(); i++){
            if (Character.isLetter(frase.charAt(i))) {
                hayLetra = true;
            }
            if ((frase.charAt(i) == ' ') && (frase.charAt(i-1) != ' ') && (hayLetra)) {
                cantPalabras++;
                hayLetra = false;
            }
        }
        
            return cantPalabras;
        
    }
}
