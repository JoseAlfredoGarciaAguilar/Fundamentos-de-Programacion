Algoritmo Potencia
	Definir pot,resultado,contador,expo Como Entero
	Escribir '�A qu� potencia quieres elevar los 100 n�meros?: '
	Leer pot
	num <- 0
	Para num<-1 Hasta 100 Hacer
		resultado <- num^pot
		Escribir num,' elevado a ',pot,' = ',resultado
	FinPara
FinAlgoritmo

