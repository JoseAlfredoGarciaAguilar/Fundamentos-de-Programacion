Algoritmo NúmeroPrimo
	Definir contador,i,num Como Entero
	Escribir 'Ingresa un número: '
	Leer num
	Para i<-1 Hasta num Hacer
		Si (num MOD i=0) Entonces
			contador <- contador+1
		FinSi
	FinPara
	Si contador<=2 Entonces
		Escribir 'El número es primo'
	SiNo
		Escribir 'El número no es primo'
	FinSi
FinAlgoritmo

