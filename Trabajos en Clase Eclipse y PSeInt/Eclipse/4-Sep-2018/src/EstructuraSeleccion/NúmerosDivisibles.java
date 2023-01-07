package EstructuraSeleccion;
import java.util.Scanner;

public class NúmerosDivisibles {

	public static void main(String[] args) {
		//Variables de entrada
		short a, b;
		//Variables de salida
		String mensaje="";
		//Variable intermedia
		short residuo;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un número entero: ");
		a = teclado.nextShort();
		System.out.print("Escribe otro número entero: ");
		b = teclado.nextShort();
		residuo = (short)(a % b);
		if (residuo ==0)
		{
			mensaje = a + " es divisible entre " + b;
		}
		else
		{
			mensaje = a + " no es divisible entre " + b;
		}
		System.out.println(mensaje);
	}

}
