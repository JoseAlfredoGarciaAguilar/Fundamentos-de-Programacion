Funcion Hola
	Escribir 'Hola Mundo, ya llegue'
FinFuncion

Funcion Doble(X)
	Definir V1 Como Real
	V1 <- X*2
	Escribir 'Valor Doble = ',V1
FinFuncion

Funcion a <- Triple(X)
	Definir V1 Como Real
	V1 <- X*3
	a <- V1
FinFuncion

Algoritmo Funciones
	Definir a Como Real
	Definir B Como Real
	Escribir 'Dame valor de A='
	Leer a
	Hola
	// Escribir "Regresé de la Función Hola"
	Hola
	Doble(a)
	B <- Triple(a)
	Escribir 'Valor triple = ',B
FinAlgoritmo

