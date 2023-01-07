package Introduccion;

import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		// Declaracion de arreglo
		/*
		int V [][];//declarando
		V = new int[3][5];//inicializando
		*/
		int V[][] = new int[3][5];//Matriz de 15 elementos 
		leer (V);
		visualizar (V);

	}
	static void leer (int a[][])
	{
		int i,j;//Variables de control
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entrada de datos de la matriz");
		for (i=0;i<a.length;i++)// la propiedad length regresa todos los renglones
		{
			System.out.println("Fila: "+i);
			for (j=0;j<a[i].length;j++)//
			{
				a[i][j]= entrada.nextInt();
			}
		}
	}
	static void visualizar(int a[][])
	{
		int i,j;
		System.out.println("\n\t Matriz leida\n" );
		for (i=0;i<a.length;i++)
		{
			for (j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
