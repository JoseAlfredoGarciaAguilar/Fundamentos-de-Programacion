package Unidad3;
import java.util.Scanner;

public class Problema24FechaConvertida {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el n�mero de d�a: ");
		int dia = entrada.nextInt();
		System.out.print("Escribe el nombre del mes: ");
		char mes = entrada.next().charAt(2);
		System.out.print("Escribe el a�o: ");
		int a�o = entrada.nextInt();
		
		
		if(mes == 'E')
		{
			System.out.println(dia + " 1 " + a�o);
		}
		if(mes == 'B')
		{
			System.out.println(dia + " 2 " + a�o);
		}
		if(mes == 'R')
		{
			System.out.println("�Es el mes de Marzo o Abril?");
			char marzo_abril = entrada.next().charAt(0);
			if(marzo_abril == 'M')
			{
				System.out.println(dia + " 3 " + a�o);
			}
			if(marzo_abril == 'A')
			{
				System.out.println(dia + " 4 " + a�o);
			}
		}
		if(mes == 'Y')
		{
			System.out.println(dia + " 5 " + a�o);
		}
		if(mes == 'N')
		{
			System.out.println(dia + " 6 " + a�o);
		}
		if(mes == 'L')
		{
			System.out.println(dia + " 7 " + a�o);
		}
		if(mes == 'O')
		{
			System.out.println(dia + " 8 " + a�o);
		}
		if(mes == 'P')
		{
			System.out.println(dia + " 9 " + a�o);
		}
		if(mes == 'T')
		{
			System.out.println(dia + " 10 " + a�o);
		}
		if(mes == 'V')
		{
			System.out.println(dia + " 11 " + a�o);
		}
		if(mes == 'C')
		{
			System.out.println(dia + " 12 " + a�o);
		}
		}
}