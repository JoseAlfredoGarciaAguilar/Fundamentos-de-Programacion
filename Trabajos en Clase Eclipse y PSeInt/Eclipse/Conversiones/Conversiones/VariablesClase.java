package Conversiones;

public class VariablesClase {
	static int a, b, c; //declaracion de variables miembros de la clase

	public static void main(String[] args) {
		a = 5;
		System.out.println("Valor de a = "+a);
		betas();
		System.out.println("Valor de a = "+a);

	}
	public static double betas(){
		double x = 0; //Declaracion local
		a = 21;
		return x;
	}
	static int valor; //Variable de clase
	public static double alfa(){
		float x; //Declaracion local
		b = 19; //Esta bariable es visible por ser de clase
		valor = 0;
		valor = valor +a+b;
		return (float)(valor);
	}
}