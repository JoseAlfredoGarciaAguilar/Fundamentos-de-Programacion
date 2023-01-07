package introduccion;
import java.util.Scanner;

public class CalculoDeTiempo {

	public static void main(String[] args) {
		// Variable de salida
		float tiempo;
		//Variable de entrada
		float distancia, velocidad;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Proporciona Velocidad del recorrido en horas: ");
		velocidad = teclado.nextFloat();
		System.out.print("Proporciona Distancia Km: ");
		distancia = teclado.nextFloat();
		tiempo = distancia/velocidad;
		System.out.print("Parte recorrer, "+distancia +" Kms "+ " a una velocidad de "
		                  +velocidad+"KM/Hora"+" \nusted requiere de "+tiempo +" horas");
	}
}