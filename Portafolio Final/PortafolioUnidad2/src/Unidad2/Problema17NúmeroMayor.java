package Unidad2;
import java.util.Scanner;

public class Problema17NúmeroMayor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float num1, num2, numMayor;
		System.out.print("Escribe un número: ");
		num1 = entrada.nextFloat();
		System.out.print("Escribe otro número: ");
		num2 = entrada.nextFloat();
		numMayor = num1 > num2 ? num1 : num2;
		System.out.print("El número mayor es: " + numMayor);
	}
}