Funcion factor(k)
	num <- 2
	Mientras k!=1 Hacer
		Si k MOD num=0 Entonces
			k <- k/num
			Escribir num,' '
		SiNo
			num <- num+1
		FinSi
	FinMientras
FinFuncion

Algoritmo DescomposicionFactorial
	Definir numero_a_descomponer,k,num Como Entero
	Escribir 'Escribe el número a factorizar: '
	Leer numero_a_descomponer
	Escribir 'Descomposición factorial de ',numero_a_descomponer,': 1'
	factor(k)
FinAlgoritmo

