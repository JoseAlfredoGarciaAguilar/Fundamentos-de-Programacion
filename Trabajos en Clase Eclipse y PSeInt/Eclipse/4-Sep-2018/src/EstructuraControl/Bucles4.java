package EstructuraControl;
import java.io.IOException;
//PROGRAMA QUE PIDE UN DÍGITO, Y APARECE MENSAJE DE ERROR MIENTRAS NO SE HAGA
//EL PROGRAMA SE DETIENE CUANDO FINALMENTE SE INGRESÓ UN DÍGITO
public class Bucles4 {

	public static void main(String[] args) throws IOException{
		//Bucles controlados por indicadores o banderas
		boolean digito_leido = false;
		while(!digito_leido)
		{
			System.out.println("Introduzca un dígito: ");
			char car = (char)System.in.read();
			System.in.skip(1);
			System.out.println("Error. Requiero un dígito");
			digito_leido = (('0'<=car) && (car<='9'));
		}
		System.out.println("Al fin tecleaste un dígito");
	}
}