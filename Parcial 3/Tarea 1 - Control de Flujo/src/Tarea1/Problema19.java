package Tarea1;
import java.util.Scanner;

public class Problema19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el a�o: ");
		int a�o = entrada.nextInt();
		
		if(a�o % 4 == 0)
		{
			System.out.println("Enero tiene 31 d�as");
			System.out.println("Febrero tiene 29 d�as");
			System.out.println("Marzo tiene 31 d�as");
			System.out.println("Abril tiene 30 d�as");
			System.out.println("Mayo tiene 31 d�as");
			System.out.println("Junio tiene 30 d�as");
			System.out.println("Julio tiene 31 d�as");
			System.out.println("Agosto tiene 31 d�as");
			System.out.println("Septiembre tiene 30 d�as");
			System.out.println("Octubre tiene 31 d�as");
			System.out.println("Noviembre tiene 30 d�as");
			System.out.println("Diciembre tiene 31 d�as");
			System.out.println("Cabe decir que el " + a�o + ", S� es a�o bisiesto");
			
		}
		else
		{
			System.out.println("Enero tiene 31 d�as");
			System.out.println("Febrero tiene 28 d�as");
			System.out.println("Marzo tiene 31 d�as");
			System.out.println("Abril tiene 30 d�as");
			System.out.println("Mayo tiene 31 d�as");
			System.out.println("Junio tiene 30 d�as");
			System.out.println("Julio tiene 31 d�as");
			System.out.println("Agosto tiene 31 d�as");
			System.out.println("Septiembre tiene 30 d�as");
			System.out.println("Octubre tiene 31 d�as");
			System.out.println("Noviembre tiene 30 d�as");
			System.out.println("Diciembre tiene 31 d�as");
			System.out.println("Cabe decir que el " + a�o + ", No es a�o bisiesto");
			
		}
	}
}