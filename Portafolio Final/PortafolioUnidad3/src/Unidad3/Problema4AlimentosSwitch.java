package Unidad3;
import java.util.Scanner;

public class Problema4AlimentosSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe un n�mero del 1 al 4: ");
		int primera_opcion = entrada.nextInt();
		switch (primera_opcion+1){
		case 1: System.out.println("Cordero asado");
			break;
		case 2: System.out.println("Chuleta lechal");
			break;
		case 3: System.out.println("Chulet�n");
			break;
		case 4: System.out.println("Postre de pastel");
			break;
		default:
			System.out.println("Buen apetito");
		}
	}
}