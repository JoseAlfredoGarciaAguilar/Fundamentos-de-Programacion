package EstructuraControl;
import java.util.Scanner;
//PROGRAMA QUE SUMA UNA DETERMINADA CANTIDAD DE NÚMEROS
public class ComparacionBucles {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Bucle while
		int control = 1; //Valor inicial
		double suma = 0.0;
		System.out.println("Dame la cantidad de números que quieres leer: ");
		int total = entrada.nextInt();
		while(control <= total)
		{
			System.out.println("Dame número (" + control + "): ");
			double numero = entrada.nextDouble();
			suma+=numero;
			control++;
		} //Fin del bucle
		System.out.println("Total Suma = " + suma);
		
		//estos dos trozos de código son lo mismo, son sinónimos, por lo tanto hacen exactamente lo mismo
		double suma2 = 0;
		System.out.println("Dame la cantidad de números que quieres leer: ");
		int n = entrada.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Dame número (" + i + "): ");
			double numero = entrada.nextDouble();
			suma2+=numero;
		}
		System.out.println("Total Suma = " + suma2);
		
		//este programa también hace lo mismo que los dos anteriores
		int contador = 0;
		double numero;
		do{
			System.out.println("Dame número: ");
			numero = entrada.nextDouble();
			if(numero !=-1)
			contador++;
		}while(numero !=-1);
		//Finalizo el bucle
		System.out.println("Total de números leídos: " + contador);
	}
}