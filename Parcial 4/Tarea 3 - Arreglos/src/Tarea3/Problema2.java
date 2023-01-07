package Tarea3;
import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿De cuántas filas y columnas lo quieres?: ");
		int n = entrada.nextInt();
		int i_ant = 0;
		int j_ant = 0;
		int punto_inicial = n/2;
		
		int temporal = 1;int[][]matriz_magica = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matriz_magica[i][j] = 0;
			}
		}
		int i = 0;
		int j = punto_inicial;
		
		while(temporal != (n*n+1)) {
			if(matriz_magica[i][j]==0) {
				matriz_magica[i][j] = temporal;
			}
			else{
					i = i_ant +1;
					j = j_ant +1;
					matriz_magica[i][j] = temporal;
				}
			i_ant = i;
			j_ant = j;
			
			temporal++;
			j++;
			i--;
			if(i<0 && j==n) {
				i = n-1;
				j = 0;
			}
			else if(i < 0) {
				i = i+n;
			}
			else if(j==n) {
				j=0;
			}
			}
		for(int x=0; x<n; x++) {
			String resultado = " ";
			for(int y=0; y<n; y++) {
				resultado = resultado + " " + matriz_magica[x][y];
			}
			System.out.println(" " + resultado);
		}
		}
}