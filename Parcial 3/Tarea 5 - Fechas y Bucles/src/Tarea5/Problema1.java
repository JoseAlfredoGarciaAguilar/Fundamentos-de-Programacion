package Tarea5;
import java.util.*;

public class Problema1{

            public static void main(String [] args){
                       //crea d con la fecha actual
                       GregorianCalendar d = new GregorianCalendar();
                       Calendar c1 = GregorianCalendar.getInstance();
                       int hoy = d.get(Calendar.DAY_OF_MONTH);
                       int mes = d.get(Calendar.MONTH);
                       System.out.println(hoy);
                       System.out.println(mes);
                       //ajusta d para que se inicie en el primer dia del mes
                       d.set(Calendar.DAY_OF_MONTH,1);
                       int semana = d.get(Calendar.DAY_OF_WEEK);
                       System.out.println(semana);
                       //se muestra la cabecera
                       System.out.println("Fecha Actual: "+c1.getTime().toLocaleString());
                       System.out.println("DOM LUN MAR MIE JUE VIE SAB");
                       //se sangra la primer linea del calendario
                       for (int i=Calendar.SUNDAY; i<semana; i++)
                                   System.out.print ("    ");
                       do
                       {
                                   //muestra el dia
                                   int dia = d.get(Calendar.DAY_OF_MONTH);
                                   if (dia<10)
                                      { System.out.print("  ");
                                        System.out.print(dia);
                                   }
                                   else
                                      {
                                                System.out.print(" "+dia);
                                      }
                                   //marca el dia actual con *
                                   if (dia==hoy)
                                               System.out.print("*");
                                   else
                                               System.out.print(" ");
                                   //Inicia una nueva linea cada sabado
                                   if (semana == Calendar.SATURDAY)
                                               System.out.println();
                                   // avanza d al dia siguiente
                                   d.add(Calendar.DAY_OF_MONTH,1);
                                   semana = d.get(Calendar.DAY_OF_WEEK);
                       }
                       while (d.get(Calendar.MONTH)==mes);
                       // el bucle continua mientras d no sea el dia 1 del siguiente mes
                       //muestra el final de la linea en caso de ser necesarios
                       if (semana != Calendar.SUNDAY)
                                   System.out.println();
            }
}