package Unidad3;
import java.util.Scanner;

public class Problema54Escalera2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("?Hasta qu? n?mero quieres la sucesi?n?: ");
		double sucesion = entrada.nextDouble();
		for(int i=0;i<=sucesion;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println(" ");
	}
		for(int i=(int)sucesion;i>=1;i--){
			for(int j=1;j<i;j++){
				System.out.print(j);
			}
			System.out.println(" ");
	}
	}
}