package Introduccion;

public class TipoVariable {

	public static void main(String[] args) {
		int variable1;
		variable1 = 0;
		int variable2;
		variable2 = 0;
		int suma;
		suma = variable1 + variable2;
		int v1,v2,v3,v4;
		int z1 = 0;
		int z2 = 0, z3 = 1, z4 = 2
		int valor1, valor2; int num_parte = 1141, num_items = 45;
		long var1 = 5;
		char c = ' ';
		byte edad = 127;
		short num_alumnos = 32767;
		//Conversión explícita
		short x;
		int a1 = 19, b1 = 5;
		x = (short)(a1 + b1);
		
		
		//Conversión implícita
		int y;
		short a2 = 19, b2 = 5;
		y = (int)(a2 + b2);
		
		long medidaMilimetros;
		long distanciaMedia;
		long numerosGrandes = (long)(40000.5877);
		long numerosGrandes2 = 40000L;
		System.out.println(numerosGrandes);
		System.out.println(numerosGrandes2);
		
		float valor;
		float valor3, valor4;
		float valor5 = 99.9F;
		System.out.println(valor5);
		double valor6 = 8.5e10;
		System.out.println(valor6);
	}
}