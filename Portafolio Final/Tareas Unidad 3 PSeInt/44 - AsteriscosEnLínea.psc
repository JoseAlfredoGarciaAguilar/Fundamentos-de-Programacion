Algoritmo AsteriscosEnLínea
	Definir base,i,espacio,asterisco Como Entero
	Escribir 'Ingresa la base: '
	Leer base
	Para i<-1 Hasta base Hacer
		Para espacio<-1 Hasta base-i Hacer
			Escribir ' ' Sin Saltar
		FinPara
		Para asterisco<-1 Hasta i Hacer
			Escribir '* ' Sin Saltar
		FinPara
		Escribir ' '
	FinPara
FinAlgoritmo

