package Arreglos;
import java.util.Scanner;

public class Tabla {

	public static void main(String[] args) {
		int v[][] = new int[3][5];//declarando un arreglo de orden 3 X 5
		leer(v);
		visualizar(v);
	}
	static void leer(int a[][]){
		int i, j; //variables de control
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entrada de datos de la matriz");
		for(i=0; i<a.length; i++)//la propiedad length regresa los renglones
		{
			System.out.println("Fila: " +  i);
			for(j=0; j<a[i].length; j++)//la propieada length regresa el número de columnas
			{
				a[i][j] = entrada.nextInt();
			}
		}
	}
	static void visualizar(int a[][]){		
		int i, j;
		System.out.println("\n\t Matriz Leída\n");
		for(i=0;i<a.length;i++)
		{
			for(j=0; j<a[i].length;j++)
				System.out.print(a[i][j] + " ");
			System.out.println(" ");
		}
	}
}