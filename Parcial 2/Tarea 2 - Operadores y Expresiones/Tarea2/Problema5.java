package Tarea2;
import java.util.Scanner;

public class Problema5 {

	public static void main(String[] args) {
		float x;
		float y;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el valor de x: ");
		x = entrada.nextFloat();
		System.out.println("Escribe el valor de y: ");
		y = entrada.nextFloat();
		double division = x / y;
		double modulo = x % y;
		System.out.println("Resultado x / y: " + division);
		System.out.println("Residuo o módulo x / y: " + modulo);
	}
}