package EstruturasControl;

public class Bucle5 {

	public static void main(String[] args) {
		char car = 'a';
		do
		{
			System.out.print(car+" ");
			car++;
		}while ( car<='z');
		char car1='a';
		while (car1<='z'){
				System.out.print(car1+ " ");
				car1++;
	}		
		int pot = 1;
		do 
		{
			System.out.println(pot);
			pot *= 2;//pot = pot*2
		}while (pot<1000);
	}

}
