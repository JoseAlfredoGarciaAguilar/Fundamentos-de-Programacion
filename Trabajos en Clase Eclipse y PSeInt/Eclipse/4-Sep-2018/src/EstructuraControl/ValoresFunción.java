package EstructuraControl;
import java.util.Scanner;
//PROGRAMA QUE AL INGRESAR UN N�MERO, LO SUSTITUYE EN UNA ECUACI�N
public class ValoresFunci�n {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int VECES = 5;
		for(int i = 1; i <= VECES; i++)
		{
			double x, f;
			System.out.print("Valor de x: ");
			x = entrada.nextDouble();
			f = Math.exp(2*x) - x;
			System.out.println("f(" + x +")= " + f);
		}
	}
}