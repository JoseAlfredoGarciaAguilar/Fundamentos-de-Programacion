package EstructuraSeleccion;
import java.util.Scanner;

public class MayorCero {

	public static void main(String[] args) {
		double numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		numero = teclado.nextDouble();
		if(numero > 0)
		{
			System.out.println(numero * numero);
		}
			System.out.println("Adiós");
	}
}