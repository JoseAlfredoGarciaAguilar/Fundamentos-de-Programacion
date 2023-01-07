package Portafolio;
import java.util.Scanner;

public class Arreglos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ventas[] = new int[10];
		int i=0;
		while (i<=10){
			i = i+1;
			System.out.println("Dame elemento " + i);
			ventas[i] = entrada.nextInt();
		}
		for(i=1; i<10; i++) {
			System.out.println(ventas[i]);
		}
	}
}