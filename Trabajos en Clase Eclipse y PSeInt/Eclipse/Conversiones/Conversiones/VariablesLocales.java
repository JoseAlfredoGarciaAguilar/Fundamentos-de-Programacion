package Conversiones;

public class VariablesLocales {

	public static void main(String[] args) {
		int a = 1;
		float b;
		sumar();
		System.out.println(a);

	}

	public static void metodo2() {
		int a = 0;
		float b;
	}
	public static void sumar() {
		int a, b, c;
		int numero;
		a = (int)(Math.random()*999);
		b = (int)(Math.random()*999);
		c = (int)(Math.random()*999);
		numero = a+b+c;
		System.out.println("N�mero 1 = "+a);
		System.out.println("N�mero 2 = "+b);
		System.out.println("N�mero 3 = "+c);
		System.out.println("suma = "+numero);
	}
}