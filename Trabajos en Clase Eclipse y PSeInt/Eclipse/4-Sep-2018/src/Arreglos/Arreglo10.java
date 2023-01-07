package Arreglos;
import java.util.Scanner;
//PROGRAMA QUE PIDE 9 VALORES SEAN POSITIVOS O NEGATIVOS, Y CALCULA EL PROMEDIO DE AMBOS POR SEPARADO
public class Arreglo10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i, pos=0, neg=0;//contadores de los numeros positivos y negativos
		int numeros[] = new int[10];//Array que contendrá los números leídos
		double sumaPos=0, sumaNeg=0;//acumuladores para la suma de los negativos
		System.out.println("Lectura de los elementos del array: ");
		for(i=0; i<10; i++){
			System.out.print("Números["+i+"]= " );
			numeros[i] = entrada.nextInt();
		}
		//Recorrer el array para sumar por separados los números positivos y negativos
		for(i=0; i<10; i++){
			if(numeros[i]>0)
			{//sumar positivos
				sumaPos += numeros[i];//sumaPos = sumaPos + numeros[i]
				pos++;
			}
			else if(numeros[i]<0){
				sumaNeg += numeros[i];
				neg++;
			}
		}
		//calcular y mostrar las medias
			if(pos != 0){
				System.out.println("Media de los positivos = " + sumaPos/pos);
			}else{
				System.out.println("No ha introducido positivos");
			}
			if(neg != 0){
				System.out.println("Media de los negativos = " + sumaNeg/neg);
			}else{
				System.out.println("No ha introducido negativos");
			}		
	}
}