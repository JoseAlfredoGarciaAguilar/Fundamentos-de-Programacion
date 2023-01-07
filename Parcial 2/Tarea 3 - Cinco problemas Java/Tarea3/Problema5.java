package Tarea3;
import java.util.Scanner;
public class Problema5 {
	public static void main(String[] args) {
		double velocidad;
		double distancia;
		double tiempo;
		double hr;
		double min;
		double seg;
		double km;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe la velocidad en m/s (metros por segundo): ");
		velocidad = entrada.nextDouble();
		System.out.print("Escribe la distancia recorrida en metros: ");
		distancia = entrada.nextDouble();
		
		tiempo = (distancia / velocidad) * 10 ;
		km = distancia * 1000;
		seg = distancia / velocidad;
		min = seg / 60.0;
		hr = seg / 3600;
		
		System.out.println("Tiempo en horas: " + hr);
		System.out.println("Tiempo en minutos: " + min);
		System.out.println("Tiempo en segundos: " + seg);
	}
}