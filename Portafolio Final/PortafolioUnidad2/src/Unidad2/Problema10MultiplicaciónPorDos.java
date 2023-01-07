package Unidad2;
import java.util.Scanner;

public class Problema10MultiplicaciónPorDos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un número entero: ");
		int numero_entero;
		numero_entero = teclado.nextInt();
		double resultado = (numero_entero * 2);
		System.out.print("Resultado: " + resultado);
	}
}