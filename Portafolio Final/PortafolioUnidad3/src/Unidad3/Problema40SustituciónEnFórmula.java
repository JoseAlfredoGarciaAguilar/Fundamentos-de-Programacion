package Unidad3;
import java.util.Scanner;

public class Problema40Sustituci�nEnF�rmula {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		for(int i = 1; i <= 5; i++);
		{
			double n, f;
			System.out.print("Escribe el n�mero a sustituir en la f�rmula: ");
			n = entrada.nextDouble();
			f = 1 + 2 + 3 + (n-1) + n;
			System.out.print("Resultado de la Sustituci�n = " + f);		
		}
	}
}