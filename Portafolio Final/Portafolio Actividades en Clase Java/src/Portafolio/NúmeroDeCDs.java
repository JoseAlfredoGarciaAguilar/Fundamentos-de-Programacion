package Portafolio;
import java.util.Scanner;

public class NúmeroDeCDs {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Proporcione el Tamaño del Disco Duro en GB: ");
		double TamDDGB = entrada.nextDouble();
		double TamDDMB = TamDDGB*1024;
		int cd = (int)((TamDDMB/700)+1);
		System.out.println("Número de CDs que necesito = " + cd);
	}
}