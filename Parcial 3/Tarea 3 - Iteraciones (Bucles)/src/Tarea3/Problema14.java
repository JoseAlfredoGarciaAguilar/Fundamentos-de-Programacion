package Tarea3;

public class Problema14 {

	public static void main(String[] args) {
		int i=0;
		while (i*1<100)
		{
		int j=1;
		while (j*j <100)
		{
		System.out.println(i+j);
		j*=2;
		}
		i++;
		}
		System.out.println("\n*****");
	}
}