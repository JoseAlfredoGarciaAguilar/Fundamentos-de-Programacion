package Tarea1;

public class Problema2 {

	public static void main(String[] args) {
		int velocidad=120;
		float consumo=0;

		if (velocidad > 80){
		consumo=10.00f;
		System.out.println(consumo);
		}

		else if (velocidad>100) {
		consumo=12.00f;
		System.out.println(consumo);
		}
		
		else if (velocidad>120) {
		consumo=15.00f;
		System.out.println(consumo);
		}
		
		else if (velocidad == 120) {
		consumo=17.00f;
		System.out.println(consumo);
		}
	}
}