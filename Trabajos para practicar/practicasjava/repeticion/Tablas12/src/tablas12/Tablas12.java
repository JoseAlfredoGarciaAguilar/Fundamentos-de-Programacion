//programa 6
//Autor: José Carlos Ochoa Taboada
package tablas12;
import java.util.Scanner;
public class Tablas12 
{  
    public static void main(String[] args) 
    {
    
        int num;
        int resultado;
        int mult = 0;
        Scanner lector = new Scanner (System.in);
        System.out.println("Escribe un numero que sera multiplicado hasta 12: ");
        num = lector.nextInt();
        for (int i = 1; i > 0 && i <13; i++)
        {
            mult = mult + 1;
        resultado = (num * mult);
        System.out.println(resultado);
        
        }
    }
    
}
