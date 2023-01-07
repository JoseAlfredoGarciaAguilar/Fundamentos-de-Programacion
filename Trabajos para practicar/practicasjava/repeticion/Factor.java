//programa 5 
//Autor:jose Carlos Ochoa taboada
package factor;
import java.util.Scanner;

public class Factor 
{
    public static void main(String[] args)
    {
        long fact = 1;
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Escribe un numero que sera transformado a factorial: ");
        num = numero.nextInt();
        for (int i = num; i > 0 && i <11; i--) {
            fact = fact * i;
        }
        System.out.println("El factorial de " + num + " es: " + fact);
    }
}


 
       