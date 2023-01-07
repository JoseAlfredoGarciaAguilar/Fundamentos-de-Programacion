package Portafolio;

public class VariablesTipoBoolean2 {

	public static void main(String[] args) {
		int numero = 9;
		boolean rango;
		rango = (numero<-1) || (numero>15);
		if (rango)
			System.out.println("El valor "+ numero +" está Rango");
		else
			System.out.println("El valor "+ numero +" no está Rango");
	}
}