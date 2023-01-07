package Tarea4;
import java.util.Scanner;
//PROGRAMA QUE SUMA TODAS LAS FRACCIONES DE UNA DETERMINADA CANTIDAD INSERTADA
public class Problema9 {

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.print("¿Hasta qué número quieres las fracciones?: ");
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