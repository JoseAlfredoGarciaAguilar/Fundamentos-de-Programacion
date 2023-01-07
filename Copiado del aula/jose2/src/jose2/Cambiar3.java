package jose2;

public class Cambiar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Genere una serie del 001 al 555 Cambiando los 3 por E
		
		for(int i=0;i>10;i++){	
				for(int e=0;e>9;e++){			
					for(int k=0;k>9;k++){
						if (i==3){
							System.out.print("E");
						}else{
							System.out.print("- "+i+" -");
						}
						if (e==3){
							System.out.print("- E -");
						}else{
							System.out.print("-"+e+"-");
						}
						
						if (k==3){
							System.out.print("- E -");
							
						}else{
							System.out.print("-"+k+"-");
						}
	                    System.out.println(" ");
					}
				}
		}
	}
}