//Escribe un programa que lea de teclado nombre, edad y sexo de 10 personas y obtén como resultado el numero de mujeres, el promedio de
//edad de las mujeres y el nombre de la mas joven.

package practica.pkg10;
import java.util.Scanner;

public class Practica10 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        double contadorMuj = 0;
        int contadorHom = 0;
        char mujer = 'F';
        char hombre = 'M';
        char sexo;
        double contarEdad = 0;
        double promedioEdad = 0;
        String nombreJoven = "";
        int joven = 1000;
        for (int x = 1; x <= 2; x++) {
            System.out.println("Ingrese el nombre");
            String nombre;
            nombre = teclado.nextLine();
            System.out.println("Ingrese el sexo");
            sexo = in.next().charAt(0);
            System.out.println("Ingrese la edad");
            int edad = in.nextInt();
            if (sexo == mujer) {
                contadorMuj = contadorMuj + 1;
                contarEdad = edad + contarEdad;
                promedioEdad = contarEdad / contadorMuj;
            if (edad < joven) {
                joven = edad;
                nombreJoven = nombre;
            }
        }
        }
        System.out.println("El total de mujeres que hay es:   " + contadorMuj);
        System.out.println("El promedio total de mujeres es:  " + promedioEdad);
        System.out.println(nombreJoven);
    }

}


