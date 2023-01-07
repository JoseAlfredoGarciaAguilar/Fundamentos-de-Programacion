Algoritmo Ordenado
	Dimension a[7]
	Para i<-0 Hasta 7 Hacer
		Para j<-i+1 Hasta 7 Hacer
			Si a[i]>a[j] Entonces
				aux <- a[i]
				a[i] <- a[j]
				a[j] <- aux
			FinSi
		FinPara
	FinPara // Fin del ordenamiento
	imprimi(a)
FinAlgoritmo

Funcion imprimi(arreglo)
	Para x<-0 Hasta arreglo Hacer
		Escribir x
	FinPara
FinFuncion
