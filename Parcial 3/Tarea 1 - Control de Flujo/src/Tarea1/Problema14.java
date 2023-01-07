package Tarea1;
import java.util.Scanner;

public class Problema14 {
static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("-Programa que imprime el promedio de un estudiante, y a ese promedio le da una nota en letras-");
		System.out.print("Escribe la calificación de la Unidad 1: ");
		float calificacion1 = entrada.nextFloat();
		System.out.print("Escribe la calificación de la Unidad 2: ");
		float calificacion2 = entrada.nextFloat();
		System.out.print("Escribe la calificación de la Unidad 3: ");
		float calificacion3 = entrada.nextFloat();
		System.out.print("Escribe la calificación de la Unidad 4: ");
		float calificacion4 = entrada.nextFloat();
		float promedio = (float) ((calificacion1 + calificacion2 + calificacion3 + calificacion4) / 4);
		System.out.println("Promedio de las 4 Unidades: " + promedio);
		
		if((promedio >= 90) && (promedio <= 100))
			System.out.print("La nota es A");
		
		else if((promedio >= 80) && (promedio <= 89))
			System.out.print("La nota es B");
		
		else if((promedio >= 70) && (promedio <= 79))
			System.out.print("La nota es C");
		
		else if((promedio >= 60) && (promedio <= 69))
			System.out.print("La nota es D");
		
		else if((promedio >= 0) && (promedio <= 59))
			System.out.print("La nota es E");
		
		else
			System.out.print("ERROR");
		}
	}