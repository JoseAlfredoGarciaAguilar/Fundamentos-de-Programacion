package EstructuraSeleccion;
import java.util.Scanner;

//PROGRAMA QUE IMPRIME CU�L DE 3 N�MEROS ES EL MAYOR, AL INGRESAR 3 N�MEROS

public class CualEsElNumeroMayor {

	public static void main(String[] args) {
		Scanner objeto = new Scanner(System.in);
		System.out.print("Ingresa un n�mero: ");
		double a = objeto.nextDouble();
		System.out.print("Ingresa otro n�mero: ");
		double b = objeto.nextDouble();
		System.out.print("Ingresa alg�n otro n�mero: ");
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
		System.out.print("El n�mero mayor es: " + mayor);
	}
}