Algoritmo Problema4
	Definir i,j,k,primero,segund,tercero Como Entero
	Dimension primero[21]
	Dimension segund[21]
	Dimension tercero[7,8]
	Para i<-0 Hasta 10 Hacer
		primero[i] <- i+3
		Leer j
		Leer k
		Para i<-j Hasta k Hacer
			Escribir primero[i+1]
		FinPara
	FinPara
FinAlgoritmo

