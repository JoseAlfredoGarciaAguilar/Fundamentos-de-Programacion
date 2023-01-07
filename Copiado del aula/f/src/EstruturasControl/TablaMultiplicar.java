package EstruturasControl;

public class TablaMultiplicar {

	public static void main(String[] args) {
		for (int i=1;i<=10;i++)//i=1,(este es para realizar el numero principal para iniciar.
		{
			System.out.println("Tabla de multiplicar del "+i);
			for (int j=1; j<=10;j++)
			{
				System.out.print(i+" x "+j +"= "+i*j+"\n");
				
			}
			System.out.println();
		}

	}

}
