package Unidad3;
import java.util.Scanner;

public class Problema61SumaFracciones {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.print("?Hasta qu? n?mero quieres las fracciones?: ");
		int n = entrada.nextInt();
		float resultado = 1;
		
		if(n > 0) {
			for(int i = 1; i <=n; i++)
				if(i % 2 == 0)
					resultado /= (1/(float)i);
				else {
					resultado *= (1/(float)i);
		}
	}
		System.out.println("El resultado es: " + resultado);
	}
}