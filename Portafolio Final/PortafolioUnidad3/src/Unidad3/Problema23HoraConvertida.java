package Unidad3;
import java.util.Scanner;

public class Problema23HoraConvertida {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe las Horas: ");
		int horas = entrada.nextInt();
		System.out.print("Escribe los Minutos: ");
		int minutos = entrada.nextInt();
		int horafinal;
		
		horafinal = horas - 12;
		System.out.print("La hora en Formato de 12 Horas es: " + horafinal + ":" + minutos);
	}
}