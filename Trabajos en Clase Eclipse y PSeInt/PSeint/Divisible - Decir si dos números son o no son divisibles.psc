Algoritmo Divisible
	// Variables de entrada
	Definir a Como Entero
	Definir b Como Entero
	// Variables de salida
	Definir mensaje Como Caracter
	// Variable intermedia
	Definir residuo Como Entero
	Escribir 'Escribe un n�mero entero: '
	Leer a
	Escribir 'Escribe otro n�mero entero: '
	Leer b
	residuo <- a MOD b //  MOD  significa m�dulo o residuo
	Si (residuo==0) Entonces
		mensaje <- 'Los n�meros son divisibles'
		Escribir mensaje
	SiNo
		mensaje <- 'Los n�meros no son divisibles'
		Escribir mensaje
	FinSi
FinAlgoritmo

