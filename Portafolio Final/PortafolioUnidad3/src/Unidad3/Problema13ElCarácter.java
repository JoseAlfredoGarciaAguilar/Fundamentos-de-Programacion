package Unidad3;
import java.util.Scanner;

public class Problema13ElCarácter {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Proporciona un código numérico de Dos o Tres dígitos");
		int code = entrada.nextInt() ;
		if (code>=30 && code<=39) 
			System.out.println("El código introducido es un Dato Numérico");
		else if (code>=65 && code<=90)
			System.out.println("El código introducido es un Dato Alfabético, de letras Mayúsculas");
		else if (code>=97 && code<=122)
			System.out.println("El código introducido es un Dato Alfabético, de letras Minúsculas");
		else if (code==44)
			System.out.println("El código introducido es un Dígito de Puntuación");
		else if (code==46)
			System.out.println("El código introducido es un Dógito de Puntuación");
			
		else 
			System.out.println("El código introducido es un Dato no Imprimible");
	}
}