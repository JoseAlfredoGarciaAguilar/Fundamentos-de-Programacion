package Unidad3;
import java.util.Scanner;

public class Problema59Potencia {
	
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿A qué potencia quieres elevar los 100 números?: ");
		int potencia = entrada.nextInt();
		
		for(int base=1;base<=100;base++)
		{
			int resultado = (int)Math.pow(base, potencia);
			System.out.println(base + " elevado a " + potencia + " = " + resultado);
		}	
	}
}