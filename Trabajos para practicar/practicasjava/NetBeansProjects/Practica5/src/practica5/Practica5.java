//Escribe un programa que lea de teclado un numero de 0 a 10 y obtenga su factorial.
package practica5;

import java.util.Scanner;
public class Practica5 {
static Scanner in = new Scanner (System.in);
 
    public static void main(String[] args) {
        int factorial =1;
       for (int x=1; x<=10;x++){
       } 
       System.out.println("Ingrese un numero del 0 al 10");
   int numero = in.nextInt();
   
   while (numero!=0){
   factorial =factorial * numero;
   numero = numero - 1;
   }
   System.out.println("El factorial del numero es:  "+factorial);
    }
    
}
