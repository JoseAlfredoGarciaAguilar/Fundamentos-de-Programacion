Algoritmo N�meroPrimo
	Definir contador,i,num Como Entero
	Escribir 'Ingresa un n�mero: '
	Leer num
	Para i<-1 Hasta num Hacer
		Si (num MOD i=0) Entonces
			contador <- contador+1
		FinSi
	FinPara
	Si contador<=2 Entonces
		Escribir 'El n�mero es primo'
	SiNo
		Escribir 'El n�mero no es primo'
	FinSi
FinAlgoritmo

