package Portafolio;
import java.util.Scanner;

public class NúmeroIgualQue0 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número: ");
		double num = entrada.nextDouble();
		
		if(num > 0)
			System.out.println("El numero es mayor que 0");
		if(num == 0)
			System.out.println("El número es igual que 0");
		if(num < 0)
			System.out.println("El número es menor que 0");
	}
}