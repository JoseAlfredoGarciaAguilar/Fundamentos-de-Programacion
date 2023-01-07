package EstructuraControl;
import java.util.Scanner;
//PROGRAMA QUE SUMA UNA DETERMINADA CANTIDAD DE N�MEROS
public class ComparacionBucles {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Bucle while
		int control = 1; //Valor inicial
		double suma = 0.0;
		System.out.println("Dame la cantidad de n�meros que quieres leer: ");
		int total = entrada.nextInt();
		while(control <= total)
		{
			System.out.println("Dame n�mero (" + control + "): ");
			double numero = entrada.nextDouble();
			suma+=numero;
			control++;
		} //Fin del bucle
		System.out.println("Total Suma = " + suma);
		
		//estos dos trozos de c�digo son lo mismo, son sin�nimos, por lo tanto hacen exactamente lo mismo
		double suma2 = 0;
		System.out.println("Dame la cantidad de n�meros que quieres leer: ");
		int n = entrada.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Dame n�mero (" + i + "): ");
			double numero = entrada.nextDouble();
			suma2+=numero;
		}
		System.out.println("Total Suma = " + suma2);
		
		//este programa tambi�n hace lo mismo que los dos anteriores
		int contador = 0;
		double numero;
		do{
			System.out.println("Dame n�mero: ");
			numero = entrada.nextDouble();
			if(numero !=-1)
			contador++;
		}while(numero !=-1);
		//Finalizo el bucle
		System.out.println("Total de n�meros le�dos: " + contador);
	}
}