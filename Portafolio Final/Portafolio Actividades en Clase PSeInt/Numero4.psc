Algoritmo Numero4
	Definir num,rango1,rango2,rango3 Como Entero
	rango1 <- 0
	rango2 <- 0
	rango3 <- 0
	Para i<-0 Hasta 100 Hacer
		num <- azar(10)*9
		Si num>50 Entonces
			rango1 <- rango1+1
		FinSi
		Si num>10 Entonces
			rango2 <- rango2+1
		FinSi
		Si num<=10 Entonces
			rango3 <- rango3+1
		FinSi
	FinPara
	Escribir 'Mayores que 50: ',rango1
	Escribir 'Menores que 50 pero mayores que 10: ',rango2
	Escribir 'Menores que 10: ',rango3
FinAlgoritmo

