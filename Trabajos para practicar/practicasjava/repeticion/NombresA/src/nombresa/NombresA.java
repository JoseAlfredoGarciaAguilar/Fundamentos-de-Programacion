//Jose Carlos Ochoa Taboada
//Practica 11
package nombresa;
import java.util.Scanner;


public class NombresA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int contadormujeres;
        String nombre = "";
        int personas = 0;
        int sumadora = 0;
        Scanner lector = new Scanner(System.in);
       do
       {
    personas++;
    System.out.println("Escriba su nombre: ");
    nombre = lector.nextLine();
    if (nombre.equalsIgnoreCase("A"))
    {   
        sumadora++;
        }
        }
    while (personas <11);
       {
       System.out.println("el numero de personas con nombre que empieza con A es " + sumadora);
       }
    }
}