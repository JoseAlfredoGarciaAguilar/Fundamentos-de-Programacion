//Jose Carlos Ochoa Taboada
//Practica 12
package divisores;

import java.util.Scanner;

public class Divisores 
{
    public static void main(String[] args) 
    {
        String numdivisores ="(";
        Scanner lector = new Scanner(System.in);
        int numero;
        System.out.println("Escriba el numero que quiera saber sus divisores: ");
        numero = lector.nextInt();
        for(int i = 1; i < (numero + 1); i++)
            if(numero % i == 0)   
           { 
           numdivisores += i;
           if(i < numero)
           {
           numdivisores+=",";
           }
        }
        numdivisores+=")";
        System.out.println(numdivisores);
     }
    }
    
