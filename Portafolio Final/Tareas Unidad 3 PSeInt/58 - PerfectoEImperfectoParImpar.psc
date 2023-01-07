Algoritmo PerfectoImperfectoParImpar
	Definir suma,num Como Entero
	suma <- 0
	Escribir 'Digita un número: '
	Leer num
	Para i<-1 Hasta num Hacer
		Si (num MOD i=0) Entonces
			suma <- suma+i
		FinSi
	FinPara
	Si suma=num Entonces
		Escribir '¡El número es perfecto!'
	SiNo
		Escribir '¡El número no es perfecto!'
	FinSi
	Si (num MOD 2=0) Entonces
		Escribir '¡Además, el número es par!'
	SiNo
		Escribir '¡Además, el número es impar!'
	FinSi
FinAlgoritmo

