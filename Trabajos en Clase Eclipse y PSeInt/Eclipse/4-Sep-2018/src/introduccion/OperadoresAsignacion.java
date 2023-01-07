package introduccion;

public class OperadoresAsignacion {

	public static void main(String[] args) {
		//Operador de asignación
		int a = 0;
		System.out.println("Valor de a = " + a);
		a = 20;
		System.out.println("Valor de a = " + a);
		a = 1250;
		System.out.println("Valor de a = " + a);
		int b = 5;
		int c = 10;
		System.out.println("Valor de b = " + b);
		System.out.println("Valor de c = " + c);
		int aux = b;
		b = c;
		c = aux;
		System.out.println("Valor de b = " + b);
		System.out.println("Valor de c = " + c);
		
		//Operadores de asignacion
		int z = 5;
		System.out.println(z);
		z += 5; //z = z + 5
		System.out.println(z);
		
		z -= 1; //z = z-1
		System.out.println(z);
		
		z *= 2; //z = z * 2;
		System.out.println(z);
		
		z /= 2; // z = z / 2
		System.out.println(z);
		
		z %= 2; //z = z % 2
		System.out.println(z);
		
		int contador = 0;
		contador ++; //contador = contador + 1
		contador ++;
		contador --; //contador = contador - 1  , contador + = 1
		++contador;
		--contador;
		
		//Operaciones aritméticas
		// + suma
		int suma = 5 + 6;
		System.out.println(suma);
		// - resta
		int resta = 9 - 11;
		System.out.println(resta);
		int operadornegativo = -40;
		System.out.println(operadornegativo);
		//producto
		int producto = 11 * 11;
		System.out.println(producto);
		//division entera
		float division = 9.0f / 2.0f;
		System.out.println(division);
		//residuo, resto o módulo
		int residuo = 9 % 2;
		System.out.println(residuo);
		//asociatividad y presencia
		int expresion = 5*2+9/3-1; //los opereadores de suma y resta tienen la misma presedencia
		System.out.println(expresion);
		int expresion2 = 5*4/2%5;
		System.out.println(expresion2);
		int expresion3 = (((5*4-1)-(2/5))*2)/5;
		System.out.println(expresion3);
		int x = 2 / 5;
		System.out.println(x);
		double x1 = 2.0 / 5.0;
		System.out.println(x1);
	}
}