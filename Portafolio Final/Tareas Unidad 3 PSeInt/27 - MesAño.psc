Algoritmo MesA�o
	Definir a�o,numero_mes Como Entero
	Escribir 'Escribe el a�o: '
	Leer a�o
	Escribir 'Escribe el n�mero del mes: '
	Leer numero_mes
	Si a�o MOD 4=0 Entonces
		Segun numero_mes  Hacer
			1:
				Escribir 'Enero del a�o ',a�o,' tiene 31 d�as'
			2:
				Escribir 'Febrero del a�o ',a�o,' tiene 29 d�as'
			3:
				Escribir 'Marzo del a�o ',a�o,' tiene 31 d�as'
			4:
				Escribir 'Abril del a�o ',a�o,' tiene 30 d�as'
			5:
				Escribir 'Mayo del a�o ',a�o,' tiene 31 d�as'
			6:
				Escribir 'Junio del a�o ',a�o,' tiene 30 d�as'
			7:
				Escribir 'Julio del a�o ',a�o,' tiene 31 d�as'
			8:
				Escribir 'Agosto del a�o ',a�o,' tiene 31 d�as'
			9:
				Escribir 'Septiembre del a�o ',a�o,' tiene 30 d�as'
			10:
				Escribir 'Octubre del a�o ',a�o,' tiene 31 d�as'
			11:
				Escribir 'Noviembre del a�o ',a�o,' tiene 30 d�as'
			12:
				Escribir 'Diciembre del a�o ',a�o,' tiene 31 d�as'
			De Otro Modo:
				Escribir '�ERROR. No existe un mes con este n�mero!'
		FinSegun
	SiNo
		Segun numero_mes  Hacer
			1:
				Escribir 'Enero del a�o ',a�o,' tiene 31 d�as'
			2:
				Escribir 'Febrero del a�o ',a�o,' tiene 28 d�as'
			3:
				Escribir 'Marzo del a�o ',a�o,' tiene 31 d�as'
			4:
				Escribir 'Abril del a�o ',a�o,' tiene 30 d�as'
			5:
				Escribir 'Mayo del a�o ',a�o,' tiene 31 d�as'
			6:
				Escribir 'Junio del a�o ',a�o,' tiene 30 d�as'
			7:
				Escribir 'Julio del a�o ',a�o,' tiene 31 d�as'
			8:
				Escribir 'Agosto del a�o ',a�o,' tiene 31 d�as'
			9:
				Escribir 'Septiembre del a�o ',a�o,' tiene 30 d�as'
			10:
				Escribir 'Octubre del a�o ',a�o,' tiene 31 d�as'
			11:
				Escribir 'Noviembre del a�o ',a�o,' tiene 30 d�as'
			12:
				Escribir 'Diciembre del a�o ',a�o,' tiene 31 d�as'
			De Otro Modo:
				Escribir '�ERROR. No existe un mes con este n�mero!'
		FinSegun
	FinSi
FinAlgoritmo

