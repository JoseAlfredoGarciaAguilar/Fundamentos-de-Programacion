package Arreglos;

import java.util.Scanner;
public class EjemploCadena {

	public static void main(String[] args) {
		char []cd= new char[26];
		char []cf= {'A','L','U','a'};
		cf[cf.length-1]='A';//SUSTITUYE EL ULTIMO CARACTER
		//ASIGNACION DE CARACTERES: VALORES ENTEROS
		for (int j = 0;j<cd.length;){
			cd[j++]= (char)('A'+j);
		}
		for (int j = 0;j<cd.length;j++)
			System.out.print(cd[j]);
		//OTRO EJEMPLO
		char cad[]={'L','u','p','i','a','n','a'};
		//cad es un arreglo con 7 caracteres
		System.out.print(cad);
		//char []nc = new char[20];incorrecto
		
		String pd ="Felicidad";
		System.out.println(pd);
		Scanner entrada = new Scanner(System.in);
		String x = entrada.nextLine();
		System.out.println(x);
		System.out.println("El tamaño de la cadena es "+x.length());
		System.out.println(x.charAt(x.length()-1));
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		String cadena1= "Maria";
		String cadena2= "Mario";
		if (cadena1.equals(cadena2))
			System.out.print("iguales");
		else
			System.out.print("DIFERENTES");
	}
}