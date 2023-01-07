package Problemas;
import java.util.Scanner;

public class Problema3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Qúe valor quieres darle a la letra a?: ");
		double valor_letra_a = entrada.nextDouble();
		System.out.println("¿Qué valor quieres darle a la letra b?: ");
		double valor_letra_b = entrada.nextDouble();
		//Operador de asignación
		System.out.println("Valor de a = " + valor_letra_a);
		System.out.println("Valor de b = " + valor_letra_b);
		int aux = (int) valor_letra_a;
		valor_letra_a = valor_letra_b;
		valor_letra_b = aux;
		System.out.println("Valor de a = " + valor_letra_a);
		System.out.println("Valor de b = " + valor_letra_b);
	}
}