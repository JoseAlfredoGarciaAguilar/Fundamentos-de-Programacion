package EstructuraSeleccion;
import java.util.Scanner;

public class CualEsElNumeroMayor2 {

	public static void main(String[] args) {
		Scanner objeto = new Scanner(System.in);
		System.out.print("Ingresa un n�mero: ");
		double a = objeto.nextDouble();
		System.out.print("Ingresa otro n�mero: ");
		double b = objeto.nextDouble();
		System.out.print("Ingresa alg�n otro n�mero: ");
		double c = objeto.nextDouble();
		double mayor = 0;
		if (a > b && a > c)
			mayor = a;
		if (b > a && b > c)
			mayor = b;
		if (c > a && c > b)
			mayor = c;
		System.out.print("El n�mero mayor es: " + mayor);
	}
}