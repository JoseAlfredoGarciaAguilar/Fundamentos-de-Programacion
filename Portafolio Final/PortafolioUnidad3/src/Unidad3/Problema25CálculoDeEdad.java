package Unidad3;
import java.util.Scanner;

public class Problema25C�lculoDeEdad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el nombre de la persona: ");
		String nombre = entrada.nextLine();
		System.out.println("Escribe el mes de nacimiento: ");
		int mes_de_nacimiento = entrada.nextInt();
		System.out.print("Escribe el a�o de nacimiento: ");
		int a�o_de_nacimiento = entrada.nextInt();
		System.out.print("Escribe el a�o actual: ");
		int a�o_actual = entrada.nextInt();
		
		int edad_de_la_persona = a�o_actual - a�o_de_nacimiento;
		
		if(edad_de_la_persona > 1)
		System.out.println(nombre + " tiene " + edad_de_la_persona + " a�os de edad, aproximadamente");
		else
			System.out.println(nombre + " es un beb� que tiene menos de un a�o de edad");
	}
}