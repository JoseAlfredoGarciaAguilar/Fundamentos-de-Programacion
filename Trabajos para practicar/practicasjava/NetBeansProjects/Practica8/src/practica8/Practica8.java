//Escribe un programa que lea de teclado nombre y sexo de 10 personas y obtén como resultado el numero de mujeres.
package practica8;

import java.util.Scanner;

public class Practica8 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorMuj = 0;
        char sexo;
        char mujer = 'F';
        String nombre;
        for (int x = 1; x <= 10; x++) {
            System.out.println("Inserte el nombre");
            nombre = teclado.nextLine();
            System.out.println("Ingrese el sexo");
            sexo = in.next().charAt(0);
            if (sexo == mujer) {
                contadorMuj = contadorMuj + 1;
            }
        }
        System.out.println("El total de mujeres que hay es:   " + contadorMuj);
    }
}

