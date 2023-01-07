package EstructuraSeleccion;
import java.util.Scanner;

//PROGRAMA QUE IMPRIME CUÁL DE 3 NÚMEROS ES EL MAYOR, AL INGRESAR 3 NÚMEROS

public class CualEsElNumeroMayor {

	public static void main(String[] args) {
		Scanner objeto = new Scanner(System.in);
		System.out.print("Ingresa un número: ");
		double a = objeto.nextDouble();
		System.out.print("Ingresa otro número: ");
		double b = objeto.nextDouble();
		System.out.print("Ingresa algún otro número: ");
		double c = objeto.nextDouble();
		double mayor;
		if (a > b)
			if (a > c)
				mayor = a;
			else
				mayor = c;
		else
			if (b > c)
				mayor = b;
			else
				mayor = c;
		System.out.print("El número mayor es: " + mayor);
	}
}