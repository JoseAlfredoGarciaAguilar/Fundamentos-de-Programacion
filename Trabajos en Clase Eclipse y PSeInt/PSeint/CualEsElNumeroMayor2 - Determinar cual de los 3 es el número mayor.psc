Algoritmo CualEsElNumeroMayor2
	// PROGRAMA QUE AL INSERTAR 3 NÚMEROS, IMPRIMA CUAL ES EL MAYOR
	// Variable de entrada
	Definir A,B,C Como Real
	// Variable de salida
	Definir Mayor Como Real
	Escribir 'Ingresa un número:'
	Leer A
	Escribir 'Ingresa otro número:'
	Leer B
	Escribir 'Ingresa algún otro número:'
	Leer C
	Si (A>B Y A>C) Entonces
		Mayor <- A
	FinSi
	Si (B>A Y B>C) Entonces
		Mayor <- B
	FinSi
	Si (C>A Y C>B) Entonces
		Mayor <- C
	FinSi
	Escribir 'El número mayor es: ',Mayor
FinAlgoritmo

