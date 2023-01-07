package Unidad3;
import java.util.Scanner;

public class Problema12CalificaciónEnTexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe la calificación del Alumno: ");
		double calificacion = entrada.nextDouble();
		if (calificacion == 10)
		{
			System.out.print("Matrícula de Honor");
		}
		else if (calificacion >= 8.5)
		{
			System.out.print("Sobresaliente");
		}
		else if (calificacion >= 6.5)
		{
			System.out.print("Notable");
		}
		else if (calificacion >= 5)
		{
			System.out.print("Aprobado");
		}
		else if (calificacion < 5)
		{
			System.out.print("Suspenso");
		}
		else
		{
			System.out.print("ERROR. Prueba de nuevo");
		}
	}
}