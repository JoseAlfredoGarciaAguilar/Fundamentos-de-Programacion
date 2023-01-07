package Unidad1;
import java.util.Scanner;

public class Problema4Las4OperacionesBásicas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Escribe algún otro número: ");
		double n2 = entrada.nextDouble();
		
		double suma = n1 + n2;
		double resta = n1 - n2;
		double multiplicacion = n1 * n2;
		double division = (int)(n1 / n2);
		double residuo = n1 % n2;
		System.out.println("Suma = " + suma);
		System.out.println("Resta = " + resta);
		System.out.println("Multiplicación = " + multiplicacion);
		System.out.println("División = " + division);
		System.out.println("Residuo o Módulo de la División = " + residuo);
	}
}