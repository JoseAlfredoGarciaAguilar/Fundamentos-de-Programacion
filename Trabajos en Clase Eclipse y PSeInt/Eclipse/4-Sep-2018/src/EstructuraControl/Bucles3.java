package EstructuraControl;
import java.util.Scanner;
//Bucles controlados por Centinela
//PROGRAMA QUE PIDE CALIFICACIONES, Y DEJA DE PEDIRLAS HASTA QUE
//UNA DE ESAS CALIFICACIONES ES -1. LUEGO DE ESTO, CALCULA EL PROMEDIO DE
//TODAS ESAS CALIFICACIONES
public class Bucles3 {
	
	public static void main(String[]args){
	//Bucles controlados por centinela
	/*entrada de datos numéricos
	 * centinela -1
	 */
	Scanner entrada = new Scanner(System.in);
	final int centinela= -1;
	System.out.print("Introduzca la primera nota: ");
	int nota = entrada.nextInt();
	int cuenta = 0;
	int suma = 0;
	while(nota != centinela)
	{
		cuenta++;
		suma += nota; //++ Es un operador de post-incremento
		System.out.print("Introduzca siguiente nota: ");
		nota = entrada.nextInt();
	}
	System.out.println("Final");
	System.out.println("Promedio = " + suma/cuenta);
}
}