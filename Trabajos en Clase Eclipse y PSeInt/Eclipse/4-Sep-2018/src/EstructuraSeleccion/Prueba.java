package EstructuraSeleccion;
import java.util.Scanner;

//PROGRAMA QUE AL INSERTAR UNA CALIFICACIÓN DEL 0 AL 10, ME DIGA EXCELENTE, APROBADO, REPROBADO, O SUSPENDIDO

public class Prueba {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe la calificación del 1 a 10: ");
		int nota = entrada.nextInt();
		if (nota < 0 || nota > 10)
		{
			System.out.print("Valor inválido. Prueba de nuevo");
			System.exit(0);
		}
		switch(nota)
		{
		case 10:
		case 9: System.out.print("Excelente");
			break;
		case 8:
		case 7: System.out.print("Aprobado");
			break;
		case 6: System.out.print("Reprobado");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: System.out.print("Suspendido");
		}
	}
}