Algoritmo Men�DePeaje
	Definir vehiculo Como Entero
	Definir pago,cambio Como Real
	Escribir '***************'
	Escribir 'MEN� DE PEAJE'
	Escribir '***************'
	Escribir '1) Turismo: $800'
	Escribir '2) Autob�s: $350'
	Escribir '3) Autom�vil: $100'
	Escribir '4) Motocicleta: $80'
	Escribir '5) Salir'
	Escribir '�Elige una opci�n escribiendo su n�mero!: '
	Leer vehiculo
	Segun vehiculo  Hacer
		1:
			Escribir 'Turismo'
		2:
			Escribir 'Autob�s'
		3:
			Escribir 'Autom�vil'
		4:
			Escribir 'Motocicleta'
		5:
			Escribir 'Salir'
		De Otro Modo:
			Escribir 'ERROR. Esa opci�n no existe'
	FinSegun
	Si vehiculo==1 Entonces
		Escribir 'Tarifa o Costo: $800'
		Escribir '�Con cu�nto pagas?'
		Leer pago
		cambio <- pago-800
		Escribir 'Tu cambio es: $',cambio
	FinSi
	Si vehiculo==2 Entonces
		Escribir 'Tarifa o Costo: $350'
		Escribir '�Con cu�nto pagas?'
		Leer pago
		cambio <- pago-350
		Escribir 'Tu cambio es: $',cambio
	FinSi
	Si vehiculo==3 Entonces
		Escribir 'Tarifa o Costo: $100'
		Escribir '�Con cu�nto pagas?'
		Leer pago
		cambio <- pago-100
		Escribir 'Tu cambio es: $',cambio
	FinSi
	Si vehiculo==4 Entonces
		Escribir 'Tarifa o Costo: $80'
		Escribir '�Con cu�nto pagas?'
		Leer pago
		cambio <- pago-80
		Escribir 'Tu cambio es: $',cambio
	FinSi
FinAlgoritmo

