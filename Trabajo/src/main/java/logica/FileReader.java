package logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public static ContadorPalabras contadorPalabras = new ContadorPalabras();

    public static String[] reader(String path) throws FileNotFoundException {
        List<String> output = new ArrayList<>();
        File file = new File(path);
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            output.add(reader.nextLine());
        }
        return output.toArray(new String[0]);
    }

    public static Integer amountOfWords(String[] array){
        int counter = 0;
        for(int i=0 ; i<array.length; i++){
            counter+=contadorPalabras.contarPalabras(array[i]);
        }
        return counter;
    }
    public static void main(String[] args) throws FileNotFoundException {

    }
}
