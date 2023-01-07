package EstructuraSeleccion;
//PROGRAMA QUE IMPRIME UN NÚMERO DETERMINADO DE ASTERISCOS
public class BuclesAsteriscos {
	public static void main(String[]args){
		int contador = 0; //Proceso de inicialización
		final int N = 20;
		while(contador<N) //Prueba condición
		{
			System.out.print(" * ");
			contador++;
		}//Fin del bucle
		/*
		 * 1-Inicialización. Se establece contador a un valor inicial
		 * antes de que se alcance la sentencia while, aunque podría
		 * ser cualquiera,generalmente es 0.
		 * 2-Prueba/Condición. Se comprueba el valor de contador, antes
		 * de la iteración; es decir el comienzo de la repetición
		 * de cada bucle.
		 * 3-Actualización. Durante cada iteración, contador actualiza su
		 * valor incrementando en uno mediante el operador ++
		 */
	}
}