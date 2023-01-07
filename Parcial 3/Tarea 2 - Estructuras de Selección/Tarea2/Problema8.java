package Tarea2;
import java.util.Scanner;

public class Problema8 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("***************");
		System.out.println("+ Suma");
		System.out.println("- Resta");
		System.out.println("* Multiplicación");
		System.out.println("/ División");
		System.out.println("% Residuo de una División");
		System.out.println("***************");
		System.out.print("Elige una operación a realizar, ingresando su símbolo: ");
		char eleccion = entrada.next().charAt(0);
			switch(eleccion) {
			case '+': System.out.println("Suma");
				break;
			case '-': System.out.println("Resta");
				break;
			case '*': System.out.println("Multiplicación");
				break;
			case '/': System.out.println("División");
				break;	
			case '%': System.out.println("Residuo o módulo de la División");
			}
			if (eleccion == '+')
			{
				System.out.print("Escribe un número: ");
				double numero = entrada.nextDouble();
				System.out.print("Escribe otro número: ");
				double otro_numero = entrada.nextDouble();
				double resultado_suma = numero + otro_numero;
				System.out.print("Resultado de la Suma: " + resultado_suma);
			}
			if (eleccion == '-')
			{
				System.out.print("Escribe un número: ");
				double numero = entrada.nextDouble();
				System.out.print("Escribe otro número: ");
				double otro_numero = entrada.nextDouble();
				double resultado_resta = numero - otro_numero;
				System.out.print("Resultado de la Resta: " + resultado_resta);
			}
			if (eleccion == '*')
			{
				System.out.print("Escribe un número: ");
				double numero = entrada.nextDouble();
				System.out.print("Escribe otro número: ");
				double otro_numero = entrada.nextDouble();
				double resultado_multiplicacion = numero * otro_numero;
				System.out.print("Resultado de la Multiplicación: " + resultado_multiplicacion);
			}
			if (eleccion == '/')
			{
				System.out.print("Escribe un número: ");
				double numero = entrada.nextDouble();
				System.out.print("Escribe otro número: ");
				double otro_numero = entrada.nextDouble();
				double resultado_division = numero / otro_numero;
				System.out.print("Resultado de la División: " + resultado_division);
			}
			if (eleccion == '%')
			{
				System.out.print("Escribe un número: ");
				double numero = entrada.nextDouble();
				System.out.print("Escribe otro número: ");
				double otro_numero = entrada.nextDouble();
				double residuo_de_la_division = numero % otro_numero;
				System.out.print("Residuo de la División: " + residuo_de_la_division);
			}
			else
			{
				System.out.println("ERROR. Ese símbolo no está en el menú");
			}
}
}