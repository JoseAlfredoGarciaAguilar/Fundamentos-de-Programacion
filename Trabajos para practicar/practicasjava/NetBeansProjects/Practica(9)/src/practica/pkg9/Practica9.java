
package practica.pkg9;

import java.util.Scanner;

public class Practica9 {
 static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contadorMuj = 0;
        int contadorHom = 0;
        char mujer = 'F';
        char hombre = 'M';
        char sexo;
        for (int x = 1; x <= 10; x++) {
            System.out.println("Ingrese el nombre");
            String nombre;
            nombre = teclado.nextLine();
            System.out.println("Ingrese el sexo");
            sexo = in.next().charAt(0);

            if (sexo == mujer) {
                contadorMuj = contadorMuj + 1;
            }
            if (sexo == hombre) {
                contadorHom = contadorHom + 1;
            }
        }
        System.out.println("El total de mujeres que hay es:   " + contadorMuj);
        System.out.println("El total de hombres que hay es:  " + contadorHom);
    }
}


