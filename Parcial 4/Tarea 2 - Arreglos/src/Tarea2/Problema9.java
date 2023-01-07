package Tarea2;

public class Problema9 {

	public static void main(String[] args) {
		int suma = 0;
		int arreglos[][] = {{1,2},{3,4}};
		int m[] = {1,2,3};
		int x[] = {4,5,6};
		int n[] = {7,8,9};
		System.out.println("ARREGLO ORIGINAL");
		System.out.println(m[0] + " " + x[0] + " " + n[0]);
		System.out.println(m[1] + " " + x[1] + " " + n[1]);
		System.out.println(m[2] + " " + x[2] + " " + n[2]);
		System.out.println("");
		
		System.out.println("INTERCAMBIO");
		System.out.println(m[2] + " " + x[2] + " " + n[2]);
		System.out.println(m[1] + " " + x[1] + " " + n[1]);
		System.out.println(m[0] + " " + x[0] + " " + n[0]);
	}
}