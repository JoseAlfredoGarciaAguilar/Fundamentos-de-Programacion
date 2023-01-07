package Portafolio;

public class OperacioneAritmeticas {

	public static void main(String[] args) {
		double op1 = 50.0;
		double op2 = 5.0;
		double resultado;
		resultado = suma(op1,op2);
		mostrar(resultado);
		resultado = resta(op1,op2);
		mostrar(resultado);
		resultado = multiplica(op1,op2);
		mostrar(resultado);
		resultado = divide(op1,op2);
		mostrar(resultado);
	}
	static void mostrar(double z)
	{
		System.out.println("Resultado = "+z);
	}
	static double suma(double op1, double op2)
	{
		int a = 0;
		int b = 0;
		double c = a+b;
		return c;
	}
	static double resta(double x, double y)
	{
		double z = x-y;
		return z;
	}
	static double multiplica(double x, double y)
	{
		double z = x * y;
		return z;
	}
	static double divide(double o1, double o2)
	{ double z= 01/o2; return z; 
	}
}