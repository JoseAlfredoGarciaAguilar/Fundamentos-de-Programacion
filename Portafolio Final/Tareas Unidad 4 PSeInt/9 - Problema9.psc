Algoritmo Problema9
	Definir suma,arreglos,suma_diagonal_principal,suma_de_todos_los_elementos,resultado Como Entero
	Dimension arreglos[21]
	arreglos[1] <- 4
	arreglos[2] <- 0
	arreglos[3] <- 1
	arreglos[4] <- 6
	arreglos[5] <- 7
	arreglos[6] <- 3
	arreglos[7] <- 2
	arreglos[8] <- 1
	arreglos[9] <- -5
	arreglos[10] <- -2
	arreglos[11] <- 4
	arreglos[12] <- 0
	arreglos[13] <- 4
	arreglos[14] <- 6
	arreglos[15] <- 1
	arreglos[16] <- 3
	arreglos[17] <- 9
	arreglos[18] <- -2
	arreglos[19] <- 1
	arreglos[20] <- -4
	Escribir arreglos[1],' ',arreglos[5],' ',arreglos[9],' ',arreglos[13],' ',arreglos[17]
	Escribir arreglos[2],' ',arreglos[6],' ',arreglos[10],' ',arreglos[14],' ',arreglos[18]
	Escribir arreglos[3],' ',arreglos[7],' ',arreglos[11],' ',arreglos[15],' ',arreglos[19]
	Escribir arreglos[4],' ',arreglos[8],' ',arreglos[12],' ',arreglos[16],' ',arreglos[20]
	suma_diagonal_principal <- (arreglos[1]+arreglos[6]+arreglos[11])
	suma_de_todos_los_elementos <- arreglos[1]+arreglos[2]+arreglos[3]+arreglos[4]+arreglos[5]+arreglos[6]+arreglos[7]+arreglos[8]+arreglos[9]+arreglos[10]+arreglos[11]+arreglos[12]+arreglos[13]+arreglos[14]+arreglos[15]+arreglos[16]+arreglos[17]+arreglos[18]+arreglos[19]+arreglos[20]
	resultado <- suma_de_todos_los_elementos-suma_diagonal_principal
	Escribir 'Suma de todos los elementos que no pertenecen a la diagonal principal = ',resultado
FinAlgoritmo

