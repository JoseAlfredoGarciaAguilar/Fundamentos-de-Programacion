package Portafolio;
import java.util.Scanner;

public class CualEsElNumeroMayor2 {

	public static void main(String[] args) {
		double mayor = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un n�mero: ");
		double a = entrada.nextDouble();
		System.out.println("Ingresa otro n�mero: ");
		double b = entrada.nextDouble();
		System.out.println("Ingresa alg�n otro n�mero: ");
		double c = entrada.nextDouble();
		
		if((a>b) && (a>c)) {
			mayor = a;
		}
		if((b>a) && (b>c)) {
			mayor = b;
		}
		if((c>a) && (c>b)) {
			mayor = c;
		}
		System.out.println("El n�mero mayor es: " + mayor);
	}
}