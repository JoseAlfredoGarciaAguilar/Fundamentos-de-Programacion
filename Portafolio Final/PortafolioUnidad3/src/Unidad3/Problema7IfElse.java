package Unidad3;
import java.util.Scanner;

public class Problema7IfElse {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un valor: ");
		double x= entrada.nextDouble();

		if (x==0)
		System.out.println(x+ "=0");

		else
		System.out.println(x+"!=0");
	}
}