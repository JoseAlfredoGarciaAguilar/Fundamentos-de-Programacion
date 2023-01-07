package Tarea2;
import java.util.Scanner;

public class Problema5 {

	public static void main(String[] args) {
		int i,j,k;
		int Primero[]= new int[21];
		int Segundo[]= new int[21];
		int Tercero[][] = new int[7][8];
		Scanner entrada=new Scanner(System.in);
		
		  for (j=0;j<7;)
	            Primero[j++]=entrada.nextInt();
	        i=0;
	        j=1;
	        while ( (j<6) && (Primero[j-1] <Primero[j] ))
	        {
	            i++;j++;
	        }
	        for (k=-1;k<j+2;)
	           System.out.println(Primero[++k]);
	}
}