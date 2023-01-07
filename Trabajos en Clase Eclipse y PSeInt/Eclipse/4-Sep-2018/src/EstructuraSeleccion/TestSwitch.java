package EstructuraSeleccion;
import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un número del 0 al 3: ");
		int num = entrada.nextInt();
		if (num < 0 || num > 3)
		{
			System.out.print("Número inválido. Intenta de nuevo");
			System.exit(0);
		}
		switch (num){
		case 0: System.out.print("Cero");
			break;
		case 1: System.out.print("Uno");
			break;
		case 2: System.out.print("Dos");
			break;
		case 3: System.out.print("Tres");
			break;	
		}
	}
}