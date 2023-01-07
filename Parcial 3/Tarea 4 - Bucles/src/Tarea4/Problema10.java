package Tarea4;
import java.util.Scanner;
//PROGRAMA QUE SUMA LAS FRACCIONES (1/2^1) + (2/2^2) + (3/2^3) + (4/2^4)... HASTA EL 100
public class Problema10 {

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