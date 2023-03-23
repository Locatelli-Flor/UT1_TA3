package logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public static ContadorPalabras contadorPalabras = new ContadorPalabras(); 

    public static String[] reader(String path) throws FileNotFoundException { // Método que toma como parámetro un string que corresponde a la ruta de un archivo
        List<String> output = new ArrayList<>();                              
        File file = new File(path);
        Scanner reader = new Scanner(file); // A través de un objeto de clase Scanner (que permite leer datos primitivos) se implementó un bucle while para leer
        while(reader.hasNextLine()){        // cada línea del archivo y devolver un array de strings
            output.add(reader.nextLine());
        }
        return output.toArray(new String[0]);
    }

    public static Integer amountOfWords(String[] array){ // Método que cuenta las palabras de un array de strings
        int counter = 0;
        for(int i=0 ; i<array.length; i++){                     // a través de un bucle for que termine cuando el iterador llegue al tamaño del array y un contador,
            counter+=contadorPalabras.contarPalabras(array[i]); // se cuentan las palabras y se devuelve el contador
        }
        return counter;
    }
}
