package Tarea4;
import java.util.Scanner;
//PROGRAMA QUE AL INGRESAR UN NÚMERO, IMPRIME SU DESCOMPOSICIÓN FACTORIAL
public class Programa5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el número a factorizar: ");
		int numero_a_descomponer = entrada.nextInt();
		System.out.print("Descomposición factorial de " + numero_a_descomponer + ": 1 ");
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