package Unidad3;
import java.util.Scanner;

public class Problema11NúmeroDeDíasDelMes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el número del mes del 1 al 12: ");
		int num_mes = entrada.nextInt();
		String nombre_mes;
		switch(num_mes)
		{
		case 1: nombre_mes = "Enero tiene 31 días";
			break;
		case 2: nombre_mes = "Febrero tiene 28 días, pero en años bisiestos tiene 29 días";
			break;
		case 3: nombre_mes = "Marzo tiene 31 días";
			break;
		case 4: nombre_mes = "Abril tiene 30 días";
			break;
		case 5: nombre_mes = "Mayo tiene 31 días";
			break;
		case 6: nombre_mes = "Junio tiene 30 días";
			break;
		case 7: nombre_mes = "Julio tiene 31 días";
			break;
		case 8: nombre_mes = "Agosto tiene 31 días";
			break;
		case 9: nombre_mes = "Septiembre tiene 30 días";
			break;
		case 10: nombre_mes = "Octubre tiene 31 días";
			break;
		case 11: nombre_mes = "Noviembre tiene 30 días";
			break;
		case 12: nombre_mes = "Diciembre tiene 31 días";
			break;
		default: nombre_mes = "NO VÁLIDO: No existe un mes con ese número";
		}
		System.out.print(nombre_mes);
	}
}