Algoritmo D�asDeLaSemana2
	Definir numero_de_dia Como Entero
	Escribir 'Escribe el n�mero de d�a de la semana: '
	Leer numero_de_dia
	Si numero_de_dia==1 Entonces
		Escribir 'Lunes'
	SiNo
		Si numero_de_dia==2 Entonces
			Escribir 'Martes'
		SiNo
			Si numero_de_dia==3 Entonces
				Escribir 'Mi�rcoles'
			SiNo
				Si numero_de_dia==4 Entonces
					Escribir 'Jueves'
				SiNo
					Si numero_de_dia==5 Entonces
						Escribir 'Viernes'
					SiNo
						Si numero_de_dia==6 Entonces
							Escribir 'S�bado'
						SiNo
							Si numero_de_dia==7 Entonces
								Escribir 'Domingo'
							SiNo
								Si numero_de_dia<1 Entonces
									Escribir 'INV�LIDO. No existe un d�a de la semana con ese n�mero'
								SiNo
									Si numero_de_dia>7 Entonces
										Escribir 'INV�LIDO. No existe un d�a de la semana con ese n�mero'
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

