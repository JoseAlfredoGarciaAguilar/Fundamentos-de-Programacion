package Unidad3;
import java.util.Scanner;

public class Problema34TablaDeCalificaciones {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Calificaciones del Examen de Historia");
		int contador = 1;
		double cal1 = 0, cal2 = 0, cal3 = 0, cal4 = 0, cal5 = 0, cal6 = 0, cal7 = 0, cal8 = 0, cal9 = 0, cal10 = 0;
		double c = 0;
		while(contador <= 10)
		{
			System.out.print("Ingresa la Calificación " + contador + ": ");
			cal1 = entrada.nextDouble();
			contador = contador + 1;
			
			System.out.print("Ingresa la Calificación " + contador + ": ");
			cal2 = entrada.nextDouble();
			contador = contador + 1;
			
			System.out.print("Ingresa la Calificación " + contador + ": ");
			cal3 = entrada.nextDouble();
			contador = contador + 1;
			
			System.out.print("Ingresa la Calificación " + contador + ": ");
			cal4 = entrada.nextDouble();
			contador = contador + 1;
			
			System.out.print("Ingresa la Calificación " + contador + ": ");
			cal5 = entrada.nextDouble();
			contador = contador + 1;
			
			System.out.print("Ingresa la Calificación " + contador + ": ");
			cal6 = entrada.nextDouble();
			contador = contador + 1;
			
			System.out.print("Ingresa la Calificación " + contador + ": ");
			cal7 = entrada.nextDouble();
			contador = contador + 1;
			
			System.out.print("Ingresa la Calificación " + contador + ": ");
			cal8 = entrada.nextDouble();
			contador = contador + 1;
			
			System.out.print("Ingresa la Calificación " + contador + ": ");
			cal9 = entrada.nextDouble();
			contador = contador + 1;
			
			System.out.print("Ingresa la Calificación " + contador + ": ");
			cal10 = entrada.nextDouble();
			contador = contador + 1;
		}
		
		System.out.println(" ");
		System.out.println("*Tabla de Calificaciones*");
		System.out.println("Alumno 1, obtuvo: " + cal1);
		System.out.println("Alumno 2, obtuvo: " + cal2);
		System.out.println("Alumno 3, obtuvo: " + cal3);
		System.out.println("Alumno 4, obtuvo: " + cal4);
		System.out.println("Alumno 5, obtuvo: " + cal5);
		System.out.println("Alumno 6, obtuvo: " + cal6);
		System.out.println("Alumno 7, obtuvo: " + cal7);
		System.out.println("Alumno 8, obtuvo: " + cal8);
		System.out.println("Alumno 9, obtuvo: " + cal9);
		System.out.println("Alumno 10, obtuvo: " + cal10);
	}
}