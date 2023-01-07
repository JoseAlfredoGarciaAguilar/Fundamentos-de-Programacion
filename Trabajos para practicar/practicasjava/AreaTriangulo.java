//Programa que lee la base y la altura de un triángulo y obtiene el área 
//Autor: José Carlos Ochoa Taboada 

	public class AreaTriangulo
{
	public static void main(String[] args)
	{	
	double base,altura,area = 0;
	
	System.out.println("Escriba la Base del triángulo: ");
	base = Keyboard.readDouble();
	System.out.println("Escriba la Altura del triángulo: ");
	altura = Keyboard.readDouble();
	area = (base * altura)/2;
	System.out.println("El área del triángulo es de "+ area + " unidades");

	}

 }