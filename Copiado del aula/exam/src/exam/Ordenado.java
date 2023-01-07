package exam;

public class Ordenado {

	public static void main(String[] args) {
		int a[]={5,3,4,7,1,10};
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					int aux = a[i];
					a[i]=a[j];
					a[j]=aux;
				}
			}
		}//Termina la comparacion 
		imprimir(a);
		
	}
	static void imprimir(int o[])
	{
		/*for (int i =0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}
		*/for (int elemento:o)
			System.out.println(elemento);
	}

}
