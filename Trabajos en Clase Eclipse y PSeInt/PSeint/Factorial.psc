Algoritmo Factorial
	// Programa que calcula el factorial de un n�mero al ingresarlo por teclado
	Definir num Como Entero
	Definir facto Como Entero
	Definir i Como Entero
	facto <- 1
	Escribir 'Dame el n�mero de factorial que deseas generar: '
	Leer num
	Para i<-num Hasta 1 Con Paso -1 Hacer
		facto <- facto*i
	FinPara
	Escribir 'Factorial de ',num,' = ',facto
FinAlgoritmo

