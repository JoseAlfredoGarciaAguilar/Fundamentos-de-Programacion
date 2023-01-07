//Programa que da el valor de X por medio de la formula general
//Autor: José Carlos Ochoa Taboada
//Fecha:
import java.util.Scanner;
public class Formula
{
    static Scanner lectura = new Scanner(System.in);
    public static void main(String[]args)
    {
        int a,b,c = 0;
        double x,x2,rz = 0;

        System.out.println("Escribe el valor de a");
        // a = Keyboard.readInt();
        a = lectura.nextInt();
        System.out.println("Escribe el valor de b");
        // b = Keyboard.readInt();
        b = lectura.nextInt();
        System.out.println("Escribe el valor de C");
        //  c = Keyboard.readInt();
        c = lectura.nextInt();

        rz = Math.sqrt(( b * b)-( 4 * a * c));
        x = (-b + raiz)/ (2 * a);
        x2 = (-b - raiz) / (2 * a);

        System.out.println("Resultados de X: ");
        System.out.println("Resultado 1 es igual a :"+ x);
        System.out.println("Resultado 2 es igual a: " + x2);
    }
}
