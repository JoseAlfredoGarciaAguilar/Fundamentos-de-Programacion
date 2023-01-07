package Unidad1;
import java.util.Scanner;

public class Problema5UnidadesDecenasYCentenas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el número que deseas desglosar: ");
		int num = entrada.nextInt();
		
		int centenas = ((num % 1000)/100);
		int decenas = ((num % 100)/10);
		int unidades = (num % 10);
		
		System.out.println("Número de Centenas = " + centenas);
		System.out.println("Número de Decenas = " + decenas);
		System.out.println("Número de Unidades = " + unidades);
	}
}