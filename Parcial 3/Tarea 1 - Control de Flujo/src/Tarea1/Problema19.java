package Tarea1;
import java.util.Scanner;

public class Problema19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el año: ");
		int año = entrada.nextInt();
		
		if(año % 4 == 0)
		{
			System.out.println("Enero tiene 31 días");
			System.out.println("Febrero tiene 29 días");
			System.out.println("Marzo tiene 31 días");
			System.out.println("Abril tiene 30 días");
			System.out.println("Mayo tiene 31 días");
			System.out.println("Junio tiene 30 días");
			System.out.println("Julio tiene 31 días");
			System.out.println("Agosto tiene 31 días");
			System.out.println("Septiembre tiene 30 días");
			System.out.println("Octubre tiene 31 días");
			System.out.println("Noviembre tiene 30 días");
			System.out.println("Diciembre tiene 31 días");
			System.out.println("Cabe decir que el " + año + ", Sí es año bisiesto");
			
		}
		else
		{
			System.out.println("Enero tiene 31 días");
			System.out.println("Febrero tiene 28 días");
			System.out.println("Marzo tiene 31 días");
			System.out.println("Abril tiene 30 días");
			System.out.println("Mayo tiene 31 días");
			System.out.println("Junio tiene 30 días");
			System.out.println("Julio tiene 31 días");
			System.out.println("Agosto tiene 31 días");
			System.out.println("Septiembre tiene 30 días");
			System.out.println("Octubre tiene 31 días");
			System.out.println("Noviembre tiene 30 días");
			System.out.println("Diciembre tiene 31 días");
			System.out.println("Cabe decir que el " + año + ", No es año bisiesto");
			
		}
	}
}