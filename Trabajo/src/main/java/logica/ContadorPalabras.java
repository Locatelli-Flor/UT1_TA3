package logica;

import java.util.Arrays;


public class ContadorPalabras {
    
    public int contarPalabras(String frase) { //Cuenta la cantidad de palabras
        boolean hayLetra = false; //Veridica si hay una letra en esa palabra
        int cantPalabras = 0; //Almacena la cantidad de palabras
        frase = frase.trim() + " "; //Quito los espacios de la frase

        if (frase.length() > 1){ //Verifico que el string tenga caracteres
            for(int i=0; i<frase.length(); i++){
                if (Character.isLetter(frase.charAt(i))) { //Verifico que haya una letra
                    hayLetra = true;
                }
                if ((frase.charAt(i) == ' ') && (frase.charAt(i-1) != ' ') && (hayLetra)) { //Verifico que la palabra se divide por un espacio y hay una letra en la palabra
                    cantPalabras++;
                    hayLetra = false;
                }
            }
        }
        return cantPalabras;
    }
    
    public int countVowels(String phrase){ //Metodo que cuenta la cantidad de vocales en un string
        Character[] vowels = {'a', 'e', 'i', 'o', 'u'}; //Vocales
        int count = 0;
        for(int i =0; i< phrase.length(); i++){
            if(Arrays.asList(vowels).contains((phrase.toLowerCase().charAt(i)))){ //Si el caracter es una vocal entonces suma 1
                count++;
            }
        }
        return count;
    }
    
    public Integer countConsonant(String phrase){ //Metodo que cuenta la cantidad de consonantes en un string
        int counter= 0;
        for(int i=0; i< phrase.length(); i++){
            if(Character.isLetter(phrase.charAt(i))){
                counter++; //Cuento la cantidad de letras
            }
        }
        return counter-countVowels(phrase); //Calculo las consonantes en base a la cantidad de vocales menos la cantidad de letras
    }

    public int palabrasMayores(String frase, int x) {
        boolean hayLetra = false;
        int cantPalabras = 0;
        int contadorCaracteres = 0;
        frase = frase.trim() + " "; // Agregamos un espacio al final para que el programa cuente la última palabra
        
        if (frase.length() > 1){ //Verificamos que el string no este vacio
            for (int i = 0; i < frase.length(); i++) { // Iterar sobre el string
                contadorCaracteres += 1; // Contar la cantidad de caractéres

                if (Character.isLetter(frase.charAt(i))) {
                    hayLetra = true; // Determinar si en la palabra hay una letra
                }
                if ((frase.charAt(i) == ' ') && (frase.charAt(i - 1) != ' ')) { // Si el caractér es un espacio, el anterior no fue uno, hay una letra y el contador de caracteres es mayor al valor de x
                    if (((contadorCaracteres - 1) > x) && (hayLetra)) {
                        cantPalabras += 1; // Sumar uno a la cantidad de palabras que tienen un largo mayor al dado por x
                    }
                    contadorCaracteres = 0; // Resetear el contador de caracteres para contar los siguientes
                    hayLetra = false; // Devolver a falso la variable para determinar si en los caracteres siguientes hay una letra
                }
            }
        }
        return cantPalabras;
    }
}