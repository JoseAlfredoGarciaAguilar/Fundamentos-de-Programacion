package Unidad3;
import java.util.Scanner;

public class Problema60NúmeroPrimo {

	public static void main(String[] args) {
		Scanner obtenerNumero = new Scanner(System.in);
        int contador=0,I,numero;
 
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();
 
        for(I = 1; I <= numero; I++)
        {
            if((numero % I) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }
        else
        {
            System.out.println("El numero no es primo");
        }
    }
}