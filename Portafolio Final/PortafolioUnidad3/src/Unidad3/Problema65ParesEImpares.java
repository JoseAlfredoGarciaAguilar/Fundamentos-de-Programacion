package Unidad3;

public class Problema65ParesEImpares {

	public static void main(String[] args) {
		int i, j, n, aux, pares, impares, pantalla = 0;
		System.out.print("Tienen igual suma de pares e impares:\n\n");
		for(i=1000; i<10000; i++)
		{
			pares = 0;
			impares = 0;
			n = i;
			for(j=0; n>0; j++)
			{
				aux = n%10;
				if(aux%2==0)
					pares = pares + aux;
				else
					impares = impares + aux;
					n = n / 10;
			}
			if(pares==impares)
			{
				System.out.printf(" %d ", i);
				pantalla++;
			}
			if(pantalla==11)
			{
				System.out.print("\n");
				pantalla = 0;
			}
		}
	}
}