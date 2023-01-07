// Programa que obtiene el valor de los catetos (b y c) de un triangulo rectangulo
// obetener el valor de la hipotenusa (a) por medio del teorema te pitadoras
//Autor: José Carlos Ochoa Taboada
//Fecha: 10/oct/2018
import java.util.Scanner;
public class Pitagoras
{
	static Scanner lectura = new Scanner(System.in);
	public static void main (String[]args)
	{
		double  a,b,c = 0;

		System.out.println("Escribe el valor del Cateto b");
		//b = Keyboard.readDouble();
		 b = lectura.nextDouble();
		System.out.println("Escribe el valor del Cateto c");
		//c = Keyboard.readDouble();
		 c = lectura.nextDouble();

	  	a = Math.sqrt((b * b) + (c * c ));
		System.out.printf("El valor de la Hipotenusa es de %.3f%n", a);
	}
}
