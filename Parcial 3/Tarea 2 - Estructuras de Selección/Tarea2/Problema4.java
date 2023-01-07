package Tarea2;
import java.util.Scanner;
//PROGRAMA QUE CALCULA LA EDAD DE UNA PERSONA, AL INGRESAR SU AÑO DE NACIMIENTO Y EL AÑO ACTUAL
public class Problema4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-Programa que calcula la edad de una persona, al ingresar su año de nacimiento y el año actual");
		System.out.print("Escribe el año de nacimiento: ");
		int año_de_nacimiento = entrada.nextInt();
		System.out.print("Escribe el año actual: ");
		int año_actual = entrada.nextInt();
		
		int edad_de_la_persona = año_actual - año_de_nacimiento;
		System.out.print("La persona tiene " + edad_de_la_persona + " años de edad, aproximadamente");
	}
}