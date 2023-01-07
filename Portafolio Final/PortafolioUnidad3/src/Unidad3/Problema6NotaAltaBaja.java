package Unidad3;
import java.util.Scanner;

public class Problema6NotaAltaBaja {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe la nota: ");
		double nota = entrada.nextDouble();
		if (nota >= 100)
		{
			System.out.print("Es una nota ALTA");
		}
		else
		{
			System.out.print("Es una nota BAJA");
		}
	}
}