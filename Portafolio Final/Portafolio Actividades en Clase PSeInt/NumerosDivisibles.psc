Algoritmo NumerosDivisibles
	Definir a,b Como Entero
	Definir residuo Como Entero
	Escribir 'Escribe un n�mero entero: '
	Leer a
	Escribir 'Escribe otro n�mero entero: '
	Leer b
	residuo <- a MOD b
	Si residuo=0 Entonces
		Escribir a,' es divisible entre ',b
	SiNo
		Escribir a,' no es divisible entre ',b
	FinSi
FinAlgoritmo

