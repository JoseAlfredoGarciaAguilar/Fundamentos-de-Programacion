package Unidad3;
import java.util.Scanner;

public class Problema25CálculoDeEdad {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el nombre de la persona: ");
		String nombre = entrada.nextLine();
		System.out.println("Escribe el mes de nacimiento: ");
		int mes_de_nacimiento = entrada.nextInt();
		System.out.print("Escribe el año de nacimiento: ");
		int año_de_nacimiento = entrada.nextInt();
		System.out.print("Escribe el año actual: ");
		int año_actual = entrada.nextInt();
		
		int edad_de_la_persona = año_actual - año_de_nacimiento;
		
		if(edad_de_la_persona > 1)
		System.out.println(nombre + " tiene " + edad_de_la_persona + " años de edad, aproximadamente");
		else
			System.out.println(nombre + " es un bebé que tiene menos de un año de edad");
	}
}