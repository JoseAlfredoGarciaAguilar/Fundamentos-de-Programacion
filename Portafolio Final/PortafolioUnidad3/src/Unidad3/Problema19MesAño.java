package Unidad3;
import java.util.Scanner;

public class Problema19MesA�o {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el a�o: ");
		int a�o = entrada.nextInt();
		System.out.print("Escribe el n�mero del mes: ");
		int numero_mes = entrada.nextInt();
		
		if(a�o % 4 == 0)
		{
			switch(numero_mes){
			case 1:
				System.out.println("Enero del a�o " + a�o + " tiene 31 d�as");
					break;
			case 2:
				System.out.println("Febrero del a�o " + a�o + " tiene 29 d�as");
					break;
			case 3:
				System.out.println("Marzo del a�o " + a�o + " tiene 31 d�as");
					break;
			case 4:
				System.out.println("Abril del a�o " + a�o + " tiene 30 d�as");
					break;
			case 5:
				System.out.println("Mayo del a�o " + a�o + " tiene 31 d�as");
					break;
			case 6:
				System.out.println("Junio del a�o " + a�o + " tiene 30 d�as");
					break;
			case 7:
				System.out.println("Julio del a�o " + a�o + " tiene 31 d�as");
					break;
			case 8:
				System.out.println("Agosto del a�o " + a�o + " tiene 31 d�as");
					break;
			case 9:
				System.out.println("Septiembre del a�o " + a�o + " tiene 30 d�as");
					break;
			case 10:
				System.out.println("Octubre del a�o " + a�o + " tiene 31 d�as");
					break;
			case 11:
				System.out.println("Noviembre del a�o " + a�o + " tiene 30 d�as");
					break;
			case 12:
				System.out.println("Diciembre del a�o " + a�o + " tiene 31 d�as");
					break;
					default:
					System.out.println("�ERROR. No existe un mes con este n�mero!");
		}
		}
		else
		{
			switch(numero_mes){
			case 1:
				System.out.println("Enero del a�o " + a�o + " tiene 31 d�as");
					break;
			case 2:
				System.out.println("Febrero del a�o " + a�o + " tiene 28 d�as");
					break;
			case 3:
				System.out.println("Marzo del a�o " + a�o + " tiene 31 d�as");
					break;
			case 4:
				System.out.println("Abril del a�o " + a�o + " tiene 30 d�as");
					break;
			case 5:
				System.out.println("Mayo del a�o " + a�o + " tiene 31 d�as");
					break;
			case 6:
				System.out.println("Junio del a�o " + a�o + " tiene 30 d�as");
					break;
			case 7:
				System.out.println("Julio del a�o " + a�o + " tiene 31 d�as");
					break;
			case 8:
				System.out.println("Agosto del a�o " + a�o + " tiene 31 d�as");
					break;
			case 9:
				System.out.println("Septiembre del a�o " + a�o + " tiene 30 d�as");
					break;
			case 10:
				System.out.println("Octubre del a�o " + a�o + " tiene 31 d�as");
					break;
			case 11:
				System.out.println("Noviembre del a�o " + a�o + " tiene 30 d�as");
					break;
			case 12:
				System.out.println("Diciembre del a�o " + a�o + " tiene 31 d�as");
					break;
					default:
					System.out.println("�ERROR. No existe un mes con este n�mero!");
		}
		}
	}
}