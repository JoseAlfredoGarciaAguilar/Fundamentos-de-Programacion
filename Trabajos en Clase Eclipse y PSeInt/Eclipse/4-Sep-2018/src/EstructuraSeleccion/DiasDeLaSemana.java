package EstructuraSeleccion;
import java.util.Scanner;

public class DiasDeLaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el n�mero del d�a de la semana: ");
		byte numero_de_dia = entrada.nextByte();
		if (numero_de_dia == 1)
			System.out.print("Lunes");
		if (numero_de_dia == 2)
			System.out.print("Martes");
		if (numero_de_dia == 3)
			System.out.print("Mi�rcoles");
		if (numero_de_dia == 4)
			System.out.print("Jueves");
		if (numero_de_dia == 5)
			System.out.print("Viernes");
		if (numero_de_dia == 6)
			System.out.print("S�bado");
		if (numero_de_dia == 7)
			System.out.print("Domingo");
		if (numero_de_dia < 1)
			System.out.println("ERROR. No existe un d�a con ese n�mero");
		if (numero_de_dia > 7)
			System.out.println("ERROR. No existe un d�a con ese n�mero");
	}
}