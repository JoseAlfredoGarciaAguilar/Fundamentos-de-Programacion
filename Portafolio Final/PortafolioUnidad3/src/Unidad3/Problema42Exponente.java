package Unidad3;
import java.util.Scanner;

public class Problema42Exponente {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿Qué número quieres elevar?: ");
		double numero = entrada.nextDouble();
		System.out.print("¿A qué potencia quieres elevar el número?: ");
		int potencia = entrada.nextInt();
		
			double resultado = Math.pow(numero, potencia);
			System.out.println(numero + " elevado a " + potencia + " = " + resultado);
	}
}