package EstructuraControl;
//PROGRAMA QUE IMPRIME LOS NÚMEROS DEL 10 AL 0 EN REVERSA
public class Bucles2 {

	public static void main(String[] args) {
		int y = 10;
		while(y >=0)
		{
			System.out.println("Y: " + y);
			y--;
		}
		bucle2();
	}
	public static void bucle2(){
		int contador = 0; //Inicialización
		while(contador < 10)
		{
			System.out.println("Contador = " + contador);
			contador = contador + 2;
		}
	}
}