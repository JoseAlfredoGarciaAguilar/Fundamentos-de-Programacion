package Unidad3;
import java.util.Scanner;

public class Problema13ElCar�cter {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Proporciona un c�digo num�rico de Dos o Tres d�gitos");
		int code = entrada.nextInt() ;
		if (code>=30 && code<=39) 
			System.out.println("El c�digo introducido es un Dato Num�rico");
		else if (code>=65 && code<=90)
			System.out.println("El c�digo introducido es un Dato Alfab�tico, de letras May�sculas");
		else if (code>=97 && code<=122)
			System.out.println("El c�digo introducido es un Dato Alfab�tico, de letras Min�sculas");
		else if (code==44)
			System.out.println("El c�digo introducido es un D�gito de Puntuaci�n");
		else if (code==46)
			System.out.println("El c�digo introducido es un D�gito de Puntuaci�n");
			
		else 
			System.out.println("El c�digo introducido es un Dato no Imprimible");
	}
}