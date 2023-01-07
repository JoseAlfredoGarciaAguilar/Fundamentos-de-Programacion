//programa 6
//Autor:José Carlos Ochoa Taboada
package multiplicar;

import java.util.Scanner;

public class Multiplicar 
{
    public static void main(String[] args)
    {
        
        int num = 0;
        int resultado;
        int mult ;
        Scanner lector= new Scanner(System.in);
        System.out.print("Escribe un numero que sera multiplicado hasta 12: ");
        mult = lector.nextInt();
        for (int i = 1; i > 0 && i <13; i++) 
        {
            num = num + 1;
            resultado = num * mult;
            System.out.println(resultado);
            
        }
    }
    
}
