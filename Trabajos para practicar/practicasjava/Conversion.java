//Un programa que lee una cantidad del teclado en metros y obtener como resultado la conversión a
//centímetros,milímetros, kilometros,yardas,millas,pies,pulgadas
//Autor: José Carlos Ochoa Taboada
public class Conversion
{
	public static void main(String[]args)
	{
	double mts,cm,mm,km,yrd,mill,ft,inch = 0;

	System.out.println("Introduzca la cantidad de metros que desea convertir: ");
	mts = Keyboard.readDouble();
	cm = mts * 100;
	mm = mts * 1000;
	km = mts * 0.001;
	yrd = mts * 1.093;
	mill = mts * 0.000621371;
	ft = mts * 3.28084;
	inch = 39.3701;
	System.out.println("Los "+ mts + " Metros son: ");
	System.out.println(cm + "Centimetros");
	System.out.println(mm + "Milímetros");
	System.out.println(km + "Kilometros");
	System.out.println(yrd + "Yardas");
	System.out.println(mill + "Millas");
	System.out.println(ft + "Pies");
	System.out.println(inch + "Pulgadas");
	}
}
