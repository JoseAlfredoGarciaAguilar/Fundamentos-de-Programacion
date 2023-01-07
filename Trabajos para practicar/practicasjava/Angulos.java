// Programa que obtiene el valor de un angulo  al escribir el valor de otro en un triangulo rectangulo
// Autor: Josè Carlos Ochoa Taboada

import java.util.Scanner;
public class Angulos
{
	static Scanner lectura=new Scanner(System.in);
	public static void main(String[] args)
	{
		float angA,angB = 0;
		System.out.println("Introduce el valor del angulo a");
		 angA = lectura.nextFloat();
		 angB = (90 - angA);
		System.out.printf("El valor del angulo b es de: %.3f grados" ,angB);
	}
}
