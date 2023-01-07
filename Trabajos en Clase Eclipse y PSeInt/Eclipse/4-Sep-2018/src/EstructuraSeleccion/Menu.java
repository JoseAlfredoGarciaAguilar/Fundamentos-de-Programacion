package EstructuraSeleccion;

import java.util.Scanner;

public class Menu {
	static Scanner teclado = new Scanner(System.in);
	static double valor1,valor2;

	public static void main(String[] args) {
		OperacionesAritmeticas obj = new OperacionesAritmeticas();
		double resultado;
		System.out.println("\t\t*********************");
		System.out.println("\t\t  MENU DE OPCIONES");
		System.out.println("\t\t*********************");
		System.out.println("\t\t1 sumar               ");
		System.out.println("\t\t2 restar              ");
		System.out.println("\t\t3 multiplicar         ");
		System.out.println("\t\t4 dividir             ");
		System.out.println("\t\t5 salir               ");
		System.out.println("\t\t*********************");
		System.out.println("\t\tDame opcion (1-5)     ");
				int opc = teclado.nextInt();
				if (opc<1 || opc>5)
				{
					System.out.println("opcion invalida ..... intente de nuevo");
					System.exit(0);
				}
				switch (opc){
				case 1://invocar metodo sumar
					System.out.println("Bienvenido a suma");
					pedirDatos();
					resultado = obj.sumar(valor1, valor2);
					imprimirResultado(resultado);
					break;
				case 2://invocar metodo restar
					System.out.println("Bienvenido a resta");
					pedirDatos();
				    resultado = obj.resta(valor1, valor2);
				    imprimirResultado(resultado);
					break;
				case 3: //invocar metodo multiplicar
					System.out.println("Bienvenido a multiplicacion");
					pedirDatos();
					resultado = obj.multiplica(valor1, valor2);
					imprimirResultado(resultado);
					break;
				case 4://invocar metodo dividir
					System.out.println("Bienvenido a dividir");
					pedirDatos();
					resultado = obj.divide(valor1, valor2);
					imprimirResultado(resultado);
					break;
				case 5:
					System.out.println("Sesion finalizada");
					System.exit(0);
				}
			}
			public static void pedirDatos(){
		       System.out.println("Operando 1");
		       valor1 = teclado.nextDouble();
		       System.out.println("Operando 2");
		       valor2 = teclado.nextDouble();
		       
			}
			public static void imprimirResultado(double valor){
				    System.out.print("resultado= ");
				    System.out.printf("%.2f %n", valor);
			}
	}