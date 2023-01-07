package Tarea2;

public class Problema4 {

	public static void main(String[] args) {
		int a = 10,b=20,c;
		System.out.println("Valor de a = "+a);
		System.out.println("Valor de b = "+b);
		
		c = a;
		b = c;
		b = a;
		
		System.out.println("Valor de a = "+a);
		System.out.println("Valor de b = "+b);
	}
}