package Unidad3;

public class Problema33Suma50Fracciones {

	public static void main(String[] args) {
		double sumafinal, contador=0, r, n;
		for(n = 11; n<=50; n++)
			contador = contador + n;
		
		for(double i=11/n; i<=50; i++)
		{
			r=i;
			contador = r+contador;
		}
		{
			sumafinal = contador;
			System.out.println("La suma final es: " + sumafinal);
		}
	}
}
