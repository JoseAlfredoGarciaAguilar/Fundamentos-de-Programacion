package introduccion;

public class OperadoresExpresiones {

	public static void main(String[] args) {
		/*
		 * SIMBOLO   USO    DESCRIPCION
		 *    =       A=B    ASIGNA DEL VALOR DE B a A OPERADOR DE ASIGNACION
		 *   *=
		 */
		//OPERADOR DE ASIGNACION
		int a = 5,b=10,c;
		System.out.println("Valor de a = "+a);
		System.out.println("Valor de b = "+b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Valor de a = "+a);
		System.out.println("Valor de b = "+b);

	}

}
