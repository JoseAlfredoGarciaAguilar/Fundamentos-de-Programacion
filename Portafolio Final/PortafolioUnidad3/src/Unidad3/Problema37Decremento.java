package Unidad3;
import java.util.Scanner;

public class Problema37Decremento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i;
		System.out.print("Escribe un número: ");
		double n = entrada.nextInt();

		for (i=0; i<n;++i){
			--n;
		}
		System.out.println(i);
	}
}