Algoritmo PruebaCompuesta
	Definir num Como Entero
	Escribir 'Introduzca un n�mero entero: '
	Leer num
	// Comparar n�mero a cero
	Si num>0 Entonces
		Escribir num,' es mayor que 0'
		Escribir 'Pruebe de nuevo, introduciendo negativo'
	SiNo
		Si num<0 Entonces
			Escribir num,' es menor que 0'
			Escribir 'Prueba de nuevo, introduciendo positivo'
		SiNo
			Escribir num,' es igual que 0'
			Escribir '�Por qu� no introduce un n�mero negativo?'
		FinSi
	FinSi
FinAlgoritmo

