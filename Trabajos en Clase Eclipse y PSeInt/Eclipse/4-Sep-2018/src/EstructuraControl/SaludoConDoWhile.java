package EstructuraControl;
import java.util.Scanner;

public class SaludoConDoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char opcion;
		do
		{
			System.out.println("Hola");
			System.out.println("¿Desea otro tipo de Saludo?");
			System.out.println("Pulse s para Sí, y n para no");
			opcion = entrada.next().charAt(0); //charAt, en este caso, toma la primera letra de la palabra
		}while(opcion == 's' || opcion == 'S');
		//fin del bucle
		System.out.println("ADIÓS");
	}
}