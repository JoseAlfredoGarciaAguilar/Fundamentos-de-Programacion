package Arreglos;
//clase ArrayList
/*Agrupa elementos con un arreglo
 * permite acceder a cualquier elemento
 * insertar,borrar a partir de un indice en cualquier posicion
 * sintaxis
 * public ArrayList();
 * public ArrayList(int capacidad);
 * public ArrayList(collection c);
 * Ejemplo:
 * ArrayList a1 = new ArrayList<Estudiantes>;//crea una coleccion de 100 elementos
 * ArrayList<Estudiante> a1 = new ArrayList<Estudiante>; //crea una colecci�n de tipo
 */

import java.util.*;

/*
 * realizar las operaciones: a�adir, eliminar, buscar y reemplazar con ArrayList
 * la coleccion esta formada por cadenas leidas por el teclado.
 * la sentencia va a especificar que la coleccion contiene elementos String
 * una vez formada la collecion se nva a eliminar una cadena concreta y
 * se va a remplazar un elemento que ocupa una posicion central
 */
public class ListaArreglo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> av = new ArrayList<String>();
		String cd;
		System.out.println("Datos de entrada (Adi�s para terminar)");
		do{
			cd = entrada.nextLine();
			if(!cd.equalsIgnoreCase("Adios"))
				av.add(cd);
			else
				break;
		}while(true);
		System.out.println("Lista completa: " + av);
		//eliminar una palabra
		System.out.println("Palabra a eliminar: ");
		cd = entrada.nextLine();
		if(av.remove(cd))
			System.out.println("Palabra borrada, lista actual: " + av);
		else
			System.out.println("No est� en la lista la palabra buscada");
		//reemplaza elementos que est�n en el centro de la lista
		av.set(av.size()/2, "Nueva cadena"); //modifica un elemento de la lista
		System.out.println("Lista Actualizada: " + av);
		//b�squeda por palabra
		System.out.println("B�squeda de una palabra: ");
		cd = entrada.nextLine();
		int k = av.indexOf(cd); // regresa la posici�n que ocupa la palabra, si la encuentra
		if(k>=0)
			System.out.println("Cadena encontrada en la posici�n: " + k);
		else
			System.out.println("No se encuentra en el arreglo");
	}
}