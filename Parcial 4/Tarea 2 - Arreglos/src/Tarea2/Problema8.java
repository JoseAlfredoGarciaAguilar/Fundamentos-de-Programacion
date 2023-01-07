package Tarea2;

public class Problema8 {

	public static void main(String[] args) {
		int suma = 0;
		int arreglos[][] = {{4,0,1,6},{7,3,2,1},{-5,-2,4,0},{4,6,1,3},{9,-2,1,-4}};
		int a[] = {4,0,1,6};
		int e[] = {7,3,2,1};
		int i[] = {-5,-2,4,0};
		int o[] = {4,6,1,3};
		int u[] = {9,-2,1,-4};
		System.out.println(a[0] + "  " + e[0] + "  " + i[0] + "  " + o[0] + "  " + u[0]);
		System.out.println(a[1] + "  " + e[1] + "  " + i[1] + "  " + o[1] + "  " + u[1]);
		System.out.println(a[2] + "  " + e[2] + "  " + i[2] + "  " + o[2] + "  " + u[2]);
		System.out.println(a[3] + "  " + e[3] + "  " + i[3] + "  " + o[3] + "  " + u[3]);
		
		int suma_diagonal_principal = (a[0] + e[1] + i[2] + o[3]);
		int suma_de_todos_los_elementos = (a[0] + a[1] + a[2] +
				e[0] + e[1] + e[2] + e[3] + i[0] + i[1] + i[2] + i[3] +
				o[0] + o[1] + o[2] + o[3] + u[0] + u[1] + u[2] + u[3]);
		int resultado = suma_de_todos_los_elementos - suma_diagonal_principal;
		
		System.out.print("Suma de todos los elementos que no pertenecen a la diagonal principal = " + resultado);
}
}