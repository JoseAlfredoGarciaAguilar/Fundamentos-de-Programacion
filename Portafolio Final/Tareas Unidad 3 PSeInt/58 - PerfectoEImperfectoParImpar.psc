Algoritmo PerfectoImperfectoParImpar
	Definir suma,num Como Entero
	suma <- 0
	Escribir 'Digita un n�mero: '
	Leer num
	Para i<-1 Hasta num Hacer
		Si (num MOD i=0) Entonces
			suma <- suma+i
		FinSi
	FinPara
	Si suma=num Entonces
		Escribir '�El n�mero es perfecto!'
	SiNo
		Escribir '�El n�mero no es perfecto!'
	FinSi
	Si (num MOD 2=0) Entonces
		Escribir '�Adem�s, el n�mero es par!'
	SiNo
		Escribir '�Adem�s, el n�mero es impar!'
	FinSi
FinAlgoritmo

