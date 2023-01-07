package Tarea4;
//PROGRAMA QUE IMPRIME EN ESCALERA LOS NÚMEROS DEL 1 AL 4 Y EN VICEVERSA
public class Problema1 {
	
	public static void main(String[]args){
		for(int i=0;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println(" ");
	}
		for(int i=4;i>=1;i--){
			for(int j=1;j<i;j++){
				System.out.print(j);
			}
			System.out.println(" ");
	}
	}
}