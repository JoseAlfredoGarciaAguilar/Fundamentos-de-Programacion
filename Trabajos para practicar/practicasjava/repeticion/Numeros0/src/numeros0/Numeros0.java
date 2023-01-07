//programa 1
//Programa que repite desde x numero hasta 0
//Autor: José Carlos Ochoa Taboada
package numeros0;
import java.util.Scanner;
public class Numeros0 
{
    public static void main(String[] args)
    {  
        Scanner lector = new Scanner(System.in);
        int x ;
        int i;
        System.out.println("Introduzca un numero en el cual se le hara una cuenta regresiva hasta el 0: ");
        x = lector.nextInt();
        
        for ( i = x; i>-1; i--) System.out.println(i);

    }
    
}
