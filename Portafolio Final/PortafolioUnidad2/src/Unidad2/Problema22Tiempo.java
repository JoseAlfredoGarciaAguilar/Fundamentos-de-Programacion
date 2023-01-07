package Unidad2;
import java.util.Scanner;

public class Problema22Tiempo {
	public static void main(String[] args) {
		double velocidad, distancia, tiempo, hr, min, seg, km;
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