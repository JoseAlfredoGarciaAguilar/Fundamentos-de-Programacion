package Unidad3;
import java.util.Scanner;

public class Problema58PerfectoImperfectoParImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int suma = 0;
		System.out.print("Digita un n�mero: ");
		int numero = entrada.nextInt();
		for(int i=1; i<numero; i++)
		{
			if(numero % i == 0)
				suma = suma + i;
		}
		if(suma==numero)
			System.out.println("�El n�mero es perfecto!");
		else
			System.out.println("�El n�mero no es perfecto!");

		if(numero % 2 == 0)
			System.out.println("�Adem�s, el n�mero es par!");
		else
			System.out.println("�Adem�s, el n�mero es impar!");
	}
}