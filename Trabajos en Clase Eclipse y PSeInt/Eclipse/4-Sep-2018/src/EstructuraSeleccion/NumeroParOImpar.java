package EstructuraSeleccion;
import java.util.Scanner;

public class NumeroParOImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		int num = entrada.nextInt();
		if (num % 2 == 0)
		{
			System.out.print("El número es par");
		}
		else
		{
			System.out.print("El número es impar");
		}
	}
}