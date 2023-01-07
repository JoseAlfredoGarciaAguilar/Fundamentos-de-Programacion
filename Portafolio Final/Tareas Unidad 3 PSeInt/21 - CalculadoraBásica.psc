Algoritmo CalculadoraBásica
	Definir eleccion Como Caracter
	Definir num,otro_numero,resultado_suma,resultado_resta,resultado_multiplicacion,resultado_division,residuo_de_la_division Como Real
	Escribir '**************'
	Escribir '+ Suma'
	Escribir '- Resta'
	Escribir '* Multiplicación'
	Escribir '/ División'
	Escribir '% Residuo de la División'
	Escribir 'Elige una operación a realizar, ingresando su símbolo: '
	Leer eleccion
	Segun eleccion  Hacer
		'+':
			Escribir 'Suma'
		'-':
			Escribir 'Resta'
		'*':
			Escribir 'Multiplicación'
		'/':
			Escribir 'División'
		'%':
			Escribir 'Residuo de la División'
	FinSegun
	Si eleccion='+' Entonces
		Escribir 'Escribe un número: '
		Leer num
		Escribir 'Escribe otro número: '
		Leer otro_numero
		resultado_suma <- num+otro_numero
		Escribir 'Resultado de la Suma: ',resultado_suma
	SiNo
		Si eleccion='-' Entonces
			Escribir 'Escribe un número: '
			Leer num
			Escribir 'Escribe otro número: '
			Leer otro_numero
			resultado_resta <- num-otro_numero
			Escribir 'Resultado de la Resta: ',resultado_resta
		SiNo
			Si eleccion='*' Entonces
				Escribir 'Escribe un número: '
				Leer num
				Escribir 'Escribe otro número: '
				Leer otro_numero
				resultado_multiplicacion <- num*otro_numero
				Escribir 'Resultado de la Multiplicación: ',resultado_multiplicacion
			SiNo
				Si eleccion='/' Entonces
					Escribir 'Escribe un número: '
					Leer num
					Escribir 'Escribe otro número: '
					Leer otro_numero
					resultado_division <- num/otro_numero
					Escribir 'Resultado de la División: ',resultado_division
				SiNo
					Si eleccion='%' Entonces
						Escribir 'Escribe un número: '
						Leer num
						Escribir 'Escribe otro número: '
						Leer otro_numero
						residuo_de_la_division <- num MOD otro_numero
						Escribir 'Residuo de la División: ',residuo_de_la_division
					SiNo
						Escribir 'ERROR. Ese símbolo no está en el menú'
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo

