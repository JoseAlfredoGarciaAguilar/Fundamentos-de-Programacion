package EstructuraSeleccion;
import java.util.Scanner;

public class DiasDeLaSemana2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el n�mero del d�a de la semana: ");
		byte numero_de_dia = entrada.nextByte();
		if (numero_de_dia == 1)
			System.out.print("Lunes");
		else if (numero_de_dia == 2)
			System.out.print("Martes");
		else if (numero_de_dia == 3)
			System.out.print("Mi�rcoles");
		else if (numero_de_dia == 4)
			System.out.print("Jueves");
		else if (numero_de_dia == 5)
			System.out.print("Viernes");
		else if (numero_de_dia == 6)
			System.out.print("S�bado");
		else if (numero_de_dia == 7)
			System.out.print("Domingo");
		else
			System.out.print("INV�LIDO: No existe un d�a de la semana con ese n�mero");
	}
}