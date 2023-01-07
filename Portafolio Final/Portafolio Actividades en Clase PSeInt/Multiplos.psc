Algoritmo Múltiplos
	Definir clave,rango,n,num Como Entero
	clave <- 3
	rango <- 999
	n <- azar(rango)+1
	Para i<-0 Hasta n Hacer
		num <- azar(rango)+1
		Si num MOD clave=0 Entonces
			Escribir ' '
		FinSi
		Escribir ' ',num Sin Saltar
	FinPara
FinAlgoritmo

