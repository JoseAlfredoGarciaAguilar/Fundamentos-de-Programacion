//Autor:José Carlos Ochoa Taboada
//Lee un numero del 1 al 12 y te da el mes
package mesaño;

import java.util.Scanner;

public class MesAño
{
    
    public static void main(String[] args) 
    {
    int mes,resp;
    Scanner lector = new Scanner(System.in);
    String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre",
        "Octubre","Noviembre","Diciembre"};
     resp =1;
 while(resp == 1)
{
System.out.println("Escriba por favor un numero del 1 al 12 para esribir el mes que le corresponde");
mes = lector.nextInt();
if (mes>=0 && mes<=12)
{
System.out.println(meses[mes]);
}
else
{
System.out.println("Que el numero sea del 0 al 6");
}
System.out.println("Desea continuar con la ejecución de este programa? (1=SI");
respuesta=Leer.datoInt(); 
}
System.out.println("Programa finalizado"); 
} 

    }
    
}
