package Unidad1;
import java.util.Scanner;

public class Problema6Pulgadas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el N�mero de Cent�metros: ");
		double centimetros = entrada.nextDouble();
		
		double pulgadas = centimetros / 2.54;
		System.out.print("N�mero de Pulgadas = " + pulgadas);
	}
}