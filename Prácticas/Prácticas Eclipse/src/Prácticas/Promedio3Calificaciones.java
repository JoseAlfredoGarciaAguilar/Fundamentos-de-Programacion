package Prácticas;
import java.util.Scanner;
//PROGRAMA QUE CALCULA EL PROMEDIO DE 3 CALIFICACIONES PARCIALES
public class Promedio3Calificaciones {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe la Calificación del Parcial 1: ");
		double calificacion1 = entrada.nextDouble();
		System.out.print("Escribe la Calificación del Parcial 2: ");
		double calificacion2 = entrada.nextDouble();
		System.out.print("Escribe la Calificación del Parcial 3: ");
		double calificacion3 = entrada.nextDouble();
		
		double promedio = (calificacion1 + calificacion2 + calificacion3)/3;
		System.out.print("El promedio de los Parciales es: " + promedio);
	}
}