package Portafolio;
import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un n�mero entero: ");
		int a = entrada.nextInt();
		System.out.println("Escribe otro n�mero entero: ");
		int b = entrada.nextInt();
		int residuo = a%b;
		if(residuo == 0) {
			System.out.println("Los n�meros son divisibles");
		}
		else {
			System.out.println("Los n�meros no son divisibles");
		}
	}
}