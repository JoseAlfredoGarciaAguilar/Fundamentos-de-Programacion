package Unidad2;
import java.util.Scanner;

public class Problema13ÁreaDeLaHabitación {

	public static void main(String[] args) {
		float longitud;
		float anchura;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la longitud de la habitación: ");
		longitud = entrada.nextFloat();
		System.out.println("Escribe la anchura de la habitación: ");
		anchura = entrada.nextFloat();
		double area = longitud * anchura;
		System.out.println("Superficie o área de la habitación: " + area);
	}
}