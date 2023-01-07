package Tarea2;
import java.util.Scanner;
//PROGRAMA QUE CALCULA EL SALARIO SEMANAL DE UN TRABAJADOR , DE ACUERDO A LAS
//SIGUIENTES REGLAS:
//SI TRABAJÓ 38 HORAS, PAGAR SUELDO NORMAL
//SI TRABAJÓ MÁS DE 38 HORAS (HORAS EXTRAS), PAGAR 50% MÁS
//SI SU SUELDO ES MENOR O IGUAL A $471, NO APLICARLE IMPUESTOS
//SI SU SUELDO ES MAYOR QUE $471, APLICARLE 10% DE IMPUESTOS
public class Problema7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-Programa que calcula el salario semanal de un empleado-");
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