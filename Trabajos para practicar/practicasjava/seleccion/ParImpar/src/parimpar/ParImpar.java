package parimpar;
import java.util.Scanner;
//Autor:José Carlos Ochoa Taboada
public class ParImpar 
{
    public static void main(String[] args) 
    {
     Scanner lector = new Scanner(System.in);
     int numero = 0;
     System.out.println("Introduzca el numero que va a saber si es par o impar :  ");
        numero = lector.nextInt();
        if(numero %2 == 0)
        {
            System.out.println("El numero es par");
        }
        else
        {
        System.out.println("El numero es impar");
        }
    }
    
}
