package Unidad3;

public class Problema45AsteriscosEnLinea2{

	public static void main(String[] args) {
		int m=3;
		int n=5;
		for(int i=n;i>0;i--){
		for (int j=m;j>0;j--)
		System.out.print("*");
		System.out.println();
		}
	}
}