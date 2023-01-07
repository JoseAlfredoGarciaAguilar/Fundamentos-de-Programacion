package Unidad1;
import java.util.Scanner;

public class Problema2TemperaturaEnFahtenheit {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe la Temperatura en Grados Centígrados: ");
		double TemperaturaCentigrados = entrada.nextDouble();
		
		double TemperaturaFahrenheit = (TemperaturaCentigrados*9/5)+32;
		System.out.print("Temperatura en Grados Fahrenheit = " + TemperaturaFahrenheit);
	}
}