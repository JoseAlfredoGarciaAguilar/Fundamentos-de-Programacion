package Tarea4;
//PROGRAMA QUE IMPRIME LOS CÓDIGO ASCII DE TODAS LAS LETRAS MAYÚSCULAS Y MINÚSCULAS
public class Problema12 {

	public static void main(String[] args) {
		char letra=0;
		for(int i=0; i<=255 ; i++ )
			System.out.println("El codigo ASCII de la letra " + letra++ + " es " + i);
	}
}