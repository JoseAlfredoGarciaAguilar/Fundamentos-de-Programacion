Algoritmo MesAño
	Definir año,numero_mes Como Entero
	Escribir 'Escribe el año: '
	Leer año
	Escribir 'Escribe el número del mes: '
	Leer numero_mes
	Si año MOD 4=0 Entonces
		Segun numero_mes  Hacer
			1:
				Escribir 'Enero del año ',año,' tiene 31 días'
			2:
				Escribir 'Febrero del año ',año,' tiene 29 días'
			3:
				Escribir 'Marzo del año ',año,' tiene 31 días'
			4:
				Escribir 'Abril del año ',año,' tiene 30 días'
			5:
				Escribir 'Mayo del año ',año,' tiene 31 días'
			6:
				Escribir 'Junio del año ',año,' tiene 30 días'
			7:
				Escribir 'Julio del año ',año,' tiene 31 días'
			8:
				Escribir 'Agosto del año ',año,' tiene 31 días'
			9:
				Escribir 'Septiembre del año ',año,' tiene 30 días'
			10:
				Escribir 'Octubre del año ',año,' tiene 31 días'
			11:
				Escribir 'Noviembre del año ',año,' tiene 30 días'
			12:
				Escribir 'Diciembre del año ',año,' tiene 31 días'
			De Otro Modo:
				Escribir '¡ERROR. No existe un mes con este número!'
		FinSegun
	SiNo
		Segun numero_mes  Hacer
			1:
				Escribir 'Enero del año ',año,' tiene 31 días'
			2:
				Escribir 'Febrero del año ',año,' tiene 28 días'
			3:
				Escribir 'Marzo del año ',año,' tiene 31 días'
			4:
				Escribir 'Abril del año ',año,' tiene 30 días'
			5:
				Escribir 'Mayo del año ',año,' tiene 31 días'
			6:
				Escribir 'Junio del año ',año,' tiene 30 días'
			7:
				Escribir 'Julio del año ',año,' tiene 31 días'
			8:
				Escribir 'Agosto del año ',año,' tiene 31 días'
			9:
				Escribir 'Septiembre del año ',año,' tiene 30 días'
			10:
				Escribir 'Octubre del año ',año,' tiene 31 días'
			11:
				Escribir 'Noviembre del año ',año,' tiene 30 días'
			12:
				Escribir 'Diciembre del año ',año,' tiene 31 días'
			De Otro Modo:
				Escribir '¡ERROR. No existe un mes con este número!'
		FinSegun
	FinSi
FinAlgoritmo

