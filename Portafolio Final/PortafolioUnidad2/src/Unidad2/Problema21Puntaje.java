package Unidad2;
import java.util.Scanner;

public class Problema21Puntaje {

	public static void main(String[] args) {
		int correctas, incorrectas, en_blanco, puntaje_total;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el número de respuestas correctas: ");
		correctas = entrada.nextInt();
		System.out.print("Escribe el número de respuestas incorrectas: ");
		incorrectas = entrada.nextInt();
		System.out.print("Escribe el número de respuestas en blanco: ");
		en_blanco = entrada.nextInt();
		puntaje_total = (correctas * 4) - (incorrectas * 1) + (en_blanco * 0);
		System.out.print("Puntaje total: " + puntaje_total);
	}
}