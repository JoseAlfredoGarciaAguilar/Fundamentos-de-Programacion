package Unidad3;

public class Problema64CódigoASCII {

	public static void main(String[] args) {
		char letra=0;
		for(int i=0; i<=255 ; i++ )
			System.out.println("El codigo ASCII de la letra " + letra++ + " es " + i);
	}
}