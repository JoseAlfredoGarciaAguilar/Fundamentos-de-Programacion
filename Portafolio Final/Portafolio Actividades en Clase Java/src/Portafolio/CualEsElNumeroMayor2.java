package Portafolio;
import java.util.Scanner;

public class CualEsElNumeroMayor2 {

	public static void main(String[] args) {
		double mayor = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un número: ");
		double a = entrada.nextDouble();
		System.out.println("Ingresa otro número: ");
		double b = entrada.nextDouble();
		System.out.println("Ingresa algún otro número: ");
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
		System.out.println("El número mayor es: " + mayor);
	}
}