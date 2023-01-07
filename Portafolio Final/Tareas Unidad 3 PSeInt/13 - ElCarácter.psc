Algoritmo ElCaracter
	Definir code Como Entero
	Escribir 'Proporciona un código numérico de dos o tres dígitos: '
	Leer code
	Si code>=30 Y code<=39 Entonces
		Escribir 'El código introducido es un Dato Numérico'
	SiNo
		Si code>=65 Y code<=90 Entonces
			Escribir 'El código introducido es un Dato Alfabético, de letras Mayúsculas'
		SiNo
			Si code>=97 Y code<=122 Entonces
				Escribir 'El código introducido es un Dato Alfabético, de letras Minúsculas'
			SiNo
				Si code=44 Entonces
					Escribir 'El código introducido es un Dígito de Puntuación'
				SiNo
					Si code=46 Entonces
						Escribir 'El código introducido es un Dógito de Puntuación'
					SiNo
						Escribir 'El código introducido es un Dato no Imprimible'
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
