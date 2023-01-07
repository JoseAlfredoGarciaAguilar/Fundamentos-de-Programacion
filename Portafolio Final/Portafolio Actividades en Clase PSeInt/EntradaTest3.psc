Algoritmo EntradaTest3
	Definir text,num Como Caracter
	Definir entero_corto,enter,largo,num3 Como Entero
	Definir bite,flotante,doble,num2,num4 Como Entero
	Definir logic Como Logico
	Escribir 'Introduce un texto: '
	Leer text
	Escribir 'Introduce un entero corto: '
	Leer entero_corto
	Escribir 'Introduce un byte: '
	Leer bite
	Escribir 'Introduce un entero: '
	Leer enter
	Escribir 'Introduce un Real tipo Float: '
	Leer flotante
	Escribir 'Introduce un Real tipo Double: '
	Leer doble
	Escribir 'Introduce un entero largo: '
	Leer largo
	Escribir 'Introduce un boleano: '
	Leer logic
	Escribir 'Introduce un número doble: '
	Leer num
	num2 <- (num/1000)*999
	Escribir num2*1.15
	num3 <- TRUNC(num)
	Escribir num3*2
	num4 <- (num/1000)*999
FinAlgoritmo

