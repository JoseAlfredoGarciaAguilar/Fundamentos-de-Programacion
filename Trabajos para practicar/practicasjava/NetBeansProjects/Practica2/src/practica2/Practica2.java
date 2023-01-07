//Escribe un programa que lea de teclado la edad de 10 personas y obtén como resultado el promedio de las edades.
package practica2;

import java.util.Scanner;

public class Practica2 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double sumaEdad = 0;
        for (int x = 1; x <= 10; x++) {
            System.out.println("Ingrese la edad");
            int edad = in.nextInt();
            sumaEdad = sumaEdad + edad;

        }

        System.out.println("El promedio de edades es:  " + sumaEdad / 10);
    }

}
