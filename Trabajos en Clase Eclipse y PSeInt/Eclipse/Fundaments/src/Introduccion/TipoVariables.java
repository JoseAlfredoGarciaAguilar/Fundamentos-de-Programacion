package Introduccion;

public class TipoVariables {

	public static void main(String[]arg) {
		
		//Tipo Caracter
		char datoCar;
		char letra = 'A';
		char respuesta = 'S';
		char carUno = 'a';
		System.out.println("Caracter "+carUno);
		carUno = (char)(carUno-32);
		System.out.println("Caracter "+carUno);
		//Tipo Boolean
		boolean bisiesto;
		bisiesto = true;
		boolean encontrado, bandera;
		encontrado = true;
		bandera = false;
		if (encontrado)
			System.out.println("Valor encontrado");
		else
			System.out.println("Valor no encontrado");
		encontrado = (3>2) & (11<10);
		if (encontrado)
			System.out.println("Verdadero");
		else
			System.out.println("Falso");
		int y1 = 9;
		boolean estaEnRango;
		estaEnRango = (y1<-1) || (y1>15);
		if (estaEnRango)
			System.out.println("el valor "+y1+"Esta Rango");
		else
			System.out.println("el valor "+y1+"No Esta Rango");
		
		//Conversiones de tipo
		float var2 = 55.87F;
		int var3 = (int)(var2);
		System.out.println(var3);
		int var4 = 100;
		float var5 = (float)(var4);
		System.out.println(var5);
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
		System.out.println("Notaci�n cient�fica = "+a3);
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
		}
	}
