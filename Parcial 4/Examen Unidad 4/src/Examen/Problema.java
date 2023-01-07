package Examen;

import java.util.*;
public class Problema {

static Scanner entrada =new Scanner(System.in);
static int cantidaddecapturas=0;
static int dimensiondelarreglo[][]=new int[50][6];
    
    public static void main(String[] args) {
        GuardarCalificaciones();
        PromedioGrupal();
        PorcentajeAprobadosReprobados();
        CalificacionesOrdenadas();
        CalificacionEnRango();
    }
    public static void GuardarCalificaciones(){
        int num_alumno=0;
        int puesto=0;
        while(num_alumno<=50){
            num_alumno = num_alumno+1;
            System.out.print("Escribe el número de control del Alumno "+num_alumno + ": ");
            dimensiondelarreglo[puesto][0]=entrada.nextInt();
            System.out.println("CALIFICACIONES DE TODOS LOS ALUMNOS");
            System.out.print("Escribe la Calif. de Química del Alumno "+ num_alumno + ": ");
            dimensiondelarreglo[puesto][1]=CalificacionEnRango();
            System.out.print("Escribe la Calif. de Física del Alumno "+ num_alumno + ": ");
            dimensiondelarreglo[puesto][2]=CalificacionEnRango();
            System.out.print("Escribe la Calif. de Español del Alumno "+ num_alumno + ": ");
            dimensiondelarreglo[puesto][3]=CalificacionEnRango();
            System.out.print("Escribe la Calif. de Inglés del Alumno "+ num_alumno + ": ");
            dimensiondelarreglo[puesto][4]=CalificacionEnRango();
            System.out.print("Escribe la Calif. de Matemáticas del Alumno "+ num_alumno + ": ");
            dimensiondelarreglo[puesto][5]=CalificacionEnRango();
            
            puesto = puesto+1;
            cantidaddecapturas++;
            
            System.out.println();
            System.out.println("¿Deseas seguir capturando alumnos?, Escribe S para Sí, y N para No");
            char eleccion=entrada.next().charAt(0);
            if(eleccion == 'N'){
            	break;
            }
        }
    }
    public static double PromedioGrupal(){
        int sumagrupal=0;
        double promediogrupal=0;
        for (int i = 0; i < cantidaddecapturas; i++) {
            int sumaporalumno=0;
            for (int j = 1; j < dimensiondelarreglo[i].length; j++) {
                sumaporalumno+=dimensiondelarreglo[i][j];
            }
            sumagrupal=sumagrupal+sumaporalumno;
        }
        promediogrupal=sumagrupal/(cantidaddecapturas*5);
        System.out.println();
        System.out.println("PROMEDIO GRUPAL");
        System.out.println("El promedio grupal es: "+promediogrupal);
        return promediogrupal;
    }
     public static void CalificacionesOrdenadas(){
        Double [] promediostodos=new Double [cantidaddecapturas];
        for (int i = 0; i < cantidaddecapturas; i++) {
            int sumaporalumno=0;
            for (int j = 1; j < dimensiondelarreglo[i].length; j++) {
                sumaporalumno+=dimensiondelarreglo[i][j];
            }
            promediostodos[i]=(double)(sumaporalumno/5);
        }
        System.out.println();
         System.out.println("PROMEDIOS ORDENADOS");
         for (int i=0; i < promediostodos.length; i++) {
             System.out.println("Alumno " + i + " obtuvo de promedio " + promediostodos[i]);
         }
    }
    public static void PorcentajeAprobadosReprobados(){
        int aprobados=0;
        int reprobados=0;
         for (int i = 0; i < cantidaddecapturas; i++) {
        	 double promedioalumno=0;
        	 int sumaporalumno=0;
        	 for (int j = 1; j < dimensiondelarreglo[i].length; j++) {
        		 sumaporalumno+=dimensiondelarreglo[i][j];
        		 }
        	 promedioalumno=sumaporalumno/5;
        	 if(promedioalumno>=70){
        		 aprobados++;
            }else{
                reprobados++;
            }
        }
         System.out.println();
         System.out.println("PORCENTAJES DE APROBADOS Y REPROBADOS");
         System.out.println("Porcentaje de Alumnos Aprobados: "+ ((aprobados*100)/cantidaddecapturas) + "%");
         System.out.println("Porcentaje de Alumnos Reprobados: "+ ((reprobados*100)/cantidaddecapturas) + "%");
    }
    public static int CalificacionEnRango(){
        int calificacion=0;
        do{
            calificacion=entrada.nextInt();
        }while(calificacion<0 || calificacion>100);
        return calificacion;
    }
}