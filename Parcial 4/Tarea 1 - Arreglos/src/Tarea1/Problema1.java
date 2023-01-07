package Tarea1;
import java.util.Scanner;
//PROGRAMA QUE ORDENA DE FORMA DESCENDIENTE LAS CALIFICACIONES DE UNA DETERMINADA CANTIDAD DE ALUMNOS
//PARA DESPUÉS IMPRIMIR EL PROMEDIO DEL GRUPO, Y EL PORCENTAJE DE ALUMNOS APROBADOS
public class Problema1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int alumnos = 0;
		int suma = 0;
		int promedio = 0;
		int aprobados = 0;
		int reprobados = 0;
		
		System.out.print("¿Cuántos alumnos son?: ");
		alumnos = entrada.nextInt();
		String nombres[] = new String[alumnos];
		int calificaciones[] = new int[alumnos];
		for(int i=0; i<alumnos; i++){
		System.out.print("Nombre del alumno " + (i+1) + ": ");
		nombres[i] = entrada.next();
		System.out.print("Calificación del alumno " + (i+1) + ": ");
		calificaciones[i] = entrada.nextInt();
		}
		System.out.println();
		for(int i=0; i<calificaciones.length; i++){
			System.out.println(nombres[i] + " " + calificaciones[i]);
		}
		for(int i=0; i<calificaciones.length-1; i++){
			int max = 1;
			for(int j=i+1; j<calificaciones.length; j++){
				if(calificaciones[j] > calificaciones[max]){
					max=j;
				}
			}
			if(i!=max){
				int aux = calificaciones[i];
				String nomaux = nombres[i];
				nombres[i] = nombres[max];
				calificaciones[i] = calificaciones[max];
				nombres[max] = nomaux;
				calificaciones[max] = aux;
			}
			
		if(calificaciones[i] >= 70)
		{
			aprobados+=1;
		}
		else
		{
			reprobados = reprobados +1;
		}
			
		}
		System.out.println();
		for(int i=0; i<calificaciones.length; i++){
			System.out.println(nombres[i] + " " + calificaciones[i]);
			
			suma = suma+calificaciones[i];
			promedio = suma / calificaciones.length;
		}
		System.out.println();
		System.out.println("Promedio Final del grupo = " + promedio);
		
		double porcentaje_aprobados = (100/alumnos) * aprobados;
		System.out.println("Porcentaje de aprobados en el grupo: " + porcentaje_aprobados + "%");
		double porcentaje_reprobados = 100 - porcentaje_aprobados;
		System.out.println("Porcentaje de reprobados en el grupo: " + porcentaje_reprobados + "%");
}
}