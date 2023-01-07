package EstructuraControl;

public class Triangulo {

	public static void main(String[] args) {
		final int NUMLINEAS = 5;
		final char BLANCO = ' ';
		final char ASTERISCO = '*';
		System.out.println(" ");
		//bucle externo
		for(int fila=1; fila<=NUMLINEAS; fila++)
		{
			System.out.print("\t");
			//primer bucle interno: escribe espacios
			for(int blancos = NUMLINEAS-fila; blancos>0; blancos--)
			{
				System.out.print(BLANCO);
			}
			for(int cuenta_asteriscos=1; cuenta_asteriscos<2*fila; cuenta_asteriscos++)
			{
				System.out.print(ASTERISCO);
			}
			System.out.println();
		}//fin del bucle externo
	}
}