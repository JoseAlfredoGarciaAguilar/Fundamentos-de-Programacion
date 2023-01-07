package Unidad2;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class Problema11IntercambioDeValores {

	public static void main(String[] args) {
		double c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el valor de a: ");
		double a = entrada.nextDouble();
		System.out.println("Escribe el valor de b:");
		double b = entrada.nextDouble();
		System.out.println("Valores ordenados");
		System.out.println("Valor de a = "+a);
		System.out.println("Valor de b = "+b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Valores intercambiados");
		System.out.println("Valor de a = "+a);
		System.out.println("Valor de b = "+b);
	}
}