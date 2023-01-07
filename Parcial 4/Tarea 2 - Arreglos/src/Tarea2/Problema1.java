package Tarea2;
import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {
		  int i,j,k;
		  int Primero[]= new int[21];
		  int Segundo[]= new int[21];
		  int Tercero[][] = new int[7][8];
		  Scanner entrada=new Scanner(System.in);
		  
		  for (i=1;i<=6;i++)

	            Primero[i]=entrada.nextInt();

	        for (i=3;i>0;i--)

	            System.out.print(Primero[2*i]+" ");
	}
}