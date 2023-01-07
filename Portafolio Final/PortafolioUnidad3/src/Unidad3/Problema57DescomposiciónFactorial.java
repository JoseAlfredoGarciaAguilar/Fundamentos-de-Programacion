package Unidad3;
import java.util.Scanner;

public class Problema57Descomposici�nFactorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el n�mero a factorizar: ");
		int numero_a_descomponer = entrada.nextInt();
		System.out.print("Descomposici�n factorial de " + numero_a_descomponer + ": 1 ");
	factor(numero_a_descomponer);
	}
	public static void factor(int k){
		int num = 2;
		while(k != 1){
			if(k % num == 0){
				k = k / num;
				System.out.print(num + " ");
			}
			else
				num++;
		}
	}
}