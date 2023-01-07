package Conversiones;

public class Conversiones {

	public static void main(String[]arg) {
		//Tipo de dato enumerado
		/*
		 * COSTANTES
		 * 1-LITERALES
		 * 2-DECLARADAS
		 * ejemplo de constantes literales
		 * Nombres deben ir mayusculas
		 * float PI = 3.1416f;
		 */
		float PI = 3.1416f;
		int MESES = 12;
		double a3 = 82.34e5; //NOTACION CIENTIFICA
		System.out.println("Notación científica = "+a3);
		//Infinito
		System.out.println("Log(0) = "+ Math.log(0.0));
		//Aritmetica con caracteres Java
		char c1;
		c1 = 'A'+5;
		System.out.println(c1);
		//Constantes cadena
		String cadena1 = "Esta es una cadena";
		System.out.println(cadena1);
		String cadena2 = "\tEl dia de la independencia es:\n\t16 de septiembre";
		System.out.println(cadena2);
		//Constantes declaradas
		final int Numero_Meses = 12;
		final char Caracter = '@';
		final int Octal = 0233;
		final String Cadena3="Curso de Java";
		//Variables locales:
		//Son aquellas definidas en el interior de un método visibles solo en el método específico y las reglas son:
		//1-En el interior de un método, no se pueden modificar por ninguna sentencia externa a él
		//2-Sus nombres no son únicos, por ejemplo 2, 3 o más métodos pueden definir variables con el mismo nombre
		//3-No existen en memoria hasta que se ejecuta el método, esta propiedad permite ahorrar memoria porque deja que varios
		//métodos compartan la misma memoria para sus variables locales aunque no de manera simultánea
		
		//Variables de clase:
		
	}
}
