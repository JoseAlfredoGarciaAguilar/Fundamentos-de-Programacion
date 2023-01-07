package EstructuraSeleccion;
import java.util.Scanner;

public class DiasDeLaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el número del día de la semana: ");
		byte numero_de_dia = entrada.nextByte();
		if (numero_de_dia == 1)
			System.out.print("Lunes");
		if (numero_de_dia == 2)
			System.out.print("Martes");
		if (numero_de_dia == 3)
			System.out.print("Miércoles");
		if (numero_de_dia == 4)
			System.out.print("Jueves");
		if (numero_de_dia == 5)
			System.out.print("Viernes");
		if (numero_de_dia == 6)
			System.out.print("Sábado");
		if (numero_de_dia == 7)
			System.out.print("Domingo");
		if (numero_de_dia < 1)
			System.out.println("ERROR. No existe un día con ese número");
		if (numero_de_dia > 7)
			System.out.println("ERROR. No existe un día con ese número");
	}
}