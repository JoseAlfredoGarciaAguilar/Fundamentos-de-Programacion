package EstructuraSeleccion;
import java.util.Scanner;

//PROGRAMA QUE IMPRIME SI UN NÚMERO ES MENOR, IGUAL O MAYOR QUE 3, AL INGRESAR UN NÚMERO

public class TestSwitch2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingresa un número: ");
		byte numero = entrada.nextByte();
		switch(numero)
		{
		case 0:
		case 1:
		case 2:
			System.out.print("Es menor que 3");
			break;
		case 3:
			System.out.print("Es igual que 3");
			break;
		default:
			System.out.print("Es mayor que 3");
		}
	}
}