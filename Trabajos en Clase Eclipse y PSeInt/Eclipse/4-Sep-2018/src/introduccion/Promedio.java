package introduccion;
import java.util.Scanner;

public class Promedio {

	public static void main(String[] args) {
		//Variable de salida
		float promedio;
		//Variable de salida
		float c1, c2, c3, c4, c5, c6, c7, c8, c9, c10;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Proporcione la Calificaci�n 1: ");
		c1 = entrada.nextFloat();
		System.out.print("Proporcione la Calificaci�n 2: ");
		c2 = entrada.nextFloat();
		System.out.print("Proporcione la Calificaci�n 3: ");
		c3 = entrada.nextFloat();
		System.out.print("Proporcione la Calificaci�n 4: ");
		c4 = entrada.nextFloat();
		System.out.print("Proporcione la Calificaci�n 5: ");
		c5 = entrada.nextFloat();
		System.out.print("Proporcione la Calificaci�n 6: ");
		c6 = entrada.nextFloat();
		System.out.print("Proporcione la Calificaci�n 7: ");
		c7 = entrada.nextFloat();
		System.out.print("Proporcione la Calificaci�n 8: ");
		c8 = entrada.nextFloat();
		System.out.print("Proporcione la Calificaci�n 9: ");
		c9 = entrada.nextFloat();
		System.out.print("Proporcione la Calificaci�n 10: ");
		c10 = entrada.nextFloat();
		promedio = (c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10)/10;
		System.out.println("El Promedio es: " + promedio);
	}
}