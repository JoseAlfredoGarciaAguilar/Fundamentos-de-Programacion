package introduccion;

public class OperadoresLogicos {

	public static void main(String[] args) {
		/*Operadores l�gicos
		 * Operador     Operaci�n L�gica         Ejemplo
		 * Negaci�n     No L�gico                !(x>y)
		 * O, L�gica    Operando1 || Operando2   m = 5 || n !=10
		 * Y, L�gica    Operando1 && Operando2   m > n || i > j
		 * 
		 * Tabla de verdad del Operador L�gico NO
		 * Operando(a) NOT a
		 * Verdadero   Falso
		 * Falso       Verdadero
		 *
		 * Tabla de verdad del Operador L�gico OR (||)
		 * Operando						A||B
		 * A     			B
		 * Verdadero	Verdadero		Verdadero
		 * Verdadero 	Falso			Verdadero
		 * Falso		Verdadero		Verdadero
		 * Falso		Falso			Falso
		 * 
		 * 
		 * Tabla de verdad del Operador L�gico AND(&&)
		 * Operando						A&&B
		 * A				B
		 * Verdadero	Verdadero	Verdadero
		 * Verdadero	Falso		Falso
		 * Falso		Verdadero	Falso
		 * Falso		Falso		Falso
		 */
		/*
		 * if (a<b) && (c>d)
		 * {
		 * System.out.println("Los resultados no son v�lidos);
		 * }
		 * if (ventas > 50000) || (horas < 100);
		 * {
		 *    prima = 100000;
		 * }
		 * if (! (ventas>2500))
		 * }
		 *    prima = 12500;
		 * }
		 * 
		 * Operador condicional(?:)
		 * expresion_c ? expresion_v : expresion_F
		 * n>0 ? 1: 0;
		 */
		
		int edad = 19;
		String resultado;
		resultado = edad > 18 ? "Mayor de Edad" : "Menor de Edad";
		System.out.println(resultado);
	}
}