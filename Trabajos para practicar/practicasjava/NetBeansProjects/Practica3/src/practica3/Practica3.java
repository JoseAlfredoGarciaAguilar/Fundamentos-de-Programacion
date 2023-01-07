//Escribe un programa que lea de teclado un dato entero y determine si este es o no
//un número primo. Los números primos son aquellos que solo tienen dos divisores (ellos mismos y la unidad).
package practica3;

import java.util.Scanner;

public class Practica3 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

 
        int numero; 
        int x = 0;
        
        System.out.println("Ingrese el numero: ");
        numero = in.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            if(numero%i == 0) {
                x++;
            }
        }
        if(x==2) {
            System.out.println("Si es primo");
        } else {
            System.out.println("No es primo");
        }
}
}