package Unidad1;
import java.util.Scanner;

public class Problema10BilletesYMonedas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe la cantidad en pesos: ");
		double cant_pesos = entrada.nextDouble();
		int b1000 = (int)(cant_pesos/1000);
		cant_pesos = cant_pesos - b1000 * 1000;
		int b500 = (int)(cant_pesos/500);
		cant_pesos = cant_pesos - b500 * 500;
		int b200 = (int)(cant_pesos/200);
		cant_pesos = cant_pesos - b200 * 200;
		int b100 = (int)(cant_pesos/100);
		cant_pesos = cant_pesos - b100 * 100;
		int b50 = (int)(cant_pesos/50);
		cant_pesos = cant_pesos - b50 * 50;
		int b20 = (int)(cant_pesos/20);
		cant_pesos = cant_pesos - b20 * 20;
		int m10 = (int)(cant_pesos/10);
		cant_pesos = cant_pesos - m10 * 10;
		int m5 = (int)(cant_pesos/5);
		cant_pesos = cant_pesos - m5 * 5;
		int m2 = (int)(cant_pesos/2);
		cant_pesos = cant_pesos - m2 * 2;
		int m1 = (int)(cant_pesos/1);
		cant_pesos = cant_pesos - m1 * 1;
		int m05 = (int)(cant_pesos/0.5);
		cant_pesos = cant_pesos - m05 * 0.5;
		
		System.out.println("Billetes de $1000 necesarios = " + b1000);
		System.out.println("Billetes de $500 necesarios = " + b500);
		System.out.println("Billetes de $200 necesarios = " + b200);
		System.out.println("Billetes de $100 necesarios = " + b100);
		System.out.println("Billetes de $50 necesarios = " + b50);
		System.out.println("Billetes de $20 necesarios = " + b20);
		System.out.println("Monedas de $10 necesarias = " + m10);
		System.out.println("Monedas de $5 necesarias = " + m5);
		System.out.println("Monedas de $2 necesarias = " + m2);
		System.out.println("Monedas de $1 necesarias = " + m1);
		System.out.println("Monedas de 50 centavos necesarias = " + m05);
	}
}