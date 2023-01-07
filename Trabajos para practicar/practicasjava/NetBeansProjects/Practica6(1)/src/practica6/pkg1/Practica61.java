//Lea de teclado un numero del 0 al 12 y obtenga su tabla.
package practica6.pkg1;
import java.util.Scanner;


public class Practica61 {

   
  static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

int numero,x;

System.out.println("****Obtenga su tabla****");
System.out.print("Ingrese un numero del 0 al 12: ");
numero = in.nextInt();

for(x = 1; x <= 12; x++)
{
System.out.println(numero + " x " + x + " = " + numero*x);
}
System.out.println();

}
}