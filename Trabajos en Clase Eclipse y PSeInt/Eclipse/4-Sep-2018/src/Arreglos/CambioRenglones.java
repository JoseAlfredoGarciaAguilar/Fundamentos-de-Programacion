package Arreglos;

public class CambioRenglones {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6}};
		int b[][]=new int[3][2];
		int renglon, columna;
		for(renglon=0; renglon<a.length; renglon++) {
			for(columna=0; columna<a[renglon].length; columna++) {
				b[columna][renglon]=a[renglon][columna];
				
			}
		}
		for(renglon=0; renglon<b.length; renglon++) {
			for(columna=0; columna<b[renglon].length; columna++) {
				System.out.print(b[renglon][columna] + "  ");
			}
			System.out.println();
		}
	}
}