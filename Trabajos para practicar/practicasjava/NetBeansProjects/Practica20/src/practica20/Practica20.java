//Escribe un programa que lea de teclado un número del 0 al 10 y regrese como resultado el número en letras.
package practica20;


import java.util.Scanner;

public class Practica20 {
 static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        for (int x= 0; x<=10; x++){
        System.out.println("Insertar numero del 0 al 10 ");
        int numero = in.nextInt();
      
     switch (numero) {
            case 0:
                System.out.println("Cero");
                break;
            case 1: System.out.println("Uno");    
           break;
            case 2: System.out.println("Dos");
            break;
            case 3: System.out.println("Tres");
            break;
            case 4: System.out.println("Cuatro");    
           break;
            case 5: System.out.println("Cinco");
            break;
            case 6: System.out.println("Seis");
            break;
            case 7: System.out.println("Siete");    
           break;
            case 8: System.out.println("Ocho");
            break;
            case 9: System.out.println("Nueve");
            break;
             case 10: System.out.println("Diez");
            break;
             default:
                 System.out.println("Numero invalido");
                
    }    
    
    }
}
}