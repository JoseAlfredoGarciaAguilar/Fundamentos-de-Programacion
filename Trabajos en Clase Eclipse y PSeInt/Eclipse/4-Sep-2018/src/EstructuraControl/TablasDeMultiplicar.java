package EstructuraControl;
//PROGRAMA QUE IMPRIME LAS TABLAS DE MULTIPLICAR DEL 1 AL 10
public class TablasDeMultiplicar {

	public static void main(String[] args) {
		final int TABLA = 9;
		for(int j = 1; j <= 10 ; j++)
		{
		
		for(int i = 1; i <= 10; i++)
		{
			System.out.print(j + " x " + i + " = " + j*i + "\n");
		}
		System.out.println();
	}
}
}