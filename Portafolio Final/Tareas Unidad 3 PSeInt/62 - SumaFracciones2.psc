Algoritmo SumaFracciones2
	Definir n Como Entero
	Definir resultado Como Real
	Escribir '¿Hasta qué número quieres las fracciones?: '
	Leer n
	resultado <- 1
	Si (n>0) Entonces
		Para i<-1 Hasta n Hacer
			Si (i MOD 2=0) Entonces
				resultado_potencia <- (n/i)^n
				resultado <- resultado/resultado_potencia
			SiNo
				resultado_potencia <- (n/i)^n
				resultado <- resultado*resultado_potencia
			FinSi
		FinPara
	FinSi
	Escribir 'El resultado es = ',resultado
FinAlgoritmo

