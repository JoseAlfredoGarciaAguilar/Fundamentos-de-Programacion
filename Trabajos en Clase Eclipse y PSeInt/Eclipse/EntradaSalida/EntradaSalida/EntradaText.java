package EntradaSalida;
import java.util.Scanner;

public class EntradaText {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre;
		System.out.print("�Cu�l es tu nombre? ");
		nombre = entrada.nextLine();
		int edad;
		System.out.print("�Cu�l es tu edad? ");
		edad = entrada.nextInt();
		//Visualizar la salida
		System.out.println("Buenas tardes " + nombre + ", usted dijo que ten�a " + edad + " a�os ");
	}
}