package Tarea3;
import java.util.Scanner;
//PROGRAMA QUE AL INSERTAR UN VALOR n, LO SUSTITUYE EN LA F�RMULA 1 + 2 + 3 + (n-1) + n
public class Problema7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		for(int i = 1; i <= 5; i++);
		{
			double n, f;
			System.out.print("Escribe el n�mero a sustituir en la f�rmula: ");
			n = entrada.nextDouble();
			f = 1 + 2 + 3 + (n-1) + n;
			System.out.print("Resultado de la Sustituci�n = " + f);		
		}
	}
}