package Unidad2;
import java.util.Scanner;

public class Problema13�reaDeLaHabitaci�n {

	public static void main(String[] args) {
		float longitud;
		float anchura;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la longitud de la habitaci�n: ");
		longitud = entrada.nextFloat();
		System.out.println("Escribe la anchura de la habitaci�n: ");
		anchura = entrada.nextFloat();
		double area = longitud * anchura;
		System.out.println("Superficie o �rea de la habitaci�n: " + area);
	}
}