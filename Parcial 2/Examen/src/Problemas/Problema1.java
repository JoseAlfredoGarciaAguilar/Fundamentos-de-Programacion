package Problemas;
import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el a�o: ");
		int a�o = entrada.nextInt();
		double a = a�o % 19;
		double b = a�o % 4;
		double c = a�o % 7;
		double d = (19 * a + 24) % 30;
		double e = (2 * b + 4 * c + 6 * d + 5) % 7;
		double n = 22 + d + e;
		int fecha_domingo = (int) (n / 7);
		
		if(n <= 30)
		{
		System.out.println(fecha_domingo + " de marzo de " + a�o);
		System.out.println(fecha_domingo + 7 + " de marzo de " + a�o);
		System.out.println(fecha_domingo + 14 + " de marzo de " + a�o);
		System.out.println(fecha_domingo + 21 + " de marzo de " + a�o);
		}
		{
		if(n > 31)
		{
		System.out.println(fecha_domingo + " de abril de " + a�o);
		System.out.println(fecha_domingo + 7 + " de abril de " + a�o);
		System.out.println(fecha_domingo + 14 + " de abril de " + a�o);
		System.out.println(fecha_domingo + 21 + " de abril de " + a�o);			
		}
	}
}
}