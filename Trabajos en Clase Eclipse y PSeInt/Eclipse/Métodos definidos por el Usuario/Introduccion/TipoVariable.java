package Introduccion;
/*
Autor: José Alfredo García Aguilar
Propósito: Explicar tipo de variables
Fecha de creación: 18 Sept 2017
 */

public class TipoVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comentarios
		//Este es un comentario
		int i; // Creo una variable entera
		//ELEMENTOS DE UN PROGRAMA EN JAVA
		//TOKENS(ELEMENTOS LEXICOS DEL PROGRAMA)
		/*
		 * 1.Identificadores
		 * 2.Palabras Reservadas
		 * 3.Literales
		 * 4.Operadores
		 * 5.Otros Separadores
		 */
		/*Identificadores: Secuencia de caracteres, letras, digitos, subrayados(_) -  y el símbolo de pesos ($)
		 * Válidos: Nombre_ clase, nombre_clase, var123, _variable, $a, a1, EsteEsUnNombreDeVariableValido, PI
		 * Inválidos: nombre-clase, 1a, nombre clase, if, case, break. No aconsejable: pi
		 * 
		 * Palabras Reservadas: void, class, int, double, boolean, if, case, do, default, while
		 * 
		 * Signos de puntuación y separadores: !, %, $, &, *. ( ), - , +, { }, ', ^, |, [ ], ;, _, < >, ?, ., /, etc.
		 * 
		 * Tipos
		 */
			int variable1;
			variable1 = 0;
			int variable2;
			variable2 = 0;
			int suma;
			suma = variable1 + variable2;
			int v1,v2,v3,v4;
			int z1 = 0;
			int z2 = 0, z3 = 1, z4 = 2;
			int valor1, valor2; int num_parte = 1141, num_items = 45;
			long var1 = 5;
			char c = ' ';
			byte edad = 127;
			short num_alumnos = 32767;
			//Conversión explícita
			short x;
			int a1 = 19, b1 = 5;
			x = (short)(a1 + b1);
			
			
			//Conversión implícita
			int y;
			short a2 = 19, b2 = 5;
			y = (int)(a2 + b2);
			
			long medidaMilimetros;
			long distanciaMedia;
			long numerosGrandes = (long)(40000.5877);
			long numerosGrandes2 = 40000L;
			System.out.println(numerosGrandes);
			System.out.println(numerosGrandes2);
			
			float valor;
			float valor3, valor4;
			float valor5 = 99.9F;
			System.out.println(valor5);
			double valor6 = 8.5e10;
			System.out.println(valor6);
			
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
				System.out.println("Verdadero");
			else
				System.out.println("Falso");
			encontrado = (3>2) & (5<10);
			int y1 = 9;
			boolean estaEnRango;
			estaEnRango = (y1<-1) || (y1>15);
			if (estaEnRango)
				System.out.println("el valor "+y1+"Esta Rango");
			else
				System.out.println("el valor "+y1+"No Esta Rango");
			}
}