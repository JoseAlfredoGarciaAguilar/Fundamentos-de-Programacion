package Arreglos;
import java.util.Scanner;

public class Asteriscos {

	public static void main(String []args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuántas columnas quieres?: ");
		int columnas = entrada.nextInt();
		System.out.println("¿Cuántas filas quieres?: ");
		int filas = entrada.nextInt();
		for(int i=0; i<columnas; i++){
			for(int j=0; j<filas; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
