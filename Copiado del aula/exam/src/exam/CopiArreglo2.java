package exam;

public class CopiArreglo2 {

	public static void main(String[] args) {
		int a[] = new int [5];
		int b[] = new int [5];
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		for (int e:a)
			System.out.println(e+" ");
		b = a;
		for(int i=0;i<5;i++)
			b[i]=a[i];
		for(int e:b)
			System.out.println(e+" ");
		System.out.println("vector a ");
		for (int e:a)
			System.out.println(e+" ");
		System.arraycopy(a, 0, b, 0, 5);


	}

}
