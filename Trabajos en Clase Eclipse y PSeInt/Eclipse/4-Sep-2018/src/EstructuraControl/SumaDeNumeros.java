package EstructuraControl;
import java.util.Scanner;
//PROGRAMA QUE LEE NÚMEROS DIFERENTES DE 999, Y LOS MULTIPLICA. CUANDO SE ESCRIBE 999, EL PROGRAMA SE DETIENE
public class SumaDeNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero;
		double producto = 1;
		do{
			System.out.println("Dame número (999) para terminar: ");
			numero = entrada.nextDouble();
			if(numero != 999)
			producto = producto * numero;
		}while(numero != 999);
		//fin del bucle
		System.out.print("Producto = " + producto);
	}
}