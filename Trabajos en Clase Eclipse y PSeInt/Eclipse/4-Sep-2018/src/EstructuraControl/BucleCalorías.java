package EstructuraControl;
import java.util.Scanner;
//PROGRAMA QUE IMPRIME CU�NTAS CALOR�AS HE CONSUMIDO EN EL D�A,
//AL INGRESAR LOS ALIMENTOS QUE HE COMIDO EN TODO EL D�A
public class BucleCalor�as {

	public static void main(String[] args) {
		int num_de_elementos, cuenta, calorias_por_alimento, calorias_total;
		System.out.print("�Cu�ntos alimentos has comido hoy?: ");
		Scanner entrada = new Scanner(System.in);
		num_de_elementos = entrada.nextInt();
		System.out.println("Escribe el n�mero de calor�as de los " + num_de_elementos +
				" alimentos tomados: ");
		calorias_total = 0;
		cuenta = 1;
		while(cuenta++ <= num_de_elementos)
		{
			calorias_por_alimento = entrada.nextInt();
			calorias_total = calorias_total + calorias_por_alimento;
		}
		System.out.print("Hoy has consumido " + calorias_total + " calor�as en total");
	}
}