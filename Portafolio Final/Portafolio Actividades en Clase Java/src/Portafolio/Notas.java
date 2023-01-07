package Portafolio;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la Calificación: ");
		double calif = entrada.nextDouble();
		if(calif >= 70)
			System.out.println("Aprobado");
		else
			System.out.println("Reprobado");
	}
}