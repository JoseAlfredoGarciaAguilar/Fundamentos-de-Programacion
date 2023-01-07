Algoritmo ParesEImpares
	Definir i,j,n,aux,pares,impares,pantallas Como Entero
	pantallas <- 0
	Escribir 'Tienen igual suma de pares e impares: '
	Para i<-1000 Hasta 10000 Hacer
		pares <- 0
		impares <- 0
		Para j<-0 Hasta 0 Hacer
			aux <- n MOD 10
			Si (aux MOD 2=0) Entonces
				pares <- pares+aux
			SiNo
				impares <- impares+aux
				n <- i/10
			FinSi
		FinPara
		Si (pares=impares) Entonces
			Escribir ' ',i Sin Saltar
			pantallas <- pantallas+1
		FinSi
		Si (pantallas=11) Entonces
			Escribir ' '
			pantallas <- 0
		FinSi
	FinPara
FinAlgoritmo

