package EstructuraSeleccion;
import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		short num = entrada.nextShort();
		if (num > 0)
		{
			System.out.print("El número es mayor que 0");
		}
		if (num < 0)
		{
			System.out.print("El número es menor que 0");
		}
		if (num == 0)
		{
			System.out.print("El número es igual que 0");
		}
	}
}