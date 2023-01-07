Algoritmo Divisible
	// Variables de entrada
	Definir a Como Entero
	Definir b Como Entero
	// Variables de salida
	Definir mensaje Como Caracter
	// Variable intermedia
	Definir residuo Como Entero
	Escribir 'Escribe un número entero: '
	Leer a
	Escribir 'Escribe otro número entero: '
	Leer b
	residuo <- a MOD b //  MOD  significa módulo o residuo
	Si (residuo==0) Entonces
		mensaje <- 'Los números son divisibles'
		Escribir mensaje
	SiNo
		mensaje <- 'Los números no son divisibles'
		Escribir mensaje
	FinSi
FinAlgoritmo

