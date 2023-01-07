package exam;

public class CopiArreglo {

	public static void main(String[] args) {
		final int N = 15;
		final int M = 20;
		double [] V = new double[N];
		double [] W = new double[M];
		double x = 1.0;
		for (int i = 0; i<N; x+=0.2,i++)//x = x + 0.2
			V[i]= Math.exp(2*x-1);
		//recorrer el arreglo V
		for (double elemento:V)
			System.out.println(elemento);
		for (int i=0;i<M;i++)
			W[i]=(double)i;
		//se imprime los elementos del vector V
		System.out.println("\n Valores del vector V");
		for (int i=0;i<N;i++)
			System.out.print(V[i]+" ");
		//se realiza la copia de V a W
		System.arraycopy(V,(N-1)-10+1,W,10,10);
		
		//SE IMPRIMEN LOS ELEMENTOS DEL VECTOR W
		System.out.println("\n Valores del vector W");
		for (double ele:W)
			System.out.print(ele+" ");
		
	}

}
