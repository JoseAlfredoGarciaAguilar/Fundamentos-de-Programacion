//Programa que lee la base y la altura de un tri�ngulo y obtiene el �rea 
//Autor: Jos� Carlos Ochoa Taboada 

	public class AreaTriangulo
{
	public static void main(String[] args)
	{	
	double base,altura,area = 0;
	
	System.out.println("Escriba la Base del tri�ngulo: ");
	base = Keyboard.readDouble();
	System.out.println("Escriba la Altura del tri�ngulo: ");
	altura = Keyboard.readDouble();
	area = (base * altura)/2;
	System.out.println("El �rea del tri�ngulo es de "+ area + " unidades");

	}

 }