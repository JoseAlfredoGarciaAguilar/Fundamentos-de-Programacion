Algoritmo TestSwitch
	Definir num Como Entero
	Escribir 'Ingresa un n�mero del 0 al 3: '
	Leer num
	Si num<0 Y num>3 Entonces
		Escribir 'N�mero inv�lido. Intenta de nuevo'
	FinSi
	Segun num  Hacer
		0:
			Escribir 'Cero'
		1:
			Escribir 'Uno'
		2:
			Escribir 'Dos'
		3:
			Escribir 'Tres'
	FinSegun
FinAlgoritmo

