//Programa que recibe un numero del 0 al 99 y devuelve el numero de decenas que este numero contiene
//Autor: José Carlos Ochoa Taboada
package decenas;
import java.util.Scanner;

public class Decenas 
{    
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        int numero = 0;
        System.out.println("Introduzca el numero del 0 a 99 para devolverle el"
                + " numero de decenas que tiene el numero:");
        numero = lector.nextInt();
        if(numero >= 0 && numero <= 11 )
        {
        System.out.println("El numero tiene 0 Decenas");
        
        
        }
        else 
        {
        }
    }
    
}
