package Portafolio;
import java.util.Scanner;

public class N�meroDeCDs {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Proporcione el Tama�o del Disco Duro en GB: ");
		double TamDDGB = entrada.nextDouble();
		double TamDDMB = TamDDGB*1024;
		int cd = (int)((TamDDMB/700)+1);
		System.out.println("N�mero de CDs que necesito = " + cd);
	}
}