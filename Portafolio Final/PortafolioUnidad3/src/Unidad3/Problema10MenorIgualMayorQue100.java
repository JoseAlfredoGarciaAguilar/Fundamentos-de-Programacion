package Unidad3;
import java.util.Scanner;

public class Problema10MenorIgualMayorQue100{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe un n�mero: ");
		double cantidad = entrada.nextDouble();
		
		if(cantidad > 100)
			System.out.print("El n�mero es mayor que 100");
		else if(cantidad < 100)
			System.out.print("El n�mero es menor que 100");
		else
			System.out.print("El n�mero es igual que 100");
	}
}