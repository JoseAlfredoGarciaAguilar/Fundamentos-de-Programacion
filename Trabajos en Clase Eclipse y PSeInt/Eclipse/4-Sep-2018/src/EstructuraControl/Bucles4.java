package EstructuraControl;
import java.io.IOException;
//PROGRAMA QUE PIDE UN D�GITO, Y APARECE MENSAJE DE ERROR MIENTRAS NO SE HAGA
//EL PROGRAMA SE DETIENE CUANDO FINALMENTE SE INGRES� UN D�GITO
public class Bucles4 {

	public static void main(String[] args) throws IOException{
		//Bucles controlados por indicadores o banderas
		boolean digito_leido = false;
		while(!digito_leido)
		{
			System.out.println("Introduzca un d�gito: ");
			char car = (char)System.in.read();
			System.in.skip(1);
			System.out.println("Error. Requiero un d�gito");
			digito_leido = (('0'<=car) && (car<='9'));
		}
		System.out.println("Al fin tecleaste un d�gito");
	}
}