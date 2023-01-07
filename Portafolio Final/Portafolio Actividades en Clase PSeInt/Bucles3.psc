Algoritmo Bucles3
	Definir centinela,nota,cuenta,suma Como Entero
	centinela <- -1
	Escribir 'Introduzca la primera nota: '
	Leer nota
	cuenta <- 0
	suma <- 0
	Mientras nota!=centinela Hacer
		cuenta <- cuenta+1
		suma <- suma+nota // ++ Es un operador de incremento
		Escribir 'Introduzca siguiente nota: '
		Leer nota
	FinMientras
	Escribir 'Final'
	Escribir 'Promedio = ',suma/cuenta
FinAlgoritmo

