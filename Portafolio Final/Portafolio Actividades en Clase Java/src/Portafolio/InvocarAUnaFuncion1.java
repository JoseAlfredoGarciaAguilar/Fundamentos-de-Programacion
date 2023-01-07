package Portafolio;
import java.util.Scanner;

public class InvocarAUnaFuncion1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame valor de A= ");
		double a = entrada.nextDouble();
		Hola(a);
		
	}
	static void Hola(double a){
		System.out.println("Hola Mundo, ya llegué");
	}
}
