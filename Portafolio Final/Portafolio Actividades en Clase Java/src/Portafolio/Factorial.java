package Portafolio;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int facto=1;
		System.out.println("Dame el número de factorial que deseas generar: ");
		int num = entrada.nextInt();
		for(int i=num; i<=1; i--) {
			facto = facto*i;
		}
		System.out.println("Factorial de " + num + " = " + facto);
		}
}