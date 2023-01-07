package exam;

public class suma {

	public static void main(String[] args) {
		System.out.println(obtenerSumaProducto());
	}
	
	public static int obtenerSumaProducto () {
		int suma = 0;
		double producto = 1;
		int i;
		for(i = 20; i <= 100; i+=2) {
			suma = suma + i;
			producto = producto*i;
			System.out.println("valor de i" + i);
			System.out.println("Producto = " + producto);
		}
		return suma;
	}

}
