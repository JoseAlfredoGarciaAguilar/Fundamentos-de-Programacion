package EstructuraControl;
public class TablasDeMultiplicarCicloFor {
//PROGRAMA QUE IMPRIME LA TABLA DE MULTIPLICAR DEL 9 HACIA ADELANTE Y HACIA ATRÁS
	public static void main(String[] args) {
		final int num = 9;
		System.out.println("************");
		System.out.println("Tabla de Multiplicación");
		System.out.println("************");
		for(int j = 1; j <=10; j++)
		{
			System.out.print(num + " x " + j + " = " + num * j);
			System.out.println();
		}
		System.out.println();
		for(int j = 10; j > 0; j --)
		{
			System.out.print(num + " x " + j + " = " + num * j);
			System.out.println();
		}
	}
}