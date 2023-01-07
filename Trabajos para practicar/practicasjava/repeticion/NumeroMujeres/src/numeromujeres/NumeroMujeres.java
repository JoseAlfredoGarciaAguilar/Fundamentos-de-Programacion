//programa 8
//Autor:jose Carlos Occhoa taboada
package numeromujeres;
import java.util.Scanner;
public class NumeroMujeres 
{
    public static void main(String[] args)
    {
        int contadormujeres;
        String nombre = "";
        String sexom = "mujer";
        int personas = 0;
        int sumamujer = 0;
        Scanner lector = new Scanner(System.in);
       do
       {
    personas++;
    System.out.println("Escriba su nombre: ");
    nombre = lector.nextLine();
    System.out.println("Escriba su sexo: ");
    String sexo = lector.nextLine();
    if (sexo.equals("mujer"))
    {   
        sumamujer++;
        }
        }
    while (personas <11);
       {
       System.out.println("el numero de mujeres es " + sumamujer);
       }
    }
}


