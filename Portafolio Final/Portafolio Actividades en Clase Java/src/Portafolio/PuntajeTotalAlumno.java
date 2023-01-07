package Portafolio;
import java.util.Scanner;

public class PuntajeTotalAlumno {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Proporciona Número de Respuestas Correctas: ");
		int ReC = entrada.nextInt();
		System.out.println("Proporciona Número de Respuestas Incorrectas: ");
		int ReI = entrada.nextInt();
		System.out.println("Proporciona Número de Respuestas en Blanco: ");
		int ReB = entrada.nextInt();
		int pt = ReC*4 - ReI*1 + ReB*0;
		System.out.println("Puntaje Total = " + pt);
	}
}
