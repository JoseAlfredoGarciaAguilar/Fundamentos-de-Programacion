Algoritmo Triangulo
	Definir num_lineas,cuenta_asteriscos Como Entero
	Definir blanco,asterisco Como Caracter
	num_lineas <- 5
	blanco <- ' '
	asterisco <- '*'
	Escribir ' '
	// bucle externo
	Para fila<-1 Hasta num_lineas Hacer
		Escribir ' '
		// primer bucle interno: escribe espacios
		Para blancos<-num_lineas-fila Hasta 0 Con Paso -1 Hacer
			Escribir blanco Sin Saltar
		FinPara
		Para cuenta_asteriscos<-1 Hasta fila*2 Con Paso cuenta_asteriscos Hacer
			Escribir asterisco Sin Saltar
		FinPara
		Escribir ' '
	FinPara // fin del bucle externo
FinAlgoritmo

