package Unidad4;
import java.util.Scanner;

public class Problema7 {

	public static void main(String[] args) {
		int i,j,k;
		int Primero[]= new int[21];
		int Segundo[]= new int[21];
		int Tercero[][] = new int[7][8];
		Scanner entrada=new Scanner(System.in);
		  for (i=0;i<3;i++)
		        for(j=0;j<12;j++)
		            Tercero[i][j]=i+j+1;
		        for(i=0;i<3;i++)
		        {
		            j=2;
		            while (j<12)
		            {
		                System.out.println(i+" "+j+" "+ Tercero[i][j]);
		                j+=3;
		            }
		        }
	}
}