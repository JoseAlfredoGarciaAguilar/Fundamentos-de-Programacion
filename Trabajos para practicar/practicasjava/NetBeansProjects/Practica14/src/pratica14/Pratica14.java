//Escribe un programa que lea de teclado un String y obtenga como resultado el número de palabras que contiene.
package pratica14;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pratica14 {
static Scanner in = new Scanner (System.in);
 
    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
        String palabra;
        System.out.println("Escriba cualquier palabra");
       palabra = teclado.nextLine();
    StringTokenizer st = new StringTokenizer(palabra);//El metodo Tokenizer se usa para dividir una cadena de texto 
      System.out.println (st.countTokens());
    }
    
    
}
