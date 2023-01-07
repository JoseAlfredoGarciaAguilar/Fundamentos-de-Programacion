Algoritmo PruebaCompuesta
	Definir num Como Entero
	Escribir 'Introduzca un número entero: '
	Leer num
	// Comparar número a cero
	Si num>0 Entonces
		Escribir num,' es mayor que 0'
		Escribir 'Pruebe de nuevo, introduciendo negativo'
	SiNo
		Si num<0 Entonces
			Escribir num,' es menor que 0'
			Escribir 'Prueba de nuevo, introduciendo positivo'
		SiNo
			Escribir num,' es igual que 0'
			Escribir '¿Por qué no introduce un número negativo?'
		FinSi
	FinSi
FinAlgoritmo

