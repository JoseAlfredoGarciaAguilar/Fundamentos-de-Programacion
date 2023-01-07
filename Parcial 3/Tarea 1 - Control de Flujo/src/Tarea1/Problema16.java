package Tarea1;
import java.util.Scanner;

public class Problema16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el número de día: ");
		int numero_de_dia = entrada.nextInt();
		System.out.print("Escribe el número de mes: ");
		int numero_de_mes = entrada.nextInt();
		System.out.print("Escribe el año: ");
		int año = entrada.nextInt();
		
		switch(numero_de_mes) {
		case 1: System.out.println(numero_de_dia + " de Enero de " + año);
			break;
		case 2: System.out.println(numero_de_dia + " de Febrero de " + año);
			break;
		case 3: System.out.println(numero_de_dia + " de Marzo de " + año);
			break;
		case 4: System.out.println(numero_de_dia + " de Abril de " + año);
			break;
		case 5: System.out.println(numero_de_dia + " de Mayo de " + año);
			break;
		case 6: System.out.println(numero_de_dia + " de Junio de " + año);
			break;
		case 7: System.out.println(numero_de_dia + " de Julio de " + año);
			break;
		case 8: System.out.println(numero_de_dia + " de Agosto de " + año);
			break;
		case 9: System.out.println(numero_de_dia + " de Septiembre de " + año);
			break;
		case 10: System.out.println(numero_de_dia + " de Octubre de " + año);
			break;
		case 11: System.out.println(numero_de_dia + " de Noviembre de " + año);
			break;
		case 12: System.out.println(numero_de_dia + " de Diciembre de " + año);
			break;
		default:
				System.out.println("ERROR. No existe un mes con ese número");
		}
		}
}