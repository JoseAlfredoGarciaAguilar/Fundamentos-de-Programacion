//Programa que lee la cantidad de pesos y los convierte a dólares, euros y libras esterlinas
//Autor: José Carlos Ochoa Taboada

public class Pesos
{
  public static void main(String[]args)
      {
        double mxn,usd,eur,lbs;
        System.out.println("Teclee la cantidad de pesos que desea convertir a dolares, euros y libras esterlinas: ");
        mxn = Keyboard.readDouble();
        usd = mxn * 0.052;
        eur = mxn * 0.045;
        lbs = mxn * 0.04;
        System.out.printf(mxn + " pesos son : "+ usd + "dolares, "+ eur + " euros y " + lbs + " libras esterlinas");

      }
}
