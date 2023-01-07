package EstructuraSeleccion;

public class Numero3 {

	public static void main(String[] args) {
		int rango1 = 0; //Cuenta mayores de 50
		int rango2 = 0; //Cuenta números entre 10 y 50
		int rango3 = 0; //Cuenta números menores que 10
		for (int i = 0; i < 100; i++){
			int num = (int)(Math.random()*99);
			System.out.println("Número generado: " + num);
			if (num > 50)
				rango1 = rango1 + 1;
			else if (num > 10)
				rango2 = rango2 + 1;
			else
				rango3 = rango3 + 1;
	}
		System.out.println("Mayores que 50: " + rango1);
		System.out.println("Menores de 50 pero mayores que 10: " + rango2);
		System.out.println("Menores que 10: " + rango3);
}
}