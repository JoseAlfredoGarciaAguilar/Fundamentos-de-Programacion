package EstruturasControl;

public class SentenciaContinue {

	public static void main(String[] args) {
		final int CLAVE= 3;
		final int RANGO= 999;
		int n = (int)(Math.random()*RANGO)+1;
		System.out.println("NUMERO A GENERAR: "+n);
		for (int i=0;i<n;i++)
		{
			int numero;
			numero = (int)(Math.random()*RANGO)+1;
			if (numero % CLAVE == 0)
			{
				System.out.println();
				continue;//Continuacion del siguiente bucle,se puede utilizar en for
				//while o int.
			}
			System.out.print(" "+numero);
		}

	}

}
