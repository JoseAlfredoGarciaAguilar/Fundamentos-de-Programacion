package EstructuraSeleccion;
import java.util.Scanner;

public class CualEsElNumeroMayor3 {

	public static void main(String[] args) {
		Scanner objeto = new Scanner(System.in);
		System.out.print("Ingresa un número: ");
		double a = objeto.nextDouble();
		System.out.print("Ingresa otro número: ");
		double b = objeto.nextDouble();
		System.out.print("Ingresa algún otro número: ");
		double c = objeto.nextDouble();
		double mayor = 0;
		if (a>b && a>c)
			mayor = a;
		else
			if (b>a && b>c)
				mayor = b;
			else
				mayor = c;
		System.out.print("El número mayor es: " + mayor);
	}
}