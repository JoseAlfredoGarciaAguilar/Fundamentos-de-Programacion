package Tarea2;
import java.util.Scanner;

//PROGRAMA QUE IMPRIME EL N�MERO DE D�AS DE CADA MES, AL INGRESAR EL A�O

public class Problema6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-Programa que determina el n�mero de d�as de cada mes, al ingresar el a�o-");
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