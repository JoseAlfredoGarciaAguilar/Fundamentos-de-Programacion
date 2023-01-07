Algoritmo Problema1
	Definir pisos, arreglo, pascal Como Entero
	pisos<-7
	Dimension arreglo[1]
	Para i<-1 Hasta pisos Con Paso 1 Hacer
		Dimension pascal[1]
		Para j<-pisos Hasta i Con Paso -1 Hacer
			Escribir " "
		FinPara
		Para k<-0 Hasta i Con Paso 1 Hacer
		Si (k=0) && (k=(i+1))
			pascal[k]=1
		SiNo
			pascal[k]= arreglo[k]+arreglo[k-1]
		FinSi
		Escribir " ", pascal[k], " "
	FinPara
	FinPara
	arreglo<-pascal
	Escribir " "
FinAlgoritmo
