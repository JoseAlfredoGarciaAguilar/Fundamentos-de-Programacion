//Escribe un programa que lea de teclado dos números que representan día y mes 
//y determine la estación del año en la que se encuentra esa fecha.
package practica6;

import java.util.Scanner;

public class Practica6 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insertar dia");
        int dia = in.nextInt();
        System.out.println("Insertar mes");
        int mes = in.nextInt();

        if ((mes < 13 && mes > 0) || (dia < 32 && dia > 0)) {
        }
        if ((mes == 3 && dia < 20) || (mes == 4 && dia > 0) || (mes == 5 && dia < 0) || (mes == 6 && dia < 21)) {
            System.out.println("Primavera");

        }
        if ((mes == 6 && dia > 20) || (mes == 7 && dia > 0) || (mes == 8 && dia > 0) || (mes == 9 && dia < 21)) {
            System.out.println("Verano");
        }
        if ((mes == 9 && dia > 20) || (mes == 10 && dia > 0) || (mes == 11 && dia > 0) || (mes == 12 && dia < 21)) {
            System.out.println("Otoño");
        }
        if ((mes == 12 && dia > 20) || (mes == 1 && dia > 0) || (mes == 2 && dia > 0) || (mes == 3 && dia < 21)) {
            System.out.println("Invierno");
        } else {
            System.out.println("INVALIDO");
        }
    }
}
