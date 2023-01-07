package EstructuraSeleccion;
//PROGRAMA QUE IMPRIME UN N�MERO DETERMINADO DE ASTERISCOS
public class BuclesAsteriscos {
	public static void main(String[]args){
		int contador = 0; //Proceso de inicializaci�n
		final int N = 20;
		while(contador<N) //Prueba condici�n
		{
			System.out.print(" * ");
			contador++;
		}//Fin del bucle
		/*
		 * 1-Inicializaci�n. Se establece contador a un valor inicial
		 * antes de que se alcance la sentencia while, aunque podr�a
		 * ser cualquiera,generalmente es 0.
		 * 2-Prueba/Condici�n. Se comprueba el valor de contador, antes
		 * de la iteraci�n; es decir el comienzo de la repetici�n
		 * de cada bucle.
		 * 3-Actualizaci�n. Durante cada iteraci�n, contador actualiza su
		 * valor incrementando en uno mediante el operador ++
		 */
	}
}