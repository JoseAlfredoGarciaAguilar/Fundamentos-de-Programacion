package Tarea1;
import java.util.Scanner;

public class Problema16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el n�mero de d�a: ");
		int numero_de_dia = entrada.nextInt();
		System.out.print("Escribe el n�mero de mes: ");
		int numero_de_mes = entrada.nextInt();
		System.out.print("Escribe el a�o: ");
		int a�o = entrada.nextInt();
		
		switch(numero_de_mes) {
		case 1: System.out.println(numero_de_dia + " de Enero de " + a�o);
			break;
		case 2: System.out.println(numero_de_dia + " de Febrero de " + a�o);
			break;
		case 3: System.out.println(numero_de_dia + " de Marzo de " + a�o);
			break;
		case 4: System.out.println(numero_de_dia + " de Abril de " + a�o);
			break;
		case 5: System.out.println(numero_de_dia + " de Mayo de " + a�o);
			break;
		case 6: System.out.println(numero_de_dia + " de Junio de " + a�o);
			break;
		case 7: System.out.println(numero_de_dia + " de Julio de " + a�o);
			break;
		case 8: System.out.println(numero_de_dia + " de Agosto de " + a�o);
			break;
		case 9: System.out.println(numero_de_dia + " de Septiembre de " + a�o);
			break;
		case 10: System.out.println(numero_de_dia + " de Octubre de " + a�o);
			break;
		case 11: System.out.println(numero_de_dia + " de Noviembre de " + a�o);
			break;
		case 12: System.out.println(numero_de_dia + " de Diciembre de " + a�o);
			break;
		default:
				System.out.println("ERROR. No existe un mes con ese n�mero");
		}
		}
}