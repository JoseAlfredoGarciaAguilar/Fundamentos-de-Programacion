package Unidad1;
import java.util.Scanner;

public class Problema3CompraConDescuento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el Precio Real del Producto: ");
		double precio_real = entrada.nextDouble();
		System.out.print("Escribe el Porcentaje de Descuento: ");
		double porcentaje_descuento = entrada.nextDouble();
		
		double descuento = precio_real*(porcentaje_descuento*0.01);
		double precio_final = precio_real - descuento;
		System.out.print("Precio Final del Producto = " + precio_final);
	}
}