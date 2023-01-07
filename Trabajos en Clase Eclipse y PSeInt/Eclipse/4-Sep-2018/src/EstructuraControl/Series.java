package EstructuraControl;

public class Series {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}//fin del bucle interno
			System.out.println();
		}//fin del bucle externo
		for(int i=4;i>0;i--){
			for(int j=1;j<i;j++){
				System.out.print(j);
			}//fin del bucle interno
			System.out.println();
			}
		
		//esto es igual que el programa de arriba
		System.out.println();
		final int N = 20;
		for(int i=1;i<=N;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}//fin del bucle interno
			System.out.println();
		}//fin del bucle externo
		for(int i=N-1;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}//fin del bucle interno
			System.out.println();
			}
	}
}