package Unidad3;
import java.util.Scanner;

public class Problema26AñoBisiesto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
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