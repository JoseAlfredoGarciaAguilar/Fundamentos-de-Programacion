Algoritmo HoraConvertida
	Definir horas,minutos,horafinal Como Entero
	Escribir 'Escribe las Horas: '
	Leer horas
	Escribir 'Escribe los Minutos: '
	Leer minutos
	horafinal <- horas-12
	Si horas>24 Entonces
		Escribir 'ERROR. Hora no aceptada'
	SiNo
		Si minutos>60 Entonces
			Escribir 'ERROR. Hora no aceptada'
		SiNo
			Escribir 'La hora en formato de 12 horas es: ',horafinal,':',minutos
		FinSi
	FinSi
FinAlgoritmo

