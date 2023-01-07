package Tarea3;

public class Problema7 {

	public static void main(String[] args) {
		String lineas[] = {"Distrito","Candidato A","Candidato B","Candidato C","Candidato D"};
		int distrito[] = {1,2,3,4,5};
		int candidato_a[] = {194,180,221,432,820};
		int candidato_b[] = {48,20,90,50,61};
		int candidato_c[] = {206,320,140,821,946};
		int candidato_d[] = {45,16,20,14,18};
		System.out.println(lineas[0] + "   " + lineas[1] + "   " + lineas[2] + "   " + lineas[3] + "   " + lineas[4]);
		System.out.println("   " + distrito[0] + "          " + candidato_a[0] + "            " + candidato_b[0] + "            " + candidato_c[0] + "           " + candidato_d[0]);
		System.out.println("   " + distrito[1] + "          " + candidato_a[1] + "            " + candidato_b[1] + "            " + candidato_c[1] + "           " + candidato_d[1]);
		System.out.println("   " + distrito[2] + "          " + candidato_a[2] + "            " + candidato_b[2] + "            " + candidato_c[2] + "           " + candidato_d[2]);
		System.out.println("   " + distrito[3] + "          " + candidato_a[3] + "            " + candidato_b[3] + "            " + candidato_c[3] + "           " + candidato_d[3]);
		System.out.println("   " + distrito[4] + "          " + candidato_a[4] + "            " + candidato_b[4] + "            " + candidato_c[4] + "           " + candidato_d[4]);
		
		VotosCandidato_a(candidato_a);
		VotosCandidato_b(candidato_b);
		VotosCandidato_c(candidato_c);
		VotosCandidato_d(candidato_d);
	}
	static void VotosCandidato_a(int candidato_a[]) {
		int total_de_votos_candidato_a = candidato_a[0]+candidato_a[1]+candidato_a[2]+candidato_a[3]+candidato_a[4];
		System.out.println("Total de Votos del Candidato A: " + total_de_votos_candidato_a);
	}
	static void VotosCandidato_b(int candidato_b[]) {
		int total_de_votos_candidato_b = candidato_b[0]+candidato_b[1]+candidato_b[2]+candidato_b[3]+candidato_b[4];
		System.out.println("Total de Votos del Candidato B: " + total_de_votos_candidato_b);
	}
	static void VotosCandidato_c(int candidato_c[]) {
		int total_de_votos_candidato_c = candidato_c[0]+candidato_c[1]+candidato_c[2]+candidato_c[3]+candidato_c[4];
		System.out.println("Total de Votos del Candidato C: " + total_de_votos_candidato_c);
	}
	static void VotosCandidato_d(int candidato_d[]) {
		int total_de_votos_candidato_d = candidato_d[0]+candidato_d[1]+candidato_d[2]+candidato_d[3]+candidato_d[4];
		System.out.println("Total de Votos del Candidato D: " + total_de_votos_candidato_d);
	}
}