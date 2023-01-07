package Arreglos;

public class Multidimensional {
	
	public static void main(String[]args){
		//declaracion de arreglos multidimensionales
		char pantalla[][];
		int puestos[][];
		double matriz[][];
		//Inicializar
		pantalla = new char[80][24];//inicializando 80 renglones y 24 columnas
		puestos = new int[10][5];//50 elementos (10 renglones y 5 columnas)
		final int N = 4;
		matriz = new double[N][N];//matriz cuadrada de N*N Elementos
		//inicialización de arreglos multidimensionales
		int tabla[][] = {{51,52,53}, {54,55,56}};//matriz de orden 2 X 3
		String meses[] = {"enero","febrero","marzo","abril","mayo","junio","julio",
				"agosto","septiembre","octubre","noviembre","diciembre"};//vector de orden 2
		for(int i=0; i<meses.length; i++)
			System.out.print(meses[i] + " ");
		
		int numero[] = new int[5];
		numero[0] = 1;
		numero[1] = 2;
		numero[2] = 3;
		numero[3] = 4;
		numero[4] = 5;
		for(int i=0; i<numero.length; i++)
			System.out.print(numero[i]+ " ");
		
		int numero2[] = {1,2,3,4,5};//declaramos e inicializamos al mismo tiempo
		for(int i=0; i<numero.length; i++)
			System.out.print(numero[i] + " ");
	}
}