package Unidad1;
import java.util.Scanner;

public class Problema1NumeroDeMillasRecorridas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el número de millas recorridas por el mar: ");
		double millas = entrada.nextDouble();
		
		double metros = millas * 1852;
		System.out.print("Número de metros recorridos = " + metros);
	}
}