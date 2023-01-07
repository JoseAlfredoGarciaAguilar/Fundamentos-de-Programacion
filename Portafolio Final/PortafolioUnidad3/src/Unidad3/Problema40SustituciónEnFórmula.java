package Unidad3;
import java.util.Scanner;

public class Problema40SustituciónEnFórmula {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		for(int i = 1; i <= 5; i++);
		{
			double n, f;
			System.out.print("Escribe el número a sustituir en la fórmula: ");
			n = entrada.nextDouble();
			f = 1 + 2 + 3 + (n-1) + n;
			System.out.print("Resultado de la Sustitución = " + f);		
		}
	}
}