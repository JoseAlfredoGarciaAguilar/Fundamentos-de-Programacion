//Leer cantidad de grados celcius y transformar a fahrenheit
//Autor: José Carlos Ochoa Taboada

public class Grados
{
  public static void main(String[] args)
  {
    double  celcius,fahrenheit = 0;

    System.out.println("Introduzca la cantidad de grados celcius que va a convertir a fahrenheit: ");
    celcius = Keyboard.readDouble();
    fahrenheit = (celcius * 9/5)+32;

    System.out.println( celcius + " grados celcius son "+ fahrenheit +" grados fahrenheit");





  }
}
