package EstructuraControl;
import java.util.Scanner;
//PROGRAMA QUE CALCULA EL PROMEDIO DE DETERMINADA CANTIDAD DE N�MEROS
public class PromedioConContador {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("�Cu�ntas calificaciones quieres leer?: ");
		int numero_de_calificaciones = entrada.nextInt();
		int contador = 1;
		double suma = 0;
		double c = 0;
		while(contador <= numero_de_calificaciones)
		{
			System.out.print("Ingresa la Calificaci�n " + contador + ": ");
			c = entrada.nextDouble();
			contador = contador + 1;
			suma = suma + c;
		}
			System.out.println("Sal� del bucle");
			double promedio = suma / numero_de_calificaciones;
			System.out.println("Promedio = " + promedio);
	}
}