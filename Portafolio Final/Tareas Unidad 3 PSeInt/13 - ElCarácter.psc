Algoritmo ElCaracter
	Definir code Como Entero
	Escribir 'Proporciona un c�digo num�rico de dos o tres d�gitos: '
	Leer code
	Si code>=30 Y code<=39 Entonces
		Escribir 'El c�digo introducido es un Dato Num�rico'
	SiNo
		Si code>=65 Y code<=90 Entonces
			Escribir 'El c�digo introducido es un Dato Alfab�tico, de letras May�sculas'
		SiNo
			Si code>=97 Y code<=122 Entonces
				Escribir 'El c�digo introducido es un Dato Alfab�tico, de letras Min�sculas'
			SiNo
				Si code=44 Entonces
					Escribir 'El c�digo introducido es un D�gito de Puntuaci�n'
				SiNo
					Si code=46 Entonces
						Escribir 'El c�digo introducido es un D�gito de Puntuaci�n'
					SiNo
						Escribir 'El c�digo introducido es un Dato no Imprimible'
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
