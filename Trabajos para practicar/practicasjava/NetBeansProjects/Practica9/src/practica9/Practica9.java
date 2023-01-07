//Escribe un programa que lea 2 datos, nombre y edad de 2 personas 
//y obtenga el nombre de la mas pequeña.
package practica9;

import java.util.Scanner;

public class Practica9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Scanner teclado = new Scanner(System.in); //Utilizo Scanner teclado para que pueda leer el nombre sin saltarselo
        System.out.println("Insertar nombre");
        String nombre;
        nombre = teclado.nextLine();
        System.out.println("Insertar edad");
        int edad1 = in.nextInt();

        System.out.println("Insertar nombre");
        String nomb;
        nomb = teclado.nextLine();
        System.out.println("Insertar edad");
        int edad2 = in.nextInt();

        if (edad1 < edad2) {
            System.out.println("El nombre del mas joven es:  " + nombre);
        }
        if (edad2 < edad1) {
            System.out.println("El nombre del mas joven es:  " + nomb);
        }
    }
}
