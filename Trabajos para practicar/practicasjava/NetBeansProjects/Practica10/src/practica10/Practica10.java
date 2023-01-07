//Escribe un programa que presente un menú de opciones y obtenga el área de la figura,
//después de leer los valores necesarios:1 triángulo, 2 cuadrado, 3 circulo, 4 rectángulo y 5 salir.
package practica10;

import java.util.Scanner;

public class Practica10 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int figura = 0;
        do {
            System.out.println("1 Triangulo");
            System.out.println("2 Cuadrado");
            System.out.println("3 Circulo");
            System.out.println("4 Rectangulo");
            System.out.println("**5 Salir**");
            System.out.println("Obtenga el area insertando el numero de la figura");
            figura = in.nextInt();

            switch (figura) {
                case 1:
                    System.out.println("Dame la base");
                    double base = in.nextDouble();
                    System.out.println("Dame la altura");
                    double altura = in.nextDouble();
                    double triangulo = (base * altura) / 2;
                    System.out.println("El area del triangulo es: " + triangulo);
                    break;
                case 2:
                    System.out.println("Dame el lado");
                    int lado = in.nextInt();
                    int cuadrado = lado * lado;
                    System.out.println("El area del cuadrado es: " + cuadrado);
                    break;
                case 3:
                    double pi = 3.1416;
                    System.out.println("Dame el radio");
                    double radio = in.nextDouble();
                    double circulo = (Math.pow(radio, 2)) * pi;
                    System.out.println("El area del circulo es:  cm2" + circulo);
                    break;
                case 4:
                    System.out.println("Dame la base");
                    double b = in.nextDouble();
                    System.out.println("Dame la altura");
                    double a = in.nextDouble();
                    double rectangulo = b * a;
                    System.out.println("El area del rectangulo es: " + rectangulo);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("ERROR");
                    System.out.println("Selecciona solo del 1 al 5");
            }
        } while (figura != 5);
        {

        }

    }

}
