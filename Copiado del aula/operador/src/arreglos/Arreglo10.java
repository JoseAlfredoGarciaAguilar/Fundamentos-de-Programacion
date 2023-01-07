package arreglos;

import java.util.Scanner;
public class Arreglo10{
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] arg)
	{
		int i;
		int pos = 0, neg = 0; //contadores de los numeros positivos y negativos
		int [] numeros = new int[10]; // Array que contrendra los números leídos
		double sumaPos = 0, sumaNeg = 0;//acumuladores para la suma de los negativos y positivos 
		//Lectura de los datos y llenar en el array
		System.out.println("Lectura de los elementos del array:");
		for (i = 0; i<10; i++){
			System.out.print("numeros["+i+"]= ");
		    numeros[i] = entrada.nextInt();
        }//HASTA ESTE PUNTO SE HA GENERADO LA LECTURA DE LOS NUMEROS
		
        //Recorrer el array para sumar por separado los 
        //numero positivos y negativos
        for(i=0;i<10;i++){
        	if(numeros[i]>0){//sumar positivos
              sumaPos += numeros[i];//SUMAPOS = SUMAPOS+NUMEROS[i]
              pos ++;
        	}else if (numeros[i]<0){// sumar negativos
              sumaNeg += numeros[i];//SUMANEG = SUMANEG+NUMEROS[i]
              neg ++;
            }
        }//HASTA ESTE PUNTO ES EL LA CONDICION PARA LA SUMA DE LOS NUMEROS NEGATIVOS Y POSITIVOS
        
        //calcular y mostrar las medias
        if (pos != 0) {
        	System.out.println("Media Positivos: "+sumaPos/pos);//DEFINICION DE RESULTADO
        }else {//POR LO CONTRARIO
        	System.out.println("No ha introducido positivos");//DEFINICION DE RESULTADO
        }
        if (neg != 0){//DIFERENTE DE 0
        	System.out.println("Media Negativos: "+sumaNeg/neg);//DEFINICION DE RESULTADO
        }else{//POR LO CONTTRARIO
        	System.out.println("No ha introducido negativos");//DEFINICION DE RESULTADO
        }
	}
}
