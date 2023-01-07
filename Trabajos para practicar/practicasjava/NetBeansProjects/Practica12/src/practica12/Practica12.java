//Escribe un programa que lea de teclado un número entero y regrese como resultado en pantalla todos sus divisores.
package practica12;

import java.util.Scanner;

public class Practica12 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese un numero");
        int numero = in.nextInt();

        System.out.println("Divisores del numero");
        for (int x = 1; x <= numero; x++) {
            if (numero % x == 0) { // Pregunta por los divisores del numero
                System.out.println(x);

            }
        }
    }
}
