package EstructuraSeleccion;
import java.util.Scanner;

public class Numero2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		float num = entrada.nextFloat();
		/*
		if (num > 0)
			System.out.print("Es mayor que 0");
		if (num < 0)
			System.out.print("Es menor que 0");
		if (num == 0)
			System.out.print("Es igual que 0");
		*/
		if (num > 0)
			System.out.print("Es mayor que 0");
		else if (num < 0)
			System.out.print("Es menor que 0");
		else
			System.out.print("Es igual que 0");
	}
}