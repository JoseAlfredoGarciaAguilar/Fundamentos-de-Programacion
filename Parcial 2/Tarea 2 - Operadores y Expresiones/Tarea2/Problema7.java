package Tarea2;
import java.util.Scanner;

public class Problema7 {

	public static void main(String[] args) {
		float cantidad1;
		float cantidad2;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe la cantidad 1: ");
		cantidad1 = entrada.nextFloat();
		System.out.print("Escribe la cantidad 2: ");
		cantidad2 = entrada.nextFloat();
		float suma = cantidad1 + cantidad2;
		System.out.print("Resultado de la suma: " + suma);
	}
}