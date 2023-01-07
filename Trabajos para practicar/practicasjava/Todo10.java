//Programa que lee la cantidad de articulos a vender en la tienda de todo a $10
// y obtener el total  a pagar con 16% de iva
// Autor: José Carlos Ochoa Taboa

public class Todo10
{
 public static void main(String[] args)
 {
   int precio = 10;
   int jabon, escoba, trapeador, recogedor, subtotal = 0;

   double total = 0;
   System.out.println("¿cuantos jabones quiere comprar?");
    jabon = Keyboard.readInt();
   System.out.println("¿cuantas escobas quiere comprar?");
    escoba = Keyboard.readInt();
   System.out.println("¿cuantos trapeadores quiere comprar?");
    trapeador = Keyboard.readInt();
   System.out.println("¿cuantos recogedores quiere comprar?");
    recogedor = Keyboard.readInt();
    subtotal = (jabon+escoba+trapeador+recogedor)*precio;
    total = subtotal * 1.16;
    System.out.println("El costo total de su compra es: "+ total + "pesos mexicanos");
    }
 }
