 //programa 7
//Autor: José Carlos Ochoa Taboada

package multiplicarmismo;
import java.util.Scanner;
public class MultiplicarMismo
{
    public static void main(String[] args)
    {
        int num;
        int resultado;
        int mult = 0;
        Scanner lector = new Scanner (System.in);
        System.out.println("Escribe un numero que sera multiplicado hasta su mismo numero: ");
        num = lector.nextInt();
        for (int i = 1; i > 0 && i <= num; i++)
        {
            mult = mult + 1;
        resultado = (num * mult);
        System.out.println(resultado);
        
        }
    }
    
}



    
        
    
    

