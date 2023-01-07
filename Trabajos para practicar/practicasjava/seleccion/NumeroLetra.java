//algoritmo que toma un numero y da una letra como resultado correspondiente
//Autor: José Carlos Ochoa Taboada
package numeroletra;
import java.util.Scanner;
public class NumeroLetra 
{
public static void main(String[] args)
{
    Scanner lector = new Scanner(System.in);
    byte numero;
    System.out.println("Escriba un numero del 0 al 10: ");
    numero = lector.nextByte();
    
    if(numero == 0)
    {
     System.out.println("El numero es cero");
    }
    else if (numero == 1)
    {
    System.out.println("El numero es uno ");
    }
    else if (numero == 2)
    {
    System.out.println("El numero es dos ");
    }
    else if (numero == 3)
    {
    System.out.println("El numero es tres ");
    }
    else if (numero == 4)
    {
    System.out.println("El numero es cuatro");
    }
    else if (numero == 5)
    {
    System.out.println("El numero es cinco ");
    }
    else if (numero == 6)
    {
    System.out.println("El numero es seis ");
    }
    else if (numero == 7)
    {
    System.out.println("El numero es siete ");
    }
    else if (numero == 8)
    {
    System.out.println("El numero es ocho ");
    }
    else if (numero == 9)
    {
    System.out.println("El numero es nueve ");
    }
    else if (numero == 10)
    {
    System.out.println("El numero es diez ");
    }
    else    
    {
    System.out.println("Error,el numero es invalido! ");
    }
    }
    
}
