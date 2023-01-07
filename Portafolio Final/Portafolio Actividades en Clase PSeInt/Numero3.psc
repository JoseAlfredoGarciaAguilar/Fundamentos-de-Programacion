Algoritmo Numero3
	Definir num,rango1,rango2,rango3 Como Entero
	rango1 <- 0 // Cuenta mayores de 50
	rango2 <- 0 // Cuenta números entre 10 y 50
	rango3 <- 0 // Cuenta números menores que 10
	Para i<-0 Hasta 100 Hacer
		num <- azar(10)*9
		Escribir 'Número generado: ',num
		Si num>50 Entonces
			rango1 <- rango1+1
		SiNo
			Si num>10 Entonces
				rango2 <- rango2+1
			SiNo
				rango3 <- rango3+1
			FinSi
		FinSi
	FinPara
	Escribir 'Mayores que 50: ',rango1
	Escribir 'Menores que 50 pero mayores que 10: ',rango2
	Escribir 'Menores que 10: ',rango3
FinAlgoritmo

