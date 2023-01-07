package Unidad3;
import java.util.Scanner;

public class Problema20Salario {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe las horas que trabajó el empleado en toda la semana: ");
		double horas = entrada.nextInt();
		System.out.print("Escribe el pago semanal al trabajar 38 horas: ");
		double pago = entrada.nextInt();
		
		if(horas <= 38)
		{
			double pago_horas_incompletas = (pago/38) * horas;
			System.out.print("El empleado ganó $" + pago_horas_incompletas);
		}
		if(horas > 38)
		{
			double pago_especial = (pago * 0.5) + pago;
			System.out.println("El empleado ganó $" + pago_especial);
			double sueldo_final = pago_especial - (pago_especial * 0.1);
			System.out.print("Sin embargo, con el cálculo de impuestos, el sueldo final del empleado es $" + sueldo_final);
		}
}
}