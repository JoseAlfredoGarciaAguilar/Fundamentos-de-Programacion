//Escribe un programa que lea de teclado x números enteros hasta que el número leído sea 0.
package practica1;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0;

        System.out.println("Insertar el numero entero (el 0 para salir)");
        do {
            numero = in.nextInt();

        } while (numero != 0);
    }

}
