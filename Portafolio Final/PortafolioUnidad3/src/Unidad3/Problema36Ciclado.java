package Unidad3;
import java.util.Scanner;
public class Problema36Ciclado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i=1;
		System.out.print("Ingresa un número: ");
		double n = entrada.nextInt();

		while (i<=n) {
			if((i%n)==0)
			{
				i++;
			}
		System.out.println(i);
	}
}
}