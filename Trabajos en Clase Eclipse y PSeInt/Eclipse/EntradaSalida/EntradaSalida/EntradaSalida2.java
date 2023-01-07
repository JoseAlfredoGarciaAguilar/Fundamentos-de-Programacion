package EntradaSalida;

public class EntradaSalida2 {

	public static void main(String[] args) {
		//En Java la entrada y salida se lee y escribe en flujo
		/*A estos flujos se les conoce como streams
		 * La fuente básica de entrada de datos es el teclado
		 * y de salida es la pantalla
		 * La clase System define dos referencias a objetos
		 * static para la gestión de entrada y salida por consola
		 * System.in para entrada por teclado
		 * System.out para salida por pantalla
		 */
		
		//La salida (System.out)
		System.out.println("Esto es una cadena");
		System.out.print("Esto es una cadena");
		System.out.print("Esto es una cadena");
		// print() transfiere una cadena de caractertes al buffer
		//		pantalla
		//println() transfiere una cadena de caracteres y el caracter
		//		de fin de línea  al buffer de la pantalla
		System.out.println(); //Imprime una línea en blanco
		System.out.println("Viaje relámpago a " + "la comarca " + "Lagunera");
		
		int x = 500;
		System.out.print(x);
		double r = 2.0;
		double area = Math.PI * r * r;
		System.out.println("Radio = "+r+ "," + "Area = "+area);
		
		//Salida con formato printf
		System.out.printf("%9.2f", area);
		double precio = 25.4;
		System.out.println();
		System.out.println(precio);
		System.out.println();
		System.out.printf("$");
		System.out.printf("%9.2f", precio);
		System.out.printf(" Unidad");
	}

}