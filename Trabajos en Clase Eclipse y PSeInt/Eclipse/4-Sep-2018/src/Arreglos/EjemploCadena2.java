package Arreglos;
import java.util.Scanner;

public class EjemploCadena2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String mipueblo = "Lupiana";
		String vacia="";
		String rotulo="\n\t Lista de Pasajeros\n";
		System.out.print(rotulo);
		char []cd = new char[26];
		char []cf = {'A','L','U','a'};
		System.out.print(cf);
		System.out.print(cd);
		cf[cf.length-1]='A'; //Sustituye el último caracter
		System.out.print(cf);
		System.out.println();
		for(int j=0; j<cd.length;)
			cd[j++]=(char)('A'+j);
		for(int j=0; j<cd.length; j++)
			cd[j]=(char)('A'+j);
		for(int j=0; j<cd.length; j++)
			System.out.print(cd[j]);
		String cl = entrada.nextLine();
		System.out.println(cl);
		String cadena1 = "Mario";
		int l = cadena1.length();
		System.out.println(l);
		String cadena2 = cadena1.concat(cadena1);
		System.out.println(cadena2);
		String cadena3 = cadena1 + cadena1;
		System.out.println(cadena1.charAt(0));
		System.out.println(cadena1.charAt(0));
		System.out.println(cadena1.charAt(cadena1.length()-1));
		
		for(int i=cadena1.length()-1;i>=0; i--)
			System.out.println(cadena1.charAt(i));
		String cadena4 = "Esa sal se sale a la sala";
		System.out.println(cadena4.toUpperCase());//convierte un texto a mayusculas
		System.out.println(cadena4.toLowerCase());//convierte un texto a mayusculas
		String subcadena = cadena4.substring(2,8);
		System.out.println(subcadena);
		String cad1 = "maria", cad2="maria";
		cad2 = cad2.trim(); //elimina espacios, tabuladores o espacios que estén al inicio o al final de la cadena
		cad2 = cad2.replace('a', 'A'); //sustituye todas las ocurrencias del caracter c1 por el caracter c2 y devuelve una nueva cadena
		char arreglo[]=cad2.toCharArray();//convierte la cadena en un arreglo de caracteres. Devuelve los caracteres de la cadena como un arreglo
		System.out.println(cad2);
		if(cad1.equals(cad2))
			System.out.println("SON IGUALES");
		else
			System.out.println("SON DIFERENTES");
	}
}