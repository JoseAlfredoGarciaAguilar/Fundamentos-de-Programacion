package Portafolio;
import java.util.Scanner;

public class MayorCero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un N�mero: ");
		int num = entrada.nextInt();
		if (num > 0) {
			System.out.println(num*num);
		}
		System.out.println("Adi�s");
	}
}