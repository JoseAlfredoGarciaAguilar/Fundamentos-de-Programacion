Algoritmo Escalera2
	Escribir '¿Hasta qué número quieres la sucesión?: '
	Leer sucesion
	Para i<-0 Hasta sucesion Hacer
		Para j<-1 Hasta 0 Hacer
			Escribir j
		FinPara
		Escribir ' '
	FinPara
	Para i<-sucesion Hasta 1 Con Paso -1 Hacer
		Para j<-1 Hasta sucesion Hacer
			Escribir j
		FinPara
		Escribir ' '
	FinPara
FinAlgoritmo

