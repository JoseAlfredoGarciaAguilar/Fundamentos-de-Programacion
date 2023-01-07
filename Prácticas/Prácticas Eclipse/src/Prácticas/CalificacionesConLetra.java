//JOSÉ ALFREDO GARCÍA AGUILAR
package Prácticas;
import java.util.Scanner;
//PROGRAMA QUE PIDE 5 CALIFICACIONES CON NÚMERO, E IMPRIME TODAS EN LETRAS Y EN FORMA DE TABLA
//ADEMÁS, LE DA UNA LETRA AL PROMEDIO DE LAS 5
public class CalificacionesConLetra {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Calificaciones de 5 Alumnos");
		System.out.print("¿Cuál es la Calificación del Alumno 1?: ");
		double calificacion1 = entrada.nextDouble();
		System.out.print("¿Cuál es la Calificación del Alumno 2?: ");
		double calificacion2 = entrada.nextDouble();
		System.out.print("¿Cuál es la Calificación del Alumno 3?: ");
		double calificacion3 = entrada.nextDouble();
		System.out.print("¿Cuál es la Calificación del Alumno 4?: ");
		double calificacion4 = entrada.nextDouble();
		System.out.print("¿Cuál es la Calificación del Alumno 5?: ");
		double calificacion5 = entrada.nextDouble();
		
		System.out.println();
		System.out.println("*TABLA DE CALIFICACIONES*");
		if((calificacion1 >= 90) && (calificacion1 <= 100))
			System.out.println("Nota Alumno 1: A");
		if((calificacion1 >= 80) && (calificacion1 <= 89.999))
			System.out.println("Nota Alumno 1: B");
		if((calificacion1 >= 70) && (calificacion1 <= 79.999))
			System.out.println("Nota Alumno 1: C");
		if((calificacion1 >= 60) && (calificacion1 <= 69.999))
			System.out.println("Nota Alumno 1: D");
		if((calificacion1 >= 0) && (calificacion1 <= 59.999))
			System.out.println("Nota Alumno 1: E");
		
		if((calificacion2 >= 90) && (calificacion2 <= 100))
			System.out.println("Nota Alumno 2: A");
		if((calificacion2 >= 80) && (calificacion2 <= 89.999))
			System.out.println("Nota Alumno 2: B");
		if((calificacion2 >= 70) && (calificacion2 <= 79.999))
			System.out.println("Nota Alumno 2: C");
		if((calificacion2 >= 60) && (calificacion2 <= 69.999))
			System.out.println("Nota Alumno 2: D");
		if((calificacion2 >= 0) && (calificacion2 <= 59.999))
			System.out.println("Nota Alumno 2: E");
		
		if((calificacion3 >= 90) && (calificacion3 <= 100))
			System.out.println("Nota Alumno 3: A");
		if((calificacion3 >= 80) && (calificacion3 <= 89.999))
			System.out.println("Nota Alumno 3: B");
		if((calificacion3 >= 70) && (calificacion3 <= 79.999))
			System.out.println("Nota Alumno 3: C");
		if((calificacion3 >= 60) && (calificacion3 <= 69.999))
			System.out.println("Nota Alumno 3: D");
		if((calificacion3 >= 0) && (calificacion3 <= 59.999))
			System.out.println("Nota Alumno 3: E");
		
		if((calificacion4 >= 90) && (calificacion4 <= 100))
			System.out.println("Nota Alumno 4: A");
		if((calificacion4 >= 80) && (calificacion4 <= 89.999))
			System.out.println("Nota Alumno 4: B");
		if((calificacion4 >= 70) && (calificacion4 <= 79.999))
			System.out.println("Nota Alumno 4: C");
		if((calificacion4 >= 60) && (calificacion4 <= 69.999))
			System.out.println("Nota Alumno 4: D");
		if((calificacion4 >= 0) && (calificacion4 <= 59.999))
			System.out.println("Nota Alumno 4: E");
		
		if((calificacion5 >= 90) && (calificacion5 <= 100))
			System.out.println("Nota Alumno 5: A");
		if((calificacion5 >= 80) && (calificacion5 <= 89.999))
			System.out.println("Nota Alumno 5: B");
		if((calificacion5 >= 70) && (calificacion5 <= 79.999))
			System.out.println("Nota Alumno 5: C");
		if((calificacion5 >= 60) && (calificacion5 <= 69.999))
			System.out.println("Nota Alumno 5: D");
		if((calificacion5 >= 0) && (calificacion5 <= 59.999))
			System.out.println("Nota Alumno 5: E");
		
		double promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5) / 5;
		System.out.println("Promedio Final = " + promedio);
		if((promedio >= 90) && (promedio <= 100))
			System.out.println("Nota del Promedio Final: A");
		if((promedio >= 80) && (promedio <= 89.999))
			System.out.println("Nota del Promedio9 Final: B");
		if((promedio >= 70) && (promedio <= 79.99))
			System.out.println("Nota del Promedio Final: C");
		if((promedio >= 60) && (promedio <= 69.999))
			System.out.println("Nota del Promedio Final: D");
		if((promedio >= 0) && (promedio <= 59.999))
			System.out.println("Nota del Promedio Final: E");
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR