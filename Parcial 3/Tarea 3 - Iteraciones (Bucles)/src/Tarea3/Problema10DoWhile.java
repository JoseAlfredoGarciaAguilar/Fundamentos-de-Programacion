package Tarea3;
//PROGRAMA QUE IMPRIME LOS NÚMEROS DE 10 EN 10 HASTA EL 100 CON DO WHILE
public class Problema10DoWhile {
	
	public static void main(String[] args) {
		int numero = 10;
		do {
			System.out.println(numero);
			numero+=10;
		}while(numero <= 100);
	}
}