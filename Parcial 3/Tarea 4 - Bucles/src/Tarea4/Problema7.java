package Tarea4;
import java.util.Scanner;
//PROGRAMA QUE AL INSERTAR UN N�MERO, LO ELEVA EN FORMA DE POTENCIA CON LOS N�MEROS DEL 1 AL 100
public class Problema7 {
	
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		System.out.print("�A qu� potencia quieres elevar los 100 n�meros?: ");
		int potencia = entrada.nextInt();
		
		for(int base=1;base<=100;base++)
		{
			int resultado = (int)Math.pow(base, potencia);
			System.out.println(base + " elevado a " + potencia + " = " + resultado);
		}	
	}
}