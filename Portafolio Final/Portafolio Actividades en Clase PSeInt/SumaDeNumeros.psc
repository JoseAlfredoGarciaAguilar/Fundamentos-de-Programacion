Algoritmo SumaDeNumeros
	Definir num,producto Como Real
	producto <- 1
	Repetir
		Escribir 'Dame número (999) para terminar: '
		Leer num
		Si num!=999 Entonces
			producto <- producto*num
		FinSi
	Hasta Que num=999
	// fin del bucle
	Escribir 'Producto = ',producto
FinAlgoritmo

