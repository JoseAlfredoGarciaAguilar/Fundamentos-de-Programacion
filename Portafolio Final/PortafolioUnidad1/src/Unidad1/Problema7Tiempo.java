package Unidad1;
import java.util.Scanner;

public class Problema7Tiempo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el tiempo expresado en Segundos: ");
		double tiempo_segundos = entrada.nextDouble();
		
		double tiempo_horas = tiempo_segundos / 3600;
		double tiempo_minutos = tiempo_segundos / 60;
		
		System.out.println("N�mero de Horas = " + tiempo_horas);
		System.out.println("N�mero de Minutos = " + tiempo_minutos);
		System.out.println("N�mero de Segundos = " + tiempo_segundos);
	}
}