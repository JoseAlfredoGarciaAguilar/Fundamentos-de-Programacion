package EstructuraSeleccion;
import java.util.Scanner;

public class CualEsElNumeroMayor3 {

	public static void main(String[] args) {
		Scanner objeto = new Scanner(System.in);
		System.out.print("Ingresa un n�mero: ");
		double a = objeto.nextDouble();
		System.out.print("Ingresa otro n�mero: ");
		double b = objeto.nextDouble();
		System.out.print("Ingresa alg�n otro n�mero: ");
		double c = objeto.nextDouble();
		double mayor = 0;
		if (a>b && a>c)
			mayor = a;
		else
			if (b>a && b>c)
				mayor = b;
			else
				mayor = c;
		System.out.print("El n�mero mayor es: " + mayor);
	}
}