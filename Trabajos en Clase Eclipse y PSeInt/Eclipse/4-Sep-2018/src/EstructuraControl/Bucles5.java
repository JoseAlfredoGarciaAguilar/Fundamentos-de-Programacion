package EstructuraControl;
import java.util.Scanner;
//PROGRAMA QUE PIDE UNA CANTIDAD, Y AL INGRESARLA, LA IMPRIME DE NUEVO (LA COPIA)
//EL PROGRAMA SE DETIENE CUANDO SE INGRESA UN -9
public class Bucles5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa una cantidad: ");
		int clave = -9;
		boolean activo = true;
		while(activo)
		{
			int dato;
			dato = entrada.nextInt();
			if(dato!=clave)//!= Significa "Es diferente"
				System.out.println(dato);
			else
				break;
		}
	}
}