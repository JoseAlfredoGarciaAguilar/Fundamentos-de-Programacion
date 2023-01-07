package Unidad1;
import java.util.Scanner;

public class Problema9Alimentos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el número de Comensales para la paella: ");
		int comensales = entrada.nextInt();
		System.out.print("Escribe el precio por kilo del arroz: ");
		double precio_kg_arroz = entrada.nextInt();
		System.out.print("Escribe el precio por kilo del camarón: ");
		double precio_kg_camaron = entrada.nextInt();
		
		double cantidad_arroz = (comensales*0.5) / 4;
		double cantidad_camaron = (comensales*0.25) / 4;
		double costo_arroz = cantidad_arroz * precio_kg_arroz;
		double costo_camaron = cantidad_camaron * precio_kg_camaron;
		double costo_total = costo_arroz + costo_camaron;
		
		System.out.println("Kg necesarios de Arroz = " + cantidad_arroz);
		System.out.println("Kg necesarios de Camarón = " + cantidad_camaron);
		System.out.println("Costo Total = $" + costo_total);
	}
}