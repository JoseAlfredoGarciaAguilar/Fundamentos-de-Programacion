package EstructuraSeleccion;
import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe un n�mero: ");
		short num = entrada.nextShort();
		if (num > 0)
		{
			System.out.print("El n�mero es mayor que 0");
		}
		if (num < 0)
		{
			System.out.print("El n�mero es menor que 0");
		}
		if (num == 0)
		{
			System.out.print("El n�mero es igual que 0");
		}
	}
}