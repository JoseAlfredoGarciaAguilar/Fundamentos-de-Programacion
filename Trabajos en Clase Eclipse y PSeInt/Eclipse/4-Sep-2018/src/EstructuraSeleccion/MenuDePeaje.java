package EstructuraSeleccion;
import java.util.Scanner;

public class MenuDePeaje {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("**************");
		System.out.println("MEN� DE PASAJE");
		System.out.println("**************");
		System.out.println("1) Turismo: $800");
		System.out.println("2) Autob�s: $350");
		System.out.println("3) Autom�vil: $100");
		System.out.println("4) Motocicleta: $80");
		System.out.println("     Salir     ");
		System.out.println("�Elige una opci�n escribiendo su n�mero!:");
			int vehiculo = teclado.nextInt();
			switch(vehiculo){
			case 1: System.out.println("Turismo");
				break;
			case 2: System.out.println("Autob�s");
				break;
			case 3: System.out.println("Autom�vil");
				break;
			case 4: System.out.println("Motocicleta");
				break;
			case 5: System.out.println("Salir");
			}
			if (vehiculo == 1)
			{
				System.out.println("Tarifa o Costo: $800");
				System.out.println("�Con cu�nto pagas?");
				int pago = teclado.nextInt();
				int cambio = pago - 800;
				System.out.println("Tu cambio es : $" + cambio);
			}
			if (vehiculo == 2)
			{
				System.out.println("Tarifa o Costo: $350");
				System.out.println("�Con cu�nto pagas?");
				int pago = teclado.nextInt();
				int cambio = pago - 350;
				System.out.println("Tu cambio es : $" + cambio);
			}
			if (vehiculo == 3)
			{
				System.out.println("Tarifa o Costo: $100");
				System.out.println("�Con cu�nto pagas?");
				int pago = teclado.nextInt();
				int cambio = pago - 100;
				System.out.println("Tu cambio es : $" + cambio);
			}
			if (vehiculo == 4)
			{
				System.out.println("Tarifa o Costo: $80");
				System.out.println("�Con cu�nto pagas?");
				int pago = teclado.nextInt();
				int cambio = pago - 80;
				System.out.println("Tu cambio es : $" + cambio);
			}
	}
}