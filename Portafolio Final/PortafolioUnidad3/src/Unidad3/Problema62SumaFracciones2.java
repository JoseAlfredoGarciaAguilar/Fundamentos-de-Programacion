package Unidad3;
import java.util.Scanner;

public class Problema62SumaFracciones2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿Hasta qué número quieres las fracciones?: ");
		int n = entrada.nextInt();
		float resultado = 1;
		
		if(n > 0) {
			for(int i = 1; i <=n; i++)
				if(i % 2 == 0)
					resultado /= Math.pow((n/(float)i), n);
				else {
					resultado *= Math.pow((n/(float)i), n);
		}
	}
		System.out.println("El resultado es: " + resultado);
	}
}