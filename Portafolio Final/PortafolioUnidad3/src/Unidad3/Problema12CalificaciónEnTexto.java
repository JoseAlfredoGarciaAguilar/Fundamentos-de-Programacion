package Unidad3;
import java.util.Scanner;

public class Problema12Calificaci�nEnTexto {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe la calificaci�n del Alumno: ");
		double calificacion = entrada.nextDouble();
		if (calificacion == 10)
		{
			System.out.print("Matr�cula de Honor");
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