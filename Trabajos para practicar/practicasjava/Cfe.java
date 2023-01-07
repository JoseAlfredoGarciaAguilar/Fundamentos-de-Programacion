//obtiene la cantidad a pagar por cada usuario de la cfe
//leyendo en el teclado la cantidad de kw consumidos por usuario y calcula el monto de pago si cada kw tiene un costo de $0.68
//Autor: Jos� Carlos Ochoa Taboada

public class Cfe
 {
  public static void main(String[]args)
  {
	int kwconsumidos = 0;
	double total = 0;
	System.out.println("Introduza la cantidad de kw consumidos: ");
	kwconsumidos = Keyboard.readInt();
	total = kwconsumidos * 0.68;
	System.out.print("El gasto total de los kw consumidos es de "+ total + " pesos mexicanos");
	}
}
