package Unidad3;
import java.util.Scanner;

public class Problema26A�oBisiesto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el a�o: ");
		int a�o = entrada.nextInt();
		
		if(a�o % 4 == 0)
		{
			System.out.println("�S� es un a�o biciesto!");
		}
		else
		{
			System.out.println("�No es un a�o biciesto!");
		}
	}
}