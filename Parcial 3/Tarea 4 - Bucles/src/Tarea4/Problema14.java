package Tarea4;
import java.util.Scanner;

public class Problema14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa el primer valor: ");
		double primer_valor = entrada.nextDouble();
		System.out.print("Ingresa el segundo valor: ");
		double segundo_valor = entrada.nextDouble();
		
		double primer_valor_al_cubo = Math.pow(primer_valor, 3);
		double segundo_valor_al_cubo = Math.pow(segundo_valor, 3);
;		double suma_de_los_cubos = primer_valor_al_cubo + segundo_valor_al_cubo;

		double resultado = (int)(suma_de_los_cubos*999)/1000;
		System.out.print(resultado);
	}
}