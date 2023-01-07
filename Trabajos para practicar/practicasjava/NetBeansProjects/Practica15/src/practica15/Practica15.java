// Escribe un programa que lea de teclado nombre y edad de 20 personas y obtenga el
//nombre de la persona mayor.
package practica15;

import java.util.Scanner;

public class Practica15 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
String nombremay = "";
int edadmay =0;
        for (int i = 1; i <= 20; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Inserte el nombre");
            String nombre;
                   nombre = teclado.nextLine();
            System.out.println("Inserte la edad");
            int edad;
            edad = in.nextInt();
       
        if (edad>edadmay){
            edadmay=edad;
            nombremay=nombre;
        }
        }
 System.out.println("El mayor es: "+nombremay);
        } 
    
    }
    
    

