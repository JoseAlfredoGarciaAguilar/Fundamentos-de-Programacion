package Tarea3;
import java.util.Scanner;
//PROGRAMA QUE PIDE LAS CALIFICACIONES DE 10 ALUMNOS, Y AL FINAL LAS IMPRIME TODAS JUNTAS EN UNA TABLA
public class Problema3Bucle2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Calificaciones del Examen de Historia");
		System.out.print("Escribe la calificación del Alumno 1: ");
		double calificacion_alumno_1 = entrada.nextDouble();
		System.out.print("Escribe la calificación del Alumno 2: ");
		double calificacion_alumno_2 = entrada.nextDouble();
		System.out.print("Escribe la calificación del Alumno 3: ");
		double calificacion_alumno_3 = entrada.nextDouble();
		System.out.print("Escribe la calificación del Alumno 4: ");
		double calificacion_alumno_4 = entrada.nextDouble();
		System.out.print("Escribe la calificación del Alumno 5: ");
		double calificacion_alumno_5 = entrada.nextDouble();
		System.out.print("Escribe la calificación del Alumno 6: ");
		double calificacion_alumno_6 = entrada.nextDouble();
		System.out.print("Escribe la calificación del Alumno 7: ");
		double calificacion_alumno_7 = entrada.nextDouble();
		System.out.print("Escribe la calificación del Alumno 8: ");
		double calificacion_alumno_8 = entrada.nextDouble();
		System.out.print("Escribe la calificación del Alumno 9: ");
		double calificacion_alumno_9 = entrada.nextDouble();
		System.out.print("Escribe la calificación del Alumno 10: ");
		double calificacion_alumno_10 = entrada.nextDouble();
		System.out.println();
		
		System.out.println("*Tabla de Calificaciones*");
		System.out.println("Alumno 1, obtuvo: " + calificacion_alumno_1);
		System.out.println("Alumno 2, obtuvo: " + calificacion_alumno_2);
		System.out.println("Alumno 3, obtuvo: " + calificacion_alumno_3);
		System.out.println("Alumno 4, obtuvo: " + calificacion_alumno_4);
		System.out.println("Alumno 5, obtuvo: " + calificacion_alumno_5);
		System.out.println("Alumno 6, obtuvo: " + calificacion_alumno_6);
		System.out.println("Alumno 7, obtuvo: " + calificacion_alumno_7);
		System.out.println("Alumno 8, obtuvo: " + calificacion_alumno_8);
		System.out.println("Alumno 9, obtuvo: " + calificacion_alumno_9);
		System.out.println("Alumno 10, obtuvo: " + calificacion_alumno_10);
	}
}