package Portafolio;
import java.util.Scanner;

public class ÁreaTriángulo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Proporciona Medida del Lado A");
		double a = entrada.nextDouble();
		System.out.println("Proporciona Medida del Lado B");
		double b = entrada.nextDouble();
		System.out.println("Proporciona Medida del Lado C");
		double c = entrada.nextDouble();
		double s = (a+b+c)/2;
		double at = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Área Triángulo = " + at);
	}
}