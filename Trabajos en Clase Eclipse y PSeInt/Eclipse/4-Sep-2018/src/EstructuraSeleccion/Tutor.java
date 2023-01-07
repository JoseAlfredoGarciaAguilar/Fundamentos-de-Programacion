package EstructuraSeleccion;
import java.util.Scanner;

public class Tutor {

	public static void main(String[] args) {
		//variables de entrada
		String nombre;
		short edad;
		String tutor1;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el Nombre: ");
		nombre = entrada.nextLine();
		System.out.print("Escribe la Edad: ");
		edad = entrada.nextShort();
		entrada.nextLine();
		if(edad < 18)
		{
			System.out.print("Escribe el Nombre del Tutor: ");
			tutor1 = entrada.nextLine();
		}
		System.out.println("Programa finalizado");
	}
}