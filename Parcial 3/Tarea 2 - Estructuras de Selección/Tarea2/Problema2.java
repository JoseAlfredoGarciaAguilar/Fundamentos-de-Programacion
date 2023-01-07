package Tarea2;
import java.util.Scanner;
//PROGRAMA QUE IMPRIME LA HORA EN FORMATO DE 12 HORAS, AL INSERTARLA EN FORMATO DE 24 HORAS
public class Problema2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-Programa para convertir de formato de 24 horas a 12 horas-");
		System.out.print("Escribe las Horas: ");
		int horas = entrada.nextInt();
		System.out.print("Escribe los Minutos: ");
		int minutos = entrada.nextInt();
		int horafinal;
		
		horafinal = horas - 12;
		System.out.print("La hora en Formato de 12 Horas es: " + horafinal + ":" + minutos);
	}
}