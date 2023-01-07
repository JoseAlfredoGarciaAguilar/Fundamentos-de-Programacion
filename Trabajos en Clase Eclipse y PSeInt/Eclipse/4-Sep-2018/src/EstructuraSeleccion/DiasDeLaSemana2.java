package EstructuraSeleccion;
import java.util.Scanner;

public class DiasDeLaSemana2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe el número del día de la semana: ");
		byte numero_de_dia = entrada.nextByte();
		if (numero_de_dia == 1)
			System.out.print("Lunes");
		else if (numero_de_dia == 2)
			System.out.print("Martes");
		else if (numero_de_dia == 3)
			System.out.print("Miércoles");
		else if (numero_de_dia == 4)
			System.out.print("Jueves");
		else if (numero_de_dia == 5)
			System.out.print("Viernes");
		else if (numero_de_dia == 6)
			System.out.print("Sábado");
		else if (numero_de_dia == 7)
			System.out.print("Domingo");
		else
			System.out.print("INVÁLIDO: No existe un día de la semana con ese número");
	}
}