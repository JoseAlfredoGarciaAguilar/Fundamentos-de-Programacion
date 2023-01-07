package introduccion;

public class OperadoresRelacionales {
	public static void main(String[]arg){
	/*Símbolo descripción ejemplo
	 * 
	 * ==   Igual que   a==b
	 * >   Mayor que   a>b
	 * <   Menor que   a<b
	 * >=   Mayor igual a>=b
	 * <=   Menor igual   a<=b
	 * !=   Diferente   a!=b
	 */

	boolean c;
	c = 3 < 7;
	System.out.println(c);
	
	c  = 7 < 7;
	System.out.println(c);
	
	c = 7 <= 7;
	System.out.println(c);
	
	c = 7 == 7;
	System.out.println(c);
	
	c = 7 != 7;
	System.out.println(c);
	
	double x, a, b ,d;
	int numero;
	char inicial;
	x = 6.0;
	boolean resultado;
	resultado = x < 5.75; //falso
	b = 2.0; a = 0.5; d = 1.14;
	resultado = b * b >= 5.0 * a * d; // 4 >= 3.5
	numero = 100;
	resultado = numero == 100; //true
	inicial = 's';
	resultado = inicial !='S'; //true
	System.out.println(resultado);
}
}