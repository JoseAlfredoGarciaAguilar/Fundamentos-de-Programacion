package Examen;
import java.util.Scanner;

public class Problema3 {

	public static void main(String []args){
		Scanner entrada = new Scanner(System.in);
		System.out.print("�C�mo se llama el empleado?: ");
		String nombre = entrada.nextLine();
		System.out.print("Escribe el salario de " + nombre + ": ");
		double sueldo = entrada.nextDouble();
		
		if((sueldo >= 0) && (sueldo <= 10000))
		{
			double sueldo_final = (sueldo * 0.2) + sueldo;
			System.out.println("El sueldo final de " + nombre + " es $" + sueldo_final);
		}
		
		if((sueldo > 10000) && (sueldo <= 15000))
		{
			double sueldo_final = (sueldo * 0.1) + sueldo;
			System.out.println("El sueldo final de " + nombre + " es $" + sueldo_final);
		}
		
		if((sueldo > 15000) && (sueldo <= 20000))
		{
			double sueldo_final = (sueldo * 0.05) + sueldo;
			System.out.println("El sueldo final de " + nombre + " es $" + sueldo_final);
		}
		
		if(sueldo > 20000)
		{
			double sueldo_final = sueldo;
			System.out.println("El sueldo final de " + nombre + " es $" + sueldo_final);
		}
	}
}