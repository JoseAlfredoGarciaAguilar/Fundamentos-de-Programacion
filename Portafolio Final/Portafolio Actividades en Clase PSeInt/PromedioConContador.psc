Algoritmo PromedioConContador
	Definir numero_de_calificaciones,contador Como Entero
	Definir suma,c,prom Como Real
	Escribir '�Cu�ntas calificaciones quieres leer?: '
	Leer numero_de_calificaciones
	contador <- 1
	suma <- 0
	c <- 0
	Mientras contador<=numero_de_calificaciones Hacer
		Escribir 'Ingresa la Calificaci�n ',contador,': '
		Leer c
		contador <- contador+1
		suma <- suma+c
	FinMientras
	Escribir 'Sal� del bucle'
	prom <- suma/numero_de_calificaciones
	Escribir 'Promedio = ',prom
FinAlgoritmo

