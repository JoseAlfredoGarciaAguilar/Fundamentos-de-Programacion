package Arreglos;
import java.util.Scanner;

public class Ventas {
static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		double ventas[][]=new double[5][4];
		leerVentas(ventas);
		ImprimirVentasZona(ventas);
		ImprimirVentasTrimestre(ventas);
	}
	static void leerVentas(double v[][])
	{
		int i, j;
		for(i=0;i<v.length;i++)
		{
			System.out.println("Ventas Zona:" + (i+1));
			for(j=0;j<v[i].length;j++){
				System.out.print("Trimestre " + (j+1) + ":");
				v[i][j] = teclado.nextDouble();
			}
		}
	}
	static void ImprimirVentasZona(double a[][]){
		int i, j;
		double suma, total=0;
		for(i=0;i<a.length;i++){
			suma=0;
			for(j=0;j<a[i].length;j++){
				suma+=a[i][j]; //suma = suma + a[i][j]
				total+=a[i][j];
				}
			//Imprimir total
			System.out.println("Total Zona " + (i+1) + " = " + suma);
		}
		System.out.println("TOTALES = " + total);
	}
	static void ImprimirVentasTrimestre(double a[][]){
		int i, j;
		double suma=0;
		for(i=0;i<a[i].length;i++){
			suma=0;
			for(j=0;j<a.length;j++){
				suma+=a[j][i];
			}
			System.out.println("Total por Trimestre " + (i+1) + " = " + suma);
		}
	}
}