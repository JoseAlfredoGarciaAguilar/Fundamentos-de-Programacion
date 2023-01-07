package Tarea5;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.*;
import java.util.Locale;

public class Problema2{

            public static void main(String []args) {
            Calendar c1=GregorianCalendar.getInstance();
            System.out.println("Fecha Actual: "+c1.getTime().toLocaleString());
            //Ejemplo de como formatear un numero
            //NumberFormat formatoImporte = NumberFormat.getInstance() Toma el Actual
            NumberFormat formatoImporte = NumberFormat.getInstance(new Locale("es","MX"));
            System.out.println(formatoImporte.format(-1222.44));
            NumberFormat formatoPorcentaje=NumberFormat.getPercentInstance(new Locale("es","MX"));
            System.out.println(formatoPorcentaje.format(0.9781));
            //Creacion de un formato con separadores de decimales y millones, con 2 decimales
            DecimalFormat formato=new DecimalFormat("#,###,###,###.00");
            String valorFormato=formato.format(12345678.789);
            System.out.println(valorFormato);
            // Fechas en diferentes formatos
            Calendar c = Calendar.getInstance();
            c.set(2010,11,14); // Es mes es base 0
            Date d2= c.getTime();
            Locale locPE= new Locale("es","PE"); // Italia
            Locale locPT= new Locale("pt"); // Portugal
            Locale locMX= new Locale("es","MX"); // Mexico
            Locale locUS= new Locale("us","US"); // USA
            DateFormat dfMX= DateFormat.getInstance();
            System.out.println("MX "+dfMX.format(d2));
            DateFormat dfUS=DateFormat.getDateInstance(DateFormat.FULL,locUS);
            System.out.println("USA "+dfUS.format(d2));
    }                 
}