Algoritmo CalculadoraB�sica
	Definir eleccion Como Caracter
	Definir num,otro_numero,resultado_suma,resultado_resta,resultado_multiplicacion,resultado_division,residuo_de_la_division Como Real
	Escribir '**************'
	Escribir '+ Suma'
	Escribir '- Resta'
	Escribir '* Multiplicaci�n'
	Escribir '/ Divisi�n'
	Escribir '% Residuo de la Divisi�n'
	Escribir 'Elige una operaci�n a realizar, ingresando su s�mbolo: '
	Leer eleccion
	Segun eleccion  Hacer
		'+':
			Escribir 'Suma'
		'-':
			Escribir 'Resta'
		'*':
			Escribir 'Multiplicaci�n'
		'/':
			Escribir 'Divisi�n'
		'%':
			Escribir 'Residuo de la Divisi�n'
	FinSegun
	Si eleccion='+' Entonces
		Escribir 'Escribe un n�mero: '
		Leer num
		Escribir 'Escribe otro n�mero: '
		Leer otro_numero
		resultado_suma <- num+otro_numero
		Escribir 'Resultado de la Suma: ',resultado_suma
	SiNo
		Si eleccion='-' Entonces
			Escribir 'Escribe un n�mero: '
			Leer num
			Escribir 'Escribe otro n�mero: '
			Leer otro_numero
			resultado_resta <- num-otro_numero
			Escribir 'Resultado de la Resta: ',resultado_resta
		SiNo
			Si eleccion='*' Entonces
				Escribir 'Escribe un n�mero: '
				Leer num
				Escribir 'Escribe otro n�mero: '
				Leer otro_numero
				resultado_multiplicacion <- num*otro_numero
				Escribir 'Resultado de la Multiplicaci�n: ',resultado_multiplicacion
			SiNo
				Si eleccion='/' Entonces
					Escribir 'Escribe un n�mero: '
					Leer num
					Escribir 'Escribe otro n�mero: '
					Leer otro_numero
					resultado_division <- num/otro_numero
					Escribir 'Resultado de la Divisi�n: ',resultado_division
				SiNo
					Si eleccion='%' Entonces
						Escribir 'Escribe un n�mero: '
						Leer num
						Escribir 'Escribe otro n�mero: '
						Leer otro_numero
						residuo_de_la_division <- num MOD otro_numero
						Escribir 'Residuo de la Divisi�n: ',residuo_de_la_division
					SiNo
						Escribir 'ERROR. Ese s�mbolo no est� en el men�'
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo

