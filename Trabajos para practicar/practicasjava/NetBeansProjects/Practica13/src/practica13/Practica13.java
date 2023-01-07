//Escribe un programa que lea de teclado un String y regrese un mensaje indicando si el String es un palíndromo.
package practica13;

import java.util.Scanner;

public class Practica13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String palabra, alreves = "";
        System.out.println("Ingrese una palabra");
        palabra = teclado.nextLine();
        for (int x = palabra.length() - 1; x >= 0; x--) {//El ciclo me servira para poner las palabras alreves, introduciendo el metodo
            //lenght para la cantidad de caracteres que introduzco
            alreves += palabra.charAt(x);//sacando cada uno de los caracteres de a palabra, se alamacenan en la otra variable
        }
        if (palabra.equals(alreves)) {//Comprara con equals las dos cadenas de caracteres
            System.out.println("Si es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}