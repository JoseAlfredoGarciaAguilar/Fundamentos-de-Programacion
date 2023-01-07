package EstructuraControl;
import java.util.Scanner;
//PROGRAMA QUE IMPRIME CUÁNTAS CALORÍAS HE CONSUMIDO EN EL DÍA,
//AL INGRESAR LOS ALIMENTOS QUE HE COMIDO EN TODO EL DÍA
public class BucleCalorías {

	public static void main(String[] args) {
		int num_de_elementos, cuenta, calorias_por_alimento, calorias_total;
		System.out.print("¿Cuántos alimentos has comido hoy?: ");
		Scanner entrada = new Scanner(System.in);
		num_de_elementos = entrada.nextInt();
		System.out.println("Escribe el número de calorías de los " + num_de_elementos +
				" alimentos tomados: ");
		calorias_total = 0;
		cuenta = 1;
		while(cuenta++ <= num_de_elementos)
		{
			calorias_por_alimento = entrada.nextInt();
			calorias_total = calorias_total + calorias_por_alimento;
		}
		System.out.print("Hoy has consumido " + calorias_total + " calorías en total");
	}
}