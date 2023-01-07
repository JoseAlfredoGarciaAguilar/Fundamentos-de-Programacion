package Tarea4;
import java.util.Scanner;

public class Problema11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa una cantidad: ");
		int clave = 20;
		boolean activo = true;
		while(activo)
		{
			int dato;
			dato = entrada.nextInt();
			if(dato!=clave)
				System.out.println(dato);
			else
				break;
		}
	}
}