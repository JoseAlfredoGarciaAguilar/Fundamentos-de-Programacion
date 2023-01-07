Algoritmo Problema6
	Definir i,j,k,primero,segund,tercero Como Entero
	Dimension primero[21]
	Dimension segund[21]
	Dimension tercero[7,8]
	Para j<-0 Hasta 7 Hacer
		Leer primero[j+1]
		i <- 0
		j <- 1
	FinPara
	Mientras (j<6) Y (primero[j-1]<primero[j]) Hacer
		i <- i+1
		j <- j+1
	FinMientras
	Para k<--1 Hasta j+2 Hacer
		Escribir primero[k+1]
	FinPara
FinAlgoritmo

