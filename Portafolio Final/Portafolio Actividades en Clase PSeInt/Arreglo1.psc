Algoritmo Arreglo1
	Definir aumento,total,s,a Como Real
	Dimension nombre[3]
	nombre[0] <- 'HUGO'
	nombre[1] <- 'PACO'
	nombre[2] <- 'LUIS'
	Para i<-0 Hasta 3 Hacer
		Escribir nombre[i]
	FinPara
	nombre[1] <- nombre[1]+' ARMENTA'
	Escribir nombre[1]
	Dimension mes[12]
	mes[0] <- 31
	mes[1] <- 28
	mes[2] <- 31
	mes[3] <- 30
	mes[4] <- 31
	mes[5] <- 30
	mes[6] <- 31
	mes[7] <- 31
	mes[8] <- 30
	mes[9] <- 31
	mes[10] <- 30
	mes[11] <- 31
	Dimension mes[12]
	mes[0] <- 31
	mes[1] <- 28
	mes[2] <- 31
	mes[3] <- 30
	mes[4] <- 31
	mes[5] <- 30
	mes[6] <- 31
	mes[7] <- 31
	mes[8] <- 30
	mes[9] <- 31
	mes[10] <- 30
	mes[11] <- 31
	Para i<-0 Hasta 12 Hacer
		Escribir mes[i]
	FinPara
	Dimension sueldo[5]
	Para i<-0 Hasta 5 Hacer
		sueldo[i] <- i
	FinPara
	Para i<-0 Hasta 5 Hacer
		Escribir sueldo[i]=i
	FinPara
	Para i<-0 Hasta 5 Hacer
		Escribir 'Proporciona sueldo [',i,'] = '
		Leer sueldo[i]
	FinPara
	Para i<-5 Hasta 0 Con Paso -1 Hacer
		Escribir 'Sueldo [',i,'] = '
		Escribir sueldo[i]
	FinPara
	aumento <- 0.5
	Para i<-0 Hasta 5 Hacer
		sueldo[i] <- sueldo[i]+sueldo[i]*aumento
	FinPara
	Escribir 'NUEVOS SUELDOS'
	Para i<-0 Hasta 5 Hacer
		Escribir sueldo[i]
	FinPara
	total <- 0
	Para i<-0 Hasta 5 Hacer
		total <- total+sueldo[i]
	FinPara
	Escribir 'Total Sueldo = ',total
	Escribir 'TOTALES SUELDO = ',s
FinAlgoritmo

Funcion totales(a)
	total <- 0
	Para i<-0 Hasta a Hacer
		total <- total+a[i]
	FinPara
	Escribir total
FinFuncion

