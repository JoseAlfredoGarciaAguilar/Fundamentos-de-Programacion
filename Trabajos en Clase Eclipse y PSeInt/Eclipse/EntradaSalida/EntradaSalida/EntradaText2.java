package EntradaSalida;
import java.util.Scanner;

public class EntradaText2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Leer un double
		System.out.print("Proporciona Sueldo diario: ");
		double sueldo_diario;
		sueldo_diario = teclado.nextDouble();
		System.out.print("Proporciona horas semanales trabajadas: ");
		int horas_semanales = teclado.nextInt();
		double sueldo_total = sueldo_diario * horas_semanales;
		System.out.printf("Sueldo Total = ");
		System.out.printf("%9.2f", sueldo_total);
	}

}
