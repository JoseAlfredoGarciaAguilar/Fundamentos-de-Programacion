package Tarea2;
import java.util.Scanner;
//PROGRAMA QUE CALCULA LA EDAD DE UNA PERSONA, AL INGRESAR SU A�O DE NACIMIENTO Y EL A�O ACTUAL
public class Problema4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-Programa que calcula la edad de una persona, al ingresar su a�o de nacimiento y el a�o actual");
		System.out.print("Escribe el a�o de nacimiento: ");
		int a�o_de_nacimiento = entrada.nextInt();
		System.out.print("Escribe el a�o actual: ");
		int a�o_actual = entrada.nextInt();
		
		int edad_de_la_persona = a�o_actual - a�o_de_nacimiento;
		System.out.print("La persona tiene " + edad_de_la_persona + " a�os de edad, aproximadamente");
	}
}