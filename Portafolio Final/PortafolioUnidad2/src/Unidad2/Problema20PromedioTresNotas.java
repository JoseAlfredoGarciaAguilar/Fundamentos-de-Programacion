package Unidad2;
import java.util.Scanner;

public class Problema20PromedioTresNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float calif1, calif2, calif3, promedio;
		
		System.out.println("Escribe la Calificación de la primera unidad: ");
		calif1 = entrada.nextFloat();
		System.out.println("Escribe la Calificación de la segunda unidad: ");
		calif2 = entrada.nextFloat();
		System.out.println("Escribe la Calificación de la tercera unidad: ");
		calif3 = entrada.nextFloat();
		
		promedio = (calif1 + calif2 + calif3)/3;
		System.out.println("El promedio del alumno es: " +promedio);
	}
}