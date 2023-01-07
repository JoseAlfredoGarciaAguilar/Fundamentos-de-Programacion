package EstructuraControl;
//PROGRAMA QUE IMPRIME NÚMEROS DE 1 EN 1 AL 9, Y DESPUÉS DE 2 EN 2 AL 9
public class BucleFor {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		
		int i = 0;
		while(i<10)
		{
			System.out.println(i);
			i++;
		}
		int y;
		for(y=1; y<10;y+=2)
		{
			System.out.println("Valor de y = " + y);
		}
		
		y = 1;
		while(y<10)
		{
			System.out.println("Valor de y = " + y);
			y+=2;
		}
	}
}