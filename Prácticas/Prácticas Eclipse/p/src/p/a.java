//JOSÉ ALFREDO GARCÍA AGUILAR
package p;
import java.util.Scanner;
//PROGRAMA QUE ME PIDE INSERTAR UN NÚMERO DE COMIDA DE UN MENÚ, CUÁNTAS PORCIONES QUIERO DE ESA COMIDA,
//CON CUÁNTO PAGO, Y AL FINAL ME IMPRIME CUÁNTO ES MI CAMBIO
public class a {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("MENÚ DE COMIDA");
		System.out.println("1)Tacos");
		System.out.println("2)Enchiladas");
		System.out.println("3)Pozole");
		System.out.println("4)Menudo");
		System.out.println("5)Gorditas");
		System.out.println("6)Molletes");
		System.out.println("7)Orden de Birria");
		System.out.println("8)Torta de Cochinita");
		System.out.println("9)Huevos");
		System.out.println("10)Orden de Arrachera");
		System.out.println("**********");
		System.out.print("¡Elige una Comida del Menú escribiendo su número!: ");
		int alimento = entrada.nextInt();
		
		if(alimento == 1)
		{
			System.out.println("Tacos");
			System.out.println("Precio por Taco: $20");
			System.out.print("¿Cuántos tacos vas a querer?: ");
			double numero_de_tacos = entrada.nextDouble();
			System.out.print("¿Con cuánto pagas?: ");
			double pago = entrada.nextDouble();
			double cambio = pago - (20 * numero_de_tacos);
			System.out.println("Tu cambio es: $" + cambio);
			System.out.println("¡Provecho!");
		}
		if(alimento == 2)
		{
			System.out.println("Enchiladas");
			System.out.println("Precio por Enchilada: $18");
			System.out.print("¿Cuántas enchiladas vas a querer?: ");
			double numero_de_enchiladas = entrada.nextDouble();
			System.out.print("¿Con cuánto pagas?: ");
			double pago = entrada.nextDouble();
			double cambio = pago - (18 * numero_de_enchiladas);
			System.out.println("Tu cambio es: $" + cambio);
			System.out.println("¡Provecho!");
		}
		if(alimento == 3)
		{
			System.out.println("Pozole");
			System.out.println("Precio por Plato de Pozole: $90");
			System.out.print("¿Cuántos platos de Pozole vas a querer?: ");
			double numero_de_platos_de_pozole = entrada.nextDouble();
			System.out.print("¿Con cuánto pagas?: ");
			double pago = entrada.nextDouble();
			double cambio = pago - (90 * numero_de_platos_de_pozole);
			System.out.println("Tu cambio es: $" + cambio);
			System.out.println("¡Provecho!");
		}
		if(alimento == 4)
		{
			System.out.println("Menudo");
			System.out.println("Precio por Plato de Menudo: $90");
			System.out.print("¿Cuántos platos de Menudo vas a querer?: ");
			double numero_de_platos_de_menudo = entrada.nextDouble();
			System.out.print("¿Con cuánto pagas?: ");
			double pago = entrada.nextDouble();
			double cambio = pago - (90 * numero_de_platos_de_menudo);
			System.out.println("Tu cambio es: $" + cambio);
			System.out.println("¡Provecho!");
		}
		if(alimento == 5)
		{
			System.out.println("Gorditas");
			System.out.println("Precio por Gordita: $20");
			System.out.print("¿Cuántas Gorditas vas a querer?: ");
			double numero_de_gorditas = entrada.nextDouble();
			System.out.print("¿Con cuánto pagas?: ");
			double pago = entrada.nextDouble();
			double cambio = pago - (20 * numero_de_gorditas);
			System.out.println("Tu cambio es: $" + cambio);
			System.out.println("¡Provecho!");
		}
		if(alimento == 6)
		{
			System.out.println("Molletes");
			System.out.println("Precio por Mollete: $15");
			System.out.print("¿Cuántos Molletes vas a querer?: ");
			double numero_de_molletes = entrada.nextDouble();
			System.out.print("¿Con cuánto pagas?: ");
			double pago = entrada.nextDouble();
			double cambio = pago - (15 * numero_de_molletes);
			System.out.println("Tu cambio es: $" + cambio);
			System.out.println("¡Provecho!");
		}
		if(alimento == 7)
		{
			System.out.println("Orden de Birria");
			System.out.println("Precio por Orden de Birria: $100");
			System.out.print("¿Cuántas ordenes de Birria vas a querer?: ");
			double numero_de_ordenes_de_birria = entrada.nextDouble();
			System.out.print("¿Con cuánto pagas?: ");
			double pago = entrada.nextDouble();
			double cambio = pago - (100 * numero_de_ordenes_de_birria);
			System.out.println("Tu cambio es: $" + cambio);
			System.out.println("¡Provecho!");
		}
		if(alimento == 8)
		{
			System.out.println("Torta de Cochinita");
			System.out.println("Precio por Torta de Cochinita: $45");
			System.out.print("¿Cuántos platos de Menudo vas a querer?: ");
			double numero_de_tortas_de_cochinita = entrada.nextDouble();
			System.out.print("¿Con cuánto pagas?: ");
			double pago = entrada.nextDouble();
			double cambio = pago - (45 * numero_de_tortas_de_cochinita);
			System.out.println("Tu cambio es: $" + cambio);
			System.out.println("¡Provecho!");
		}
		if(alimento == 9)
		{
			System.out.println("Huevos");
			System.out.println("Precio por Huevo: $20");
			System.out.print("¿Cuántos Huevos vas a querer?: ");
			double numero_de_huevos = entrada.nextDouble();
			System.out.print("¿Con cuánto pagas?: ");
			double pago = entrada.nextDouble();
			double cambio = pago - (20 * numero_de_huevos);
			System.out.println("Tu cambio es: $" + cambio);
			System.out.println("¡Provecho!");
		}
		if(alimento == 10)
		{
			System.out.println("Orden de Arrachera");
			System.out.println("Precio por Orden de Arrachera: $250");
			System.out.print("¿Cuántas Ordenes de Arrachera vas a querer?: ");
			double numero_de_ordenes_de_arrachera = entrada.nextDouble();
			System.out.print("¿Con cuánto pagas?: ");
			double pago = entrada.nextDouble();
			double cambio = pago - (250 * numero_de_ordenes_de_arrachera);
			System.out.println("Tu cambio es: $" + cambio);
			System.out.println("¡Provecho!");
		}
		if(alimento <= 0)
		{
			System.out.print("ERROR. Prueba de nuevo");
		}
		if(alimento > 10)
		{
			System.out.print("ERROR. Prueba de nuevo");
		}
	}
}
//JOSÉ ALFREDO GARCÍA AGUILAR