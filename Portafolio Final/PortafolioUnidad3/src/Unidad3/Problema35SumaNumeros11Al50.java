package Unidad3;

public class Problema35SumaNumeros11Al50 {

	public static void main(String[] args) {
		double sumafinal, contador=0, r;
		for(double i=11; i<=50; i++)
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