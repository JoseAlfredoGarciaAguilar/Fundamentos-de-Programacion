package Unidad1;
import java.util.Scanner;

public class Problema4Las4OperacionesB�sicas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe un n�mero: ");
		double n1 = entrada.nextDouble();
		System.out.print("Escribe alg�n otro n�mero: ");
		double n2 = entrada.nextDouble();
		
		double suma = n1 + n2;
		double resta = n1 - n2;
		double multiplicacion = n1 * n2;
		double division = (int)(n1 / n2);
		double residuo = n1 % n2;
		System.out.println("Suma = " + suma);
		System.out.println("Resta = " + resta);
		System.out.println("Multiplicaci�n = " + multiplicacion);
		System.out.println("Divisi�n = " + division);
		System.out.println("Residuo o M�dulo de la Divisi�n = " + residuo);
	}
}