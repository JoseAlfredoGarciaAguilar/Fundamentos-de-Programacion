package Arreglos;

public class Ordenado {

	public static void main(String[] args) {
		int a[]={5,7,8,9,-3,0,100};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int aux=a[i];
					a[i]=a[j];
					a[j]=aux;
				}
			}
		}//fin del ordenamiento
		imprimir (a);
	}
	static void imprimir(int arreglo[])
	{
		//for(int i=0;i<arreglo.length;i++)
			//System.out.println(arreglo[i]);	
		for(int x:arreglo)
			System.out.println(x);
	}
}