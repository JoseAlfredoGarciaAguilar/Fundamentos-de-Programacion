package Tarea2;
import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		int i,j,k;
		int Primero[]= new int[21];
		int Segundo[]= new int[21];
		int Tercero[][] = new int[7][8];
		Scanner entrada=new Scanner(System.in);
		  k=entrada.nextInt();
	        for (i=3;i<=k;)
	          Segundo[i++]=entrada.nextInt();
	        j=4;
	        System.out.println(+ Segundo[k]+" "+ Segundo[j+1]);
	}
}