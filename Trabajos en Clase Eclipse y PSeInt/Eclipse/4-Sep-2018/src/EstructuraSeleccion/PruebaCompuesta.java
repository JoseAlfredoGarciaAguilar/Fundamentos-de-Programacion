package EstructuraSeleccion;
import java.util.Scanner;

public class PruebaCompuesta {

	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca un n�mero entero: ");
		numero = entrada.nextInt();
		//Comparar n�mero a cero
		if (numero > 0)
		{
			System.out.println(numero + " es mayor que 0");
			System.out.println("Pruebe de nuevo, introduciendo negativo");
		}
		else if (numero < 0)
		{
			System.out.println(numero + " es menor que 0");
			System.out.println("Pruebe de nuevo, introduciento positivo");
		}
		else
		{
			System.out.println(numero + " es igual que 0");
			System.out.println("�Por qu� no introduce un n�mero negativo?");
		}
	}
}