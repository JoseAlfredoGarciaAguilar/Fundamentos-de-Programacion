package Arreglos;
import java.util.Scanner;
/*
 * Se lee una lista con un m�ximo de 21 n�meros enteros, a continuaci�n se calcula su suma y el valor m�ximo, la entrada
 * de datos termina al introducir la clave -1
 */
public class SumaMax {

	public static void main(String[] args) {
		final int NUM=21;
		int items[]=new int[NUM];
		int n;
		n=entrada(items);//devuelve el n�mero de elementos
		System.out.println("\nSuma de los elementos: " + sumaEnteros(items,n));
		System.out.println("\nValor m�ximo: " + maximo(items,n));

	}
	static int entrada(int w[]) {
		int k=0, x;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un m�ximo de " + w.length + " datos, terminar con -1");
		
		do {
			x=teclado.nextInt();
			if(x!=-1)
				w[k++]=x;
		}while((k<w.length) && (x!=-1));
		return k;
	}
	static int sumaEnteros(int w[],int n) {
		int i, total=0;
		for(i=0; i<n;i++) {
			total += w[i]; // total = total + w[i]
		}
		return total;
	}
	static int maximo(int w[], int n) {
		int mx, i;
		mx= w[0];
		for(i=1; i<n; i++) {
			//if(w[i]>mx)
				//mx=w[i];
			mx=(w[i]>mx ? w[i]:mx);//operador ternario
		}
		return mx;
	}
}