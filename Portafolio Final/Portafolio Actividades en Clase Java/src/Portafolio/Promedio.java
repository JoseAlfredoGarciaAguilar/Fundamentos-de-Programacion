package Portafolio;
import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame el Promedio el Parcial 1: ");
		double p1 = entrada.nextDouble();
		System.out.println("Dame el Promedio el Parcial 2: ");
		double p2 = entrada.nextDouble();
		System.out.println("Dame el Promedio el Parcial 3: ");
		double p3 = entrada.nextDouble();
		double prom = (p1+p2+p3)/3;
		System.out.println("Promedio Final = " + prom);
	}
}
