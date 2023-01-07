package Arreglos;
import java.util.Scanner;

public class Arreglo1 {

	public static void main(String[] args) {
		String nombre[];
		nombre = new String[3];
		nombre[0]="HUGO";
		nombre[1]="PACO";
		nombre[2]="LUIS";
		for(int i=0; i<3; i++)
		{
			System.out.println(nombre[i]);
		}
		nombre[1]=nombre[1]+" ARMENTA";
		System.out.println(nombre[1]);
		
		int mes [] = new int[12];
		mes[0]=31;
		mes[1]=28;
		mes[2]=31;
		mes[3]=30;
		mes[4]=31;
		mes[5]=30;
		mes[6]=31;
		mes[7]=31;
		mes[8]=30;
		mes[9]=31;
		mes[10]=30;
		mes[11]=31;
		
		final int MES [] = new int[12];
		MES[0]=31;
		MES[1]=28;
		MES[2]=31;
		MES[3]=30;
		MES[4]=31;
		MES[5]=30;
		MES[6]=31;
		MES[7]=31;
		MES[8]=30;
		MES[9]=31;
		MES[10]=30;
		MES[11]=31;
		for(int i=0; i<MES.length; i++)
			System.out.println(MES[i]);
		
		double sueldo[] = new double[5];
		for(int i=0; i<sueldo.length;i++)
			sueldo[i]=i;
		for(int i=0; i<sueldo.length;i++)
			System.out.println(sueldo[i]);
		
		Scanner entrada = new Scanner(System.in);
		for(int i=0; i<sueldo.length;i++)
		{
			System.out.print("Proporciona sueldo [" + i + "] = ");
			sueldo[i] = entrada.nextInt();
		}
		for(int i=sueldo.length-1; i>=0; i--)
		{
			System.out.print("Sueldo[" + i + "] = ");
			System.out.println(sueldo[i]);
		}
		float aumento = 0.5f;
		for(int i=0; i<sueldo.length; i++)
		{
			sueldo[i]= sueldo[i] + sueldo[i] * aumento;
		}
		System.out.println("NUEVOS SUELDOS");
		for(int i=0; i<sueldo.length; i++)
			System.out.println(sueldo[i]);
		double total = 0;
		for(int i = 0; i<sueldo.length; i++)
		{
			total = total + sueldo[i];
		}
		System.out.println("Total Sueldo = " + total);
		
		double s = totales(sueldo);
		System.out.println("TOTALES SUELDO = " + s);
	}
	public static double totales(double a[]){
		double total = 0;
		for(int i=0; i<a.length; i++){
			total = total + a[i];
		}
		return total;	
	}
}