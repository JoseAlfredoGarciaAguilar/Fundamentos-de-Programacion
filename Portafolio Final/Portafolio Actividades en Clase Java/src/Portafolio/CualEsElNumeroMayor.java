package Portafolio;
import java.util.Scanner;

public class CualEsElNumeroMayor {

	public static void main(String[] args) {
		double mayor;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un número: ");
		double a = entrada.nextDouble();
		System.out.println("Ingresa otro número: ");
		double b = entrada.nextDouble();
		System.out.println("Ingresa algún otro número: ");
		double c = entrada.nextDouble();

		if(a>b) {
			if(a>c) {
				mayor=a;
			}
			else {
				mayor=c;
			}
		}
		else {
			if(b>c) {
				mayor=b;
			}
			else {
				mayor=c;
			}
		}
		System.out.println("El número mayor es: " + mayor);
	}
}