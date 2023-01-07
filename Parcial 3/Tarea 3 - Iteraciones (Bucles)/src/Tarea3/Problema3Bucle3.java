package Tarea3;
//PROGRAMA QUE IMPRIME LOS NÚMEROS ENTEROS DEL 11 AL 50, Y LUEGO LA SUMA DE TODOS ELLOS
public class Problema3Bucle3 {

	public static void main(String[] args) {
		for(int a = 11; a <=50; a++)
			System.out.println(a);

		int resultado_suma = 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20
				+ 21 + 22 + 23 + 24 + 25 + 26 + 27 + 28 + 29 + 30 + 31 +
				32 + 33 + 34 + 35 + 36 + 37 + 38 + 39 + 40 + 41 + 42 + 43
				+ 44 + 45 + 46 + 47 + 48 + 49 + 50;
		System.out.print("Suma final de los números impresos en pantalla: " + resultado_suma);
	}
}