package introduccion;

public class OperadoresLogicos {

	public static void main(String[] args) {
		/*Operadores lógicos
		 * Operador     Operación Lógica         Ejemplo
		 * Negación     No Lógico                !(x>y)
		 * O, Lógica    Operando1 || Operando2   m = 5 || n !=10
		 * Y, Lógica    Operando1 && Operando2   m > n || i > j
		 * 
		 * Tabla de verdad del Operador Lógico NO
		 * Operando(a) NOT a
		 * Verdadero   Falso
		 * Falso       Verdadero
		 *
		 * Tabla de verdad del Operador Lógico OR (||)
		 * Operando						A||B
		 * A     			B
		 * Verdadero	Verdadero		Verdadero
		 * Verdadero 	Falso			Verdadero
		 * Falso		Verdadero		Verdadero
		 * Falso		Falso			Falso
		 * 
		 * 
		 * Tabla de verdad del Operador Lógico AND(&&)
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
		 * System.out.println("Los resultados no son válidos);
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