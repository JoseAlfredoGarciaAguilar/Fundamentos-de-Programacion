package Unidad1;
import java.util.Scanner;

public class Problema8Automóvil {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el total de Kilómetros recorridos: ");
		double km = entrada.nextDouble();
		System.out.print("Escribe el precio en pesos de la Gasolina por litro: ");
		double pre_gas = entrada.nextDouble();
		System.out.print("Escribe el dinero gastado en Gasolina en el viaje: ");
		double din_gas = entrada.nextDouble();
		System.out.print("Escribe el tiempo tardado en horas en el trayecto: ");
		double tiemp_gas_hr = entrada.nextDouble();
		System.out.print("Escribe el tiempo tardado en minutos en el trayecto: ");
		double tiemp_gas_min = entrada.nextDouble();
		
		double nl = din_gas / pre_gas;
		double litros1km = nl / km * 10;
		double litros100km = (din_gas / km * 100);
		double pre_gas_100km = (din_gas/km) * 100;
		double pre_gas_1km = (din_gas / km) * 10;
		double vmkmh = km / tiemp_gas_hr;
		double vmms = km / tiemp_gas_min;
		
		System.out.println("");
		System.out.println("Litros gastados en 100 km = " + litros100km);
		System.out.println("Dinero gastado en gasolina en 100 km = " + pre_gas_100km);
		System.out.println("Litros gastados en 1 km = " + litros1km);
		System.out.println("Dinero gastado en gasolina en 1 km = " + pre_gas_1km);
		System.out.println("Velocidad en Km/h = " + vmkmh);
		System.out.println("Velocidad en m/s = " + vmms);	
	}
}