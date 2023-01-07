package Tarea2;
import java.util.Scanner;
//PROGRAMA QUE AL INSERTAR UN AÑO, DETERMINA SI ES O NO ES BICIESTO
public class Problema5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-Programa que determina si el año insertado, es biciesto");
		System.out.print("Escribe el año: ");
		int año = entrada.nextInt();
		
		if(año % 4 == 0)
		{
			System.out.println("¡Sí es un año biciesto!");
		}
		else
		{
			System.out.println("¡No es un año biciesto!");
		}
	}
}