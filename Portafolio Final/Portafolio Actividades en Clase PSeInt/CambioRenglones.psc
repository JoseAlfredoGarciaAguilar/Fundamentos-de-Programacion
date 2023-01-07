Algoritmo CambioRenglones
	Definir renglon,columna Como Entero
	Dimension a[3]
	a[0] <- 1
	a[1] <- 2
	a[2] <- 3
	a[3] <- 4
	a[4] <- 5
	a[5] <- 6
	Dimension b[3,2]
	Para renglon<-0 Hasta 5 Hacer
		Para columna<-0 Hasta a[renglon] Hacer
			b[3,2]<-a[3]
		FinPara
	FinPara
	Para renglon<-0 Hasta 3 Hacer
		Para columna<-0 Hasta 2 Hacer
			Escribir b[3,2],' '
		FinPara
		Escribir ' '
	FinPara
FinAlgoritmo

