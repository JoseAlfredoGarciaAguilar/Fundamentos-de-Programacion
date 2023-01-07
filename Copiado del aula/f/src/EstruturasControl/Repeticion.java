package EstruturasControl;
import java.util.Scanner;
public class Repeticion {

	public static void main(String[] args) {
		//REPETICION: BUCLE DO......WHILE
		//SINTAXIS: 
		//1.- DO SENTENCIA WHILE (EXPRESION)
		//2.- DO (EXPRESION)
		Scanner entrada = new Scanner(System.in);
		char opcion; 
		do 
		{
			System.out.println("HOLA");
			System.out.println("¿DESEA OTRO TIPO DE SALUDO?");
			System.out.println("PULSE \"s\" PARA SI Y n PARA NO");
			opcion = entrada.next().charAt(0);
			System.out.println("teclado = "+opcion);
		}while (opcion== 's' || opcion == 'S');	
		System.out.println("Adios!");
			

	}

}
