//Matriz que te dice que productos vende y que dias vende tanto de cada 
//producto  el cual se llenan los campos con el metodo random y luego se compara con una condicional 
//que dia se vendio mas de cada producto
//Autor: José Carlos Ochoa Taboada
package matrizpoductos;

import java.util.Random;


public class MatrizPoductos 
{
    public static void main(String[] args)
    {
        Random aleatorio = new Random();
    int[][] tienda = new int[6][7];
    for (int i =0; i < tienda.length; i++)
        
      	   for (int j =0; j < tienda[i].length; j++)
      	       tienda[i][j] = i+j;
    String[]productos = {"leche","pan","huevos","tortillas","frijoles","refresco"};
    String[]dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    

        int vendido = aleatorio.nextInt(100) + 1 ;
       System.out.println(aleatorio+"");
    }
    
}
