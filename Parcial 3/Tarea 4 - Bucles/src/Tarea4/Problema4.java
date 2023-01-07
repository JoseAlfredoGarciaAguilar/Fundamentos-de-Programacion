package Tarea4;
import java.util.Scanner;
//PROGRAMA QUE PIDE EL SUELDO DE UN EMPLEADO, Y EN BASE A ELLO, SE LE AGREGA UN PORCENTAJE DE BONIFICACIÓN
//IMPRIMIENDO ASÍ SU SUELDO FINAL
public class Problema4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿Cuánto ganó el empleado?: ");
		double ganancia = entrada.nextDouble();
		
		if((ganancia > 0) && (ganancia <= 9000))
		{
			double sueldo_final = (ganancia * 0.2) + ganancia;
			System.out.print("El sueldo final es = $" + sueldo_final);
		}
		
		if((ganancia > 9000) && (ganancia <= 15000))
		{
			double sueldo_final = (ganancia * 0.1) + ganancia;
			System.out.print("El sueldo final es = $" + sueldo_final);
		}
		
		if((ganancia > 15000) && (ganancia <= 20000))
		{
			double sueldo_final = (ganancia * 0.05) + ganancia;
			System.out.print("El sueldo final es = $" + sueldo_final);
		}
		
		if(ganancia > 20000)
		{
			double sueldo_final = ganancia * 1;
			System.out.print("El sueldo final es = $" + sueldo_final);
		}
		
		if(ganancia < 0)
		{
			System.out.println("ERROR. Prueba de nuevo");
		}
	}
}