package Portafolio;
import java.util.Scanner;

public class N�meroIgualQue0 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un n�mero: ");
		double num = entrada.nextDouble();
		
		if(num > 0)
			System.out.println("El numero es mayor que 0");
		if(num == 0)
			System.out.println("El n�mero es igual que 0");
		if(num < 0)
			System.out.println("El n�mero es menor que 0");
	}
}