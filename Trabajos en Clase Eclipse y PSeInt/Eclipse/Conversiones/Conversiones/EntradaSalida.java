package Conversiones;

public class EntradaSalida {
	public static void main(String[]arg){
		/*En Java la entrada y la salida se escribe en flujos (se les conoce como streams)
		 *La fuente basica es el teclado, mientras la salida es la pantalla
		 *La clase System define dos referencias a objetos estáticos de entrada y salida por consola
		 *System.in   para entrada
		 *System.out   para salida
		 */
		//Salida (System.out)
		System.out.print("Oración 1"); //Transfiere una cadena al buffer de la pantalla
		System.out.print("Oracion 2");
		System.out.println("Linea 1"); //Transfiere una cadena y el caracter de fin de linea buffer de la pantalla
		System.out.println("Linea 2");
		System.out.println("Cadena 1" + "Cadena 2" + "Cadena 3");
		System.out.print("Oracion 1 \nOracion 2\n");
}
}
