Algoritmo Exponente
	Definir num Como Real
	Definir potencia,contador,x Como Entero
	Escribir '�Qu� n�mero quieres elevar?: '
	Leer num
	Escribir '�A qu� potencia quieres elevar el n�mero?: '
	Leer potencia
	contador <- 0
	x <- 1
	Mientras contador<potencia Hacer
		contador <- contador+1
		x <- x*num
	FinMientras
	Escribir num,' elevado a ',potencia,' = ',x
FinAlgoritmo

