package Unidad3;
import java.util.Scanner;

public class Problema42Exponente {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("�Qu� n�mero quieres elevar?: ");
		double numero = entrada.nextDouble();
		System.out.print("�A qu� potencia quieres elevar el n�mero?: ");
		int potencia = entrada.nextInt();
		
			double resultado = Math.pow(numero, potencia);
			System.out.println(numero + " elevado a " + potencia + " = " + resultado);
	}
}