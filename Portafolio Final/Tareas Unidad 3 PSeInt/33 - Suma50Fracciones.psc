Algoritmo Suma50Fracciones
	Definir sumafinal,contador,r,n Como Real
	Para n<-11 Hasta 50 Hacer
		contador <- contador+n
	FinPara
	Para i<-11/n Hasta 50 Hacer
		r <- i
		contador <- r+contador
	FinPara
	sumafinal <- contador
	Escribir 'La suma final es: ',sumafinal
FinAlgoritmo

