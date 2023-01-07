package Portafolio;
import java.util.Scanner;

public class NúmeroDePartidos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Proporciona Número de Partidos Ganados: ");
		int pg = entrada.nextInt();
		System.out.println("Proporciona Número de Partidos Empatados: ");
		int pe = entrada.nextInt();
		System.out.println("Proporciona Número de Partidos Perdidos: ");
		int pp = entrada.nextInt();
		int ppg = pg*3;
		int ppe = pe*1;
		int ppp = pp*0;
		int tp = ppg + ppe + ppp;
		System.out.println("Total de Puntos = " + tp);
	}
}