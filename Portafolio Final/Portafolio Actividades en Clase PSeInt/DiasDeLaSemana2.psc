Algoritmo DíasDeLaSemana2
	Definir numero_de_dia Como Entero
	Escribir 'Escribe el número de día de la semana: '
	Leer numero_de_dia
	Si numero_de_dia==1 Entonces
		Escribir 'Lunes'
	SiNo
		Si numero_de_dia==2 Entonces
			Escribir 'Martes'
		SiNo
			Si numero_de_dia==3 Entonces
				Escribir 'Miércoles'
			SiNo
				Si numero_de_dia==4 Entonces
					Escribir 'Jueves'
				SiNo
					Si numero_de_dia==5 Entonces
						Escribir 'Viernes'
					SiNo
						Si numero_de_dia==6 Entonces
							Escribir 'Sábado'
						SiNo
							Si numero_de_dia==7 Entonces
								Escribir 'Domingo'
							SiNo
								Si numero_de_dia<1 Entonces
									Escribir 'INVÁLIDO. No existe un día de la semana con ese número'
								SiNo
									Si numero_de_dia>7 Entonces
										Escribir 'INVÁLIDO. No existe un día de la semana con ese número'
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo

