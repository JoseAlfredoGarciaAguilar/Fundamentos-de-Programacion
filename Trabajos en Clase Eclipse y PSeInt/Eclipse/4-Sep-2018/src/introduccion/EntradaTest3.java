package introduccion;

import java.util.Scanner;
	
public class EntradaTest3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un texto: ");
		String texto = teclado.nextLine();
		System.out.print("Introduce un entero corto: ");
		short enteroCorto = teclado.nextShort();
		System.out.print("Introduce un byte: ");
		byte bite = teclado.nextByte();
		System.out.print("Introduce un entero: ");
		int entero = teclado.nextInt();
		System.out.print("Introduce un Real tipo Float: ");
		float flotante = teclado.nextFloat();
		System.out.print("Introduce un Real tipo double: ");
		double doble = teclado.nextDouble();
		System.out.print("Introduce un entero largo: ");
		long largo = teclado.nextLong();
		System.out.print("Introduce un boleano: ");
		boolean lógico = teclado.nextBoolean();
		
		//Tipo de dato envoltorio
		System.out.print("Introduce un número doble: ");
		String numero = teclado.nextLine();
		double numero2 = Double.parseDouble(numero);
		System.out.println(numero2 * 1.15);
		int numero3 = Integer.parseInt(numero);
		System.out.println(numero3 * 2);
		float numero4 = Float.parseFloat(numero);
	}
}