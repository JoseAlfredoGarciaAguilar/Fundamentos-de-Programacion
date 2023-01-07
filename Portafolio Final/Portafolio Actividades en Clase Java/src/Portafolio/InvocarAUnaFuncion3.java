package Portafolio;

import java.util.Scanner;

public class InvocarAUnaFuncion3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		for(int a=1; a<=2; a++) {
			System.out.println("Hola Mundo, ya llegué");
		}
		
		System.out.println("Escribe el valor de x: ");
		double x = entrada.nextDouble();
		double doble = x*2;
		System.out.println("Valor doble = " + doble);
		double triple = x*3;
		System.out.println("Valor triple = " + triple);
	}
}