package EstructuraSeleccion;
import java.util.Scanner;

public class Nota {

			public static void main(String[] args) {
				//Variable de entrada
				Scanner entrada = new Scanner(System.in);
				System.out.print("Escribe la calificaci�n: ");
				float calif = entrada.nextFloat();
				if (calif >= 70)
				{
					System.out.print("Aprobado");
				}
				else
					System.out.print("Reprobado");
				}

		}
