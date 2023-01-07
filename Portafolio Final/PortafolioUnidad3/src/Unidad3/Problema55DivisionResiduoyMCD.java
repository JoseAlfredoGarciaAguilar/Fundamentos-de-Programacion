package Unidad3;
import java.util.Scanner;

public class Problema55DivisionResiduoyMCD {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el n�mero a dividir: ");
		int numero_a_dividir = entrada.nextInt();
		System.out.print("Escribe entre cu�nto lo quieres dividir: ");
		int divisor = entrada.nextInt();
		
		int resultado_division = numero_a_dividir / divisor;
		System.out.println("Resultado de la Divisi�n = " + resultado_division);
		
		int residuo_division = numero_a_dividir % divisor;
		System.out.println("Residuo o M�dulo de la Divisi�n = " + residuo_division);
		
		System.out.println("El M�ximo Com�n Divisor (MCD) es = " + obtener_mod(numero_a_dividir, divisor));
	
	}
	static int obtener_mod(int numero_a_dividir, int divisor){
		if (divisor == 0)
			return numero_a_dividir;
		else
			return obtener_mod(divisor, numero_a_dividir % divisor);
		}
	}