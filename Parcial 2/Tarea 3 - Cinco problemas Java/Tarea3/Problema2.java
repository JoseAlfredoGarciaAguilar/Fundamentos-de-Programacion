package Tarea3;
import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {
		float velocidad_constante;
		float tiempo;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe la distancia recorrida en metros: ");
		velocidad_constante = entrada.nextFloat();
		System.out.println("Escribe el tiempo tardado en horas: ");
		tiempo = entrada.nextFloat();
		float distancia = velocidad_constante / (tiempo * 3600);
		System.out.println("Distancia recorrida por el vehículo: " + distancia + " metros");
	}
}