package Portafolio;
import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número entero: ");
		int a = entrada.nextInt();
		System.out.println("Escribe otro número entero: ");
		int b = entrada.nextInt();
		int residuo = a%b;
		if(residuo == 0) {
			System.out.println("Los números son divisibles");
		}
		else {
			System.out.println("Los números no son divisibles");
		}
	}
}