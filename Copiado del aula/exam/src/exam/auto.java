package exam;

import java.util.Scanner;

public class auto {

	public static void main(String[] args) {
		
		int anioAd, anioVida;
		float costoAuto, valorRescate, deprecAnual;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Costo auto = ");
		costoAuto = input.nextFloat();
		
		System.out.print("Valor de rescate = ");
		valorRescate = input.nextFloat();
		
		System.out.print("Anios de vida util = ");
		anioVida = input.nextInt();
		
		System.out.print("Anio de adquisicion = ");
		anioAd = input.nextInt();
		
		deprecAnual = (costoAuto - valorRescate)/anioVida;
		
		System.out.print("ANIO\t\t");
		System.out.print("DEPRECIACION\t");
		System.out.print("DEPRECIACION ACUM\t");
		System.out.print("VALOR ANUAL\t\t");
		System.out.println();
		
		for (int i = 0; i < anioVida; i++) {
			System.out.print((anioAd + i) + "\t\t");
			System.out.print(deprecAnual + "\t\t");
			System.out.print(deprecAnual * (i + 1) + "\t\t\t");
			System.out.print(costoAuto - (deprecAnual * (i + 1)) + "\t\t");
			System.out.println();
		}
		
		input.close();	
		
	}

}
