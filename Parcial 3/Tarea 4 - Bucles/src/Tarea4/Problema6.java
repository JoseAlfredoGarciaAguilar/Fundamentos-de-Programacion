package Tarea4;
import java.util.Scanner;
//PROGRAMA QUE AL INGRESAR UN N�MERO, IMPRIME SI ES PERFECTO O NO, Y ADEM�S SI ES PAR O IMPAR
public class Problema6 {

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