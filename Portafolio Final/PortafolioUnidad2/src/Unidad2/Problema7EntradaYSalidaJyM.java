package Unidad2;
import java.util.Scanner;

public class Problema7EntradaYSalidaJyM {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca sus Iniciales: " );
		System.out.print("Primer Apellido: ");
		String primero = entrada.nextLine();
		System.out.print("Segundo Apellido: ");
		String ultimo = entrada.nextLine();
		System.out.println("Hola, "+primero+" "+ultimo+" !");
	}
}