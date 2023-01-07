package Portafolio;
import java.util.Scanner;

public class ProblemaDelTutor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el nombre: ");
		String nombre = entrada.nextLine();
		System.out.println("Escribe la edad: ");
		int edad = entrada.nextInt();
		
		if(edad<18) {
			System.out.println("Nombre del Tutor: ");
			String tutor = entrada.nextLine();
		}
	}
}