Algoritmo CualEsElNumeroMayor
	// PROGRAMA QUE AL INSERTAR 3 N�MEROS ME IMPRIMA CUAL ES EL MAYOR
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
	Escribir 'El n�mero mayor es: ',Mayor
FinAlgoritmo

