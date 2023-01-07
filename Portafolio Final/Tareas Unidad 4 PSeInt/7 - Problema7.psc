Algoritmo Problema7
	Definir i,j,k,primero,segund,tercero Como Entero
	Dimension primero[21]
	Dimension segund[21]
	Dimension tercero[7,8]
	Para i<-0 Hasta 3 Hacer
		tercero[i,j]<-i+j+1
		Para i<-0 Hasta 3 Hacer
			j <- 2
			Mientras j<12 Hacer
				Escribir i,' ',j,' ',tercero[i,j]
			FinMientras
		FinPara
	FinPara
FinAlgoritmo

