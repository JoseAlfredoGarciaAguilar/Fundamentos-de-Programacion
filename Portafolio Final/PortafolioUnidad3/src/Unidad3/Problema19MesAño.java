package Unidad3;
import java.util.Scanner;

public class Problema19MesAño {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el año: ");
		int año = entrada.nextInt();
		System.out.print("Escribe el número del mes: ");
		int numero_mes = entrada.nextInt();
		
		if(año % 4 == 0)
		{
			switch(numero_mes){
			case 1:
				System.out.println("Enero del año " + año + " tiene 31 días");
					break;
			case 2:
				System.out.println("Febrero del año " + año + " tiene 29 días");
					break;
			case 3:
				System.out.println("Marzo del año " + año + " tiene 31 días");
					break;
			case 4:
				System.out.println("Abril del año " + año + " tiene 30 días");
					break;
			case 5:
				System.out.println("Mayo del año " + año + " tiene 31 días");
					break;
			case 6:
				System.out.println("Junio del año " + año + " tiene 30 días");
					break;
			case 7:
				System.out.println("Julio del año " + año + " tiene 31 días");
					break;
			case 8:
				System.out.println("Agosto del año " + año + " tiene 31 días");
					break;
			case 9:
				System.out.println("Septiembre del año " + año + " tiene 30 días");
					break;
			case 10:
				System.out.println("Octubre del año " + año + " tiene 31 días");
					break;
			case 11:
				System.out.println("Noviembre del año " + año + " tiene 30 días");
					break;
			case 12:
				System.out.println("Diciembre del año " + año + " tiene 31 días");
					break;
					default:
					System.out.println("¡ERROR. No existe un mes con este número!");
		}
		}
		else
		{
			switch(numero_mes){
			case 1:
				System.out.println("Enero del año " + año + " tiene 31 días");
					break;
			case 2:
				System.out.println("Febrero del año " + año + " tiene 28 días");
					break;
			case 3:
				System.out.println("Marzo del año " + año + " tiene 31 días");
					break;
			case 4:
				System.out.println("Abril del año " + año + " tiene 30 días");
					break;
			case 5:
				System.out.println("Mayo del año " + año + " tiene 31 días");
					break;
			case 6:
				System.out.println("Junio del año " + año + " tiene 30 días");
					break;
			case 7:
				System.out.println("Julio del año " + año + " tiene 31 días");
					break;
			case 8:
				System.out.println("Agosto del año " + año + " tiene 31 días");
					break;
			case 9:
				System.out.println("Septiembre del año " + año + " tiene 30 días");
					break;
			case 10:
				System.out.println("Octubre del año " + año + " tiene 31 días");
					break;
			case 11:
				System.out.println("Noviembre del año " + año + " tiene 30 días");
					break;
			case 12:
				System.out.println("Diciembre del año " + año + " tiene 31 días");
					break;
					default:
					System.out.println("¡ERROR. No existe un mes con este número!");
		}
		}
	}
}