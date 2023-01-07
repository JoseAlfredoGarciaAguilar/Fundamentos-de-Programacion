package Tarea3;

public class Problema1 {
    public static void main(String[] args) {
    	int pisos = 7;
    	int[]arreglo = new int[1];
    	for(int i=1; i<=pisos;i++) {
    		int[]pascal = new int[i];
    		for(int j=pisos; j>i; j--){
    			System.out.print(" ");	
    		}
    		for(int k=0; k<i; k++) {
    			if(k==0 || k==(i-1)){
    				pascal[k]=1;
    			}
    			else{
    				pascal[k]=arreglo[k]+arreglo[k-1];
    			}
    			System.out.print(" " + pascal[k] + " ");
    		}
    		arreglo=pascal;
    		System.out.println();
    	}
    }
}