package EstructuraSeleccion;
import java.util.Scanner;

//PROGRAMA QUE AL INSERTAR UNA LETRA, ME IMPRIMA SI ES O NO ES UNA VOCAL

public class TestSwitch3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe una letra: ");
		char letra = teclado.next().charAt(0);
		switch(letra)
		{
		case 'a': case 'A':
		case 'e': case 'E':
		case 'i': case 'I':
		case 'o': case 'O':
		case 'u': case 'U':
			System.out.print(letra + " es una vocal");
			break;
		default:
			System.out.print(letra + " no es una vocal");
		}
		
	}
}