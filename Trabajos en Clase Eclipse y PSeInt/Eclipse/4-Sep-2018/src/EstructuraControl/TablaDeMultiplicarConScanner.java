package EstructuraControl;
import java.util.Scanner;
//PROGRAMA QUE IMPRIME LA TABLA DE MULTIPLICAR DE UN N�MERO INTRODUCIDO POR TECLADO
public class TablaDeMultiplicarConScanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("�De qu� n�mero quieres la tabla de Multiplicaci�n?: ");
		double TABLA = entrada.nextDouble();
		for(int i = 1; i <= 10 ; i++)
		{
			System.out.println(TABLA + " x " + i + " = " + TABLA*i);
		}
	}
}