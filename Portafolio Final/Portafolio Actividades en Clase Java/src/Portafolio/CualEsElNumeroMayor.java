package Portafolio;
import java.util.Scanner;

public class CualEsElNumeroMayor {

	public static void main(String[] args) {
		double mayor;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un n�mero: ");
		double a = entrada.nextDouble();
		System.out.println("Ingresa otro n�mero: ");
		double b = entrada.nextDouble();
		System.out.println("Ingresa alg�n otro n�mero: ");
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
		System.out.println("El n�mero mayor es: " + mayor);
	}
}