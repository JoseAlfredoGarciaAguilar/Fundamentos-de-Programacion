package Portafolio;
import java.util.Scanner;

public class InvocarAUnaFuncion2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		for(int a=0; a<=6; a++) {
			System.out.println("Hola Mundo, ya llegué");
		}
		
		System.out.println("Escribe el valor de x: ");
		double x = entrada.nextDouble();
		double v = x*2;
		System.out.println(v);
	}
}