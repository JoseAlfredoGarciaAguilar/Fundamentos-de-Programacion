package Portafolio;
import java.util.Scanner;

public class Menú {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplica");
		System.out.println("0) Salir");
		int opc = entrada.nextInt();
		switch (opc){
		case 1: System.out.println("Seleccionaste Suma");
			break;
		case 2: System.out.println("Seleccionaste Resta");
			break;
		case 3: System.out.println("Seleccionaste Multiplica");
			break;
			default:
				System.out.println("Seleccionaste Salir");
		}
	}
}