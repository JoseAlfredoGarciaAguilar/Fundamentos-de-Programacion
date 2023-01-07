package Unidad3;
import java.util.Scanner;

public class Problema10MenorIgualMayorQue100{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe un número: ");
		double cantidad = entrada.nextDouble();
		
		if(cantidad > 100)
			System.out.print("El número es mayor que 100");
		else if(cantidad < 100)
			System.out.print("El número es menor que 100");
		else
			System.out.print("El número es igual que 100");
	}
}