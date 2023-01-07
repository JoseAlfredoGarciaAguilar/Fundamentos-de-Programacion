
package weaserpiente;

//import java.util.Random;
//import java.util.Scanner;


public class WeaSerpiente {

   
    public static void main(String[] args) {

//        Random Azar = new Random();
//        int dado = Azar.nextInt(10) + 2;
//        System.out.println(dado+"");           esta wea era pa emular el metodo de "jugador" (dado da error porq esto esta comentado xD)
        int [][] tabla = new  int [10][9];
        int contador = 0;
        for (int i = 0; i < 10; i++) 
        {
            contador++;
            tabla[i][0] = contador;
            System.out.println(tabla[i][0]+"");
            for (int j = 0; j < 9; j++)
            {
                contador++;
                tabla[i][j] = contador;
                System.out.println(tabla[i][j]+"");
            }
  
        }
        for (int i = 0; i < 10; i++) 
        {
            if(dado == tabla[i][0])
            {
                System.out.println(tabla[i][0]);
                break;
            }else
            {
                for (int j = 0; j < 9; j++)
                {                
                 if(dado == tabla[i][j])
                 {
                    System.out.println(tabla[i][j]);
                    break;
                 }
                }
            }
        }        
        
       
    }
    

}