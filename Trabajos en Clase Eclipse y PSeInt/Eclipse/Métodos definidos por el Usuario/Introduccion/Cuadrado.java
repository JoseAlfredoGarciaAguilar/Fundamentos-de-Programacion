package Introduccion;

public class Cuadrado{
	public static void main(String []ar){
		int a = 20;
		double are = area(a);
		System.out.println("Area = "+are);
		int p = perimetro(5);
		System.out.println("Perimetro = "+p);
		area2(5);
	}	
		public static double area(int lado){
			double a;
			a= lado * lado;
			return a;
		}
		public static int perimetro(int l){
			int p;
			p = l+l+l+l;
			return p;
	}
		public static void area2(int lado) {
			double a;
			a = lado * lado;
			System.out.println("Area = "+a);
		}
}