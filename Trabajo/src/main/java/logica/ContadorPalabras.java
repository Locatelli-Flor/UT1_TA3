package logica;


public class ContadorPalabras {
    boolean hayLetra = false;

    public int contarPalabras(String frase) {
        int cantPalabras = 0;
        int posicion = 0;
        String palabra;
        frase = frase.trim() + " "; // Agregamos un espacio al final para que el programa cuente la última palabra
        for (int i = 1; i < frase.length(); i++) { // Iterar sobre el string
            if (Character.isLetter(frase.charAt(i))) {
                hayLetra = true; // Determinar si en la palabra hay una letra
            }
            if ((frase.charAt(i) == ' ') && (frase.charAt(i - 1) != ' ') && (hayLetra)) { // Si el caractér es un espacio, el anterior no era un espacio y hay una letra significa que hay una palabra
                cantPalabras++; // Sumar uno a la cantidad de palabras
                hayLetra = false; // Devolver a false la variable para determinar si en los caractéres siguientes hay una letra.
            }
        }

        return cantPalabras;

    }

    public int palabrasMayores(String frase, int x) {
        int cantPalabras = 0;
        int contadorCaracteres = 0;
        frase = frase.trim() + " "; // Agregamos un espacio al final para que el programa cuente la última palabra

        for (int i = 1; i < frase.length(); i++) { // Iterar sobre el string

            contadorCaracteres += 1; // Contar la cantidad de caractéres
            if (Character.isLetter(frase.charAt(i))) {
                hayLetra = true; // Determinar si en la palabra hay una letra
            }

            if ((frase.charAt(i) == ' ') && (frase.charAt(i - 1) != ' ') && (hayLetra) && contadorCaracteres > x) { // Si el caractér es un espacio, el anterior no fue uno, hay una letra y el contador de caracteres es mayor al valor de x
                contadorCaracteres = 0; // Resetear el contador de caracteres para contar los siguientes
                cantPalabras += 1; // Sumar uno a la cantidad de palabras que tienen un largo mayor al dado por x
                hayLetra = false; // Devolver a falso la variable para determinar si en los caracteres siguientes hay una letra
            }

        }

        return cantPalabras;

    }
}