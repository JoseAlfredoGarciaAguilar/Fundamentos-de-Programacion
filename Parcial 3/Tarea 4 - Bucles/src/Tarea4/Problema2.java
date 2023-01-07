package Tarea4;
import java.util.Scanner;
//PROGRAMA QUE IMPRIME EN ESCALERA LOS NÚMEROS DE UNA DETERMINADA CANTIDAD, Y EN VICEVERSA
public class Problema2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿Hasta qué número quieres la sucesión?: ");
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