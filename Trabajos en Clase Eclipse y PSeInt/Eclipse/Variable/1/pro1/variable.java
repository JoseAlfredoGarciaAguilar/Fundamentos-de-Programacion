package pro1;

public class variable {

	public static void main(String[]args){
	//Tipo Caracter
	char datoCar;
	char letra = 'A';
	char respuesta = 'S';
	char carUno = 'a';
	System.out.println("Caracter "+carUno);
	carUno = (char)(carUno-32);
	System.out.println("Caracter "+carUno);
	//Tipo Boolean
	boolean bisiesto;
	bisiesto = true;
	boolean encontrado, bandera;
	encontrado = true;
	bandera = false;
	if (encontrado)
		System.out.println("Valor encontrado");
	else
		System.out.println("Valor no encontrado");
	encontrado = (3>2) & (11<10);
	if (encontrado)
		System.out.println("Verdadero");
	else
		System.out.println("Falso");
	int y1 = 9;
	boolean estaEnRango;
	estaEnRango = (y1<-1) || (y1>15);
	if (estaEnRango)
		System.out.println("El valor "+y1+" está en rango");
	else
		System.out.println("El valor "+y1+" no está en rango");
	
	//Conversiones de tipo
	float var2 = 55.87F;
	int var3 = (int)(var2);
	System.out.println(var3);
	int var4 = 100;
	float var5;
	var5 = (float)(var4);
	System.out.println(var5);
	
	
	}
	}