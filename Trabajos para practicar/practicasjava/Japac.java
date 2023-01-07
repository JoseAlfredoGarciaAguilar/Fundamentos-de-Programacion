//Programa que obtiene al cantidad a pagar de un usuario de JAPAC, tomando la cantidad de agua consumida
//cada m3 se cobra $4.5 + 16% de iva y $2.0 la cooperación de los bomberos.
// Autor: José Carlos Ochoa Taboada

public class Japac
{
  public static void main(String[]args)
  {
  double m3,cobro,iva,total = 0;

  System.out.println("Escriba la cantidad de m3 consumidos: ");
  m3 = Keyboard.readDouble();
  cobro = m3 * 4.5;
  iva = cobro * .16;
  total = (cobro + iva)+ 2;
  System.out.println("El total del gasto es: " + total);
  }
}
