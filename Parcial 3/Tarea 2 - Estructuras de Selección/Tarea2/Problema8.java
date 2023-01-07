package Tarea2;
import java.util.Scanner;

public class Problema8 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("***************");
		System.out.println("+ Suma");
		System.out.println("- Resta");
		System.out.println("* Multiplicaci�n");
		System.out.println("/ Divisi�n");
		System.out.println("% Residuo de una Divisi�n");
		System.out.println("***************");
		System.out.print("Elige una operaci�n a realizar, ingresando su s�mbolo: ");
		char eleccion = entrada.next().charAt(0);
			switch(eleccion) {
			case '+': System.out.println("Suma");
				break;
			case '-': System.out.println("Resta");
				break;
			case '*': System.out.println("Multiplicaci�n");
				break;
			case '/': System.out.println("Divisi�n");
				break;	
			case '%': System.out.println("Residuo o m�dulo de la Divisi�n");
			}
			if (eleccion == '+')
			{
				System.out.print("Escribe un n�mero: ");
				double numero = entrada.nextDouble();
				System.out.print("Escribe otro n�mero: ");
				double otro_numero = entrada.nextDouble();
				double resultado_suma = numero + otro_numero;
				System.out.print("Resultado de la Suma: " + resultado_suma);
			}
			if (eleccion == '-')
			{
				System.out.print("Escribe un n�mero: ");
				double numero = entrada.nextDouble();
				System.out.print("Escribe otro n�mero: ");
				double otro_numero = entrada.nextDouble();
				double resultado_resta = numero - otro_numero;
				System.out.print("Resultado de la Resta: " + resultado_resta);
			}
			if (eleccion == '*')
			{
				System.out.print("Escribe un n�mero: ");
				double numero = entrada.nextDouble();
				System.out.print("Escribe otro n�mero: ");
				double otro_numero = entrada.nextDouble();
				double resultado_multiplicacion = numero * otro_numero;
				System.out.print("Resultado de la Multiplicaci�n: " + resultado_multiplicacion);
			}
			if (eleccion == '/')
			{
				System.out.print("Escribe un n�mero: ");
				double numero = entrada.nextDouble();
				System.out.print("Escribe otro n�mero: ");
				double otro_numero = entrada.nextDouble();
				double resultado_division = numero / otro_numero;
				System.out.print("Resultado de la Divisi�n: " + resultado_division);
			}
			if (eleccion == '%')
			{
				System.out.print("Escribe un n�mero: ");
				double numero = entrada.nextDouble();
				System.out.print("Escribe otro n�mero: ");
				double otro_numero = entrada.nextDouble();
				double residuo_de_la_division = numero % otro_numero;
				System.out.print("Residuo de la Divisi�n: " + residuo_de_la_division);
			}
			else
			{
				System.out.println("ERROR. Ese s�mbolo no est� en el men�");
			}
}
}