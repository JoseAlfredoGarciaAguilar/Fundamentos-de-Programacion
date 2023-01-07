
package mujereshombres;
import java.util.Scanner;

//programa 9
//Autor:jose Carlos Occhoa taboada
public class MujeresHombres 
{
    public static void main(String[] args)
    {
        int contadormujeres;
        String nombre = "";
        String sexom = "mujer";
        String sexoh = "hombre";
        int personas = 0;
        int sumahombre = 0;
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
    else if(sexo.equals("hombre"))
    {
        sumahombre++;
    }
    else
    {
        System.out.println("El sexo que escribio no es reconocido");
    }
        }
    while (personas <11);
       {
       System.out.println("el número total de mujeres es: " + sumamujer + " y el número total de hombres es: " + sumahombre);
       }
    }
}