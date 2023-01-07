package Portafolio;
import java.util.Scanner;

public class CalculoDistancia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Proporciona Velocidad en Metros/segundo: ");
		int v = entrada.nextInt();
		System.out.println("Proporciona Tiempo en Segundos: ");
		int t = entrada.nextInt();
		double d = v*t;
		System.out.println("Distancia = " + d);
	}
}