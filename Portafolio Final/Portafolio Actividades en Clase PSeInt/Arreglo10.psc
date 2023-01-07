Algoritmo Arreglo10
	Definir i,pos,neg,num,sumaPos,sumaNeg Como Entero
	pos <- 0
	neg <- 0
	Dimension num[10]
	sumaNeg <- 0
	sumaPos <- 0
	Escribir 'Lectura de los elementos del array: '
	Para i<-0 Hasta 10 Hacer
		Escribir 'Números [',i,']= '
		Leer num[i]
	FinPara
	// Recorrer el array para sumar por separados los números positivos y negativos
	Para i<-0 Hasta 10 Con Paso 1 Haer Hacer
		Si num[i]>0 Entonces
			// sumar positivos
			sumaPos <- sumaPos+num[i] // sumaPos = sumaPos + numeros[i]
			pos <- pos+1
		SiNo
			Si num[i]<0 Entonces
				sumaNeg <- sumaNeg+num[i]
				neg <- neg+1
			FinSi
		FinSi
	FinPara
	// calcular y mostrar las medias
	Si pos!=0 Entonces
		Escribir 'Media de los positivos = ',sumaPos
	SiNo
		Escribir 'No ha introducido positivos'
	FinSi
	Si neg!=0 Entonces
		Escribir 'Media de los negativos = ',sumaNeg
	SiNo
		Escribir 'No ha introducido negativos'
	FinSi
FinAlgoritmo

