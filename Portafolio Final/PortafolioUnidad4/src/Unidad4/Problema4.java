package Unidad4;
import java.util.Scanner;

public class Problema4 {

	public static void main(String[] args) {
		int i,j,k;
		int Primero[]= new int[21];
		int Segundo[]= new int[21];
		int Tercero[][] = new int[7][8];
		Scanner entrada=new Scanner(System.in);
		  for (i=0;i<10;i++)
	            Primero[i]=i+3;
	        j=entrada.nextInt();
	        k=entrada.nextInt();
	        for (i=j;i<=k;)
	            System.out.println(Primero[i++]);
	}
}