Algoritmo CualEsElNumeroMayor2
	// PROGRAMA QUE AL INSERTAR 3 N�MEROS, IMPRIMA CUAL ES EL MAYOR
	// Variable de entrada
	Definir A,B,C Como Real
	// Variable de salida
	Definir Mayor Como Real
	Escribir 'Ingresa un n�mero:'
	Leer A
	Escribir 'Ingresa otro n�mero:'
	Leer B
	Escribir 'Ingresa alg�n otro n�mero:'
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
	Escribir 'El n�mero mayor es: ',Mayor
FinAlgoritmo

