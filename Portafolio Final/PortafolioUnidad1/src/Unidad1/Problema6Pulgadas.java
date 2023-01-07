package Unidad1;
import java.util.Scanner;

public class Problema6Pulgadas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el Número de Centímetros: ");
		double centimetros = entrada.nextDouble();
		
		double pulgadas = centimetros / 2.54;
		System.out.print("Número de Pulgadas = " + pulgadas);
	}
}