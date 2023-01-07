package EstructuraControl;
import java.util.Scanner;
//PROGRAMA QUE IMPRIME LA TABLA DE MULTIPLICAR DE UN NÚMERO INTRODUCIDO POR TECLADO
public class TablaDeMultiplicarConScanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿De qué número quieres la tabla de Multiplicación?: ");
		double TABLA = entrada.nextDouble();
		for(int i = 1; i <= 10 ; i++)
		{
			System.out.println(TABLA + " x " + i + " = " + TABLA*i);
		}
	}
}