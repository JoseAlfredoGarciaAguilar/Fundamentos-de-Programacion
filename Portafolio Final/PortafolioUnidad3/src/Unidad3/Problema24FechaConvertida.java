package Unidad3;
import java.util.Scanner;

public class Problema24FechaConvertida {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el número de día: ");
		int dia = entrada.nextInt();
		System.out.print("Escribe el nombre del mes: ");
		char mes = entrada.next().charAt(2);
		System.out.print("Escribe el año: ");
		int año = entrada.nextInt();
		
		
		if(mes == 'E')
		{
			System.out.println(dia + " 1 " + año);
		}
		if(mes == 'B')
		{
			System.out.println(dia + " 2 " + año);
		}
		if(mes == 'R')
		{
			System.out.println("¿Es el mes de Marzo o Abril?");
			char marzo_abril = entrada.next().charAt(0);
			if(marzo_abril == 'M')
			{
				System.out.println(dia + " 3 " + año);
			}
			if(marzo_abril == 'A')
			{
				System.out.println(dia + " 4 " + año);
			}
		}
		if(mes == 'Y')
		{
			System.out.println(dia + " 5 " + año);
		}
		if(mes == 'N')
		{
			System.out.println(dia + " 6 " + año);
		}
		if(mes == 'L')
		{
			System.out.println(dia + " 7 " + año);
		}
		if(mes == 'O')
		{
			System.out.println(dia + " 8 " + año);
		}
		if(mes == 'P')
		{
			System.out.println(dia + " 9 " + año);
		}
		if(mes == 'T')
		{
			System.out.println(dia + " 10 " + año);
		}
		if(mes == 'V')
		{
			System.out.println(dia + " 11 " + año);
		}
		if(mes == 'C')
		{
			System.out.println(dia + " 12 " + año);
		}
		}
}