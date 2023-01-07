package Unidad4;
import java.util.Scanner;

public class Problema5 {

	public static void main(String[] args) {
		int i,j,k;
		int Primero[]= new int[21];
		int Segundo[]= new int[21];
		int Tercero[][] = new int[7][8];
		Scanner entrada=new Scanner(System.in);
		
		  for (i=0;i<12;i++)
		        Primero[i]=entrada.nextInt();
		        for(j=0;j<6;j++)
		            Segundo[j]=Primero[2*j]+j;
		        for(k=3;k<=7;k++)
		            System.out.println(Primero[k+1]+" "+Segundo[k-1]);
	}
}