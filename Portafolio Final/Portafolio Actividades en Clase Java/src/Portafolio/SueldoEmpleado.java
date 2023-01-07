package Portafolio;
import java.util.Scanner;

public class SueldoEmpleado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Proporciona la Tarifa por Hora del Empleado: ");
		double th = entrada.nextDouble();
		System.out.println("Proporciona las Horas Mensuales Trabajadas: ");
		int hrsm = entrada.nextInt();
		double sm = hrsm*th;
		System.out.println("Sueldo Mensual = " + sm);
	}
}