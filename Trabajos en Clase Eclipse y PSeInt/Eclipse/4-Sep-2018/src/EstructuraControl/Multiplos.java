package EstructuraControl;
//PROGRAMA QUE GENERA NÚMEROS ALEATORIOS O AL AZAR ENTRE 3 Y 999
public class Multiplos {

	public static void main(String[] args) {
		final int CLAVE = 3;
		final int RANGO = 999;
		int n = (int)(Math.random()*RANGO)+1;
		for(int i = 0; i<n; i++)
		{
			int numero;
			numero = (int)(Math.random()*RANGO)+1;
			if(numero % CLAVE == 0)
			{
				System.out.println();
				continue;
			}
			System.out.print(" " + numero);
		}
	}
}