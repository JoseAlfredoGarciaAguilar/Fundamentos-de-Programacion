Algoritmo Problema5
	Definir i,j,k,primero,segund,tercero Como Entero
	Dimension primero[21]
	Dimension segund[21]
	Dimension tercero[7,8]
	Para i<-0 Hasta 12 Con Paso 2 Hacer
		Leer primero[i]
		Para j<-0 Hasta 5 Hacer
			segund[j] <- primero[2*j]+j
			Para k<-3 Hasta 7 Hacer
				Escribir primero[k+1],' ',segund[k-1]
			FinPara
		FinPara
	FinPara
FinAlgoritmo

