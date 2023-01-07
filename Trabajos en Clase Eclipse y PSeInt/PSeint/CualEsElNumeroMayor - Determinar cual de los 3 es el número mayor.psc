Algoritmo CualEsElNumeroMayor
	// PROGRAMA QUE AL INSERTAR 3 NÚMEROS ME IMPRIMA CUAL ES EL MAYOR
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
	Si (A>B) Entonces
		Si (A<C) Entonces
			Mayor <- A
		SiNo
			Mayor <- C
		FinSi
	SiNo
		Si (B>C) Entonces
			Mayor <- B
		SiNo
			Mayor <- C
		FinSi
	FinSi
	Escribir 'El número mayor es: ',Mayor
FinAlgoritmo

