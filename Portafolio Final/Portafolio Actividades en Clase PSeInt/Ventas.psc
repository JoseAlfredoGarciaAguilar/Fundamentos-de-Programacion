Algoritmo Ventas
	Definir i,j,suma,total Como Entero
	Dimension venta[5,4]
	Para i<-0 Hasta v Hacer
		Escribir 'Ventas Zona: ',(i+1)
		Para j<-0 Hasta v Hacer
			Escribir 'Trimestre ',(j+1),':'
			Leer v
		FinPara
	FinPara
	suma <- 0
	total <- 0
	Para i<-0 Hasta a Hacer
		suma <- 0
		suma <- suma+a
		total <- total+a
		// Imprimir total
		Escribir 'Total Zona ',(i+1),' = ',suma
	FinPara
	Escribir 'TOTALES = ',total
	suma <- 0
	Para i<-0 Hasta a Hacer
		suma <- 0
		Para j<-0 Hasta a Hacer
			suma <- suma+a
		FinPara
		Escribir 'Total por Trimestre ',(i+1),' = ',suma
	FinPara
FinAlgoritmo

