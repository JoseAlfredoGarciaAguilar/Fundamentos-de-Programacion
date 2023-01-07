package Conversiones;

public class Calor {
	private int x, g, c; //Las variables privadas solo son vistas dentro de la clase
	protected double gr; //Las protegidas son vistas en todo el paquete y en las clases derivadas
	float nt; //No tiene modificador de accesibilidad, entonces es vista desde cualquier archivo o paquete
			//en donde se encuentre
	double calculo(){
		double x=0; //Declaración local
		gr = g * c + x; //Variables gr, gy, c, son visibles por ser de la clase
		return gr;
	}
}
