package Tarea2;
import java.util.Scanner;
//PROGRAMA QUE AL INSERTAR UN A�O, DETERMINA SI ES O NO ES BICIESTO
public class Problema5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-Programa que determina si el a�o insertado, es biciesto");
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