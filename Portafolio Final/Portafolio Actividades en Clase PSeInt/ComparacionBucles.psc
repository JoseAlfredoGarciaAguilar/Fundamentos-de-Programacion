Algoritmo ComparacionBucles
	Definir control,total,n,contador Como Entero
	Definir suma,num,suma2 Como Real
	Escribir 'Dame la cantidad de n�meros que quieres leer: '
	Leer total
	control <- 1
	suma <- 0.0
	Mientras control<=total Hacer
		Escribir 'Dame n�mero (',control,'): '
		Leer num
		control <- control+1
		suma <- suma+num
	FinMientras // Fin del bucle
	Escribir 'Total Suma = ',suma
	// estos dos trozos de c�digo son lo mismo, son sin�nimos, por lo tanto hahcen exactamente lo mismo
	suma2 <- 0
	Escribir 'Dame la cantidad de n�meros que quieres leer: '
	Leer n
	Para i<-1 Hasta n Hacer
		Escribir 'Dame n�mero (',i,'): '
		Leer num
		suma2 <- suma2+num
	FinPara
	// este programa tambi�n hace lo mismo que los anteriores
	contador <- 0
	Repetir
		Escribir 'Dame n�mero: '
		Leer num
		Si num!=-1 Entonces
			contador <- contador+1
		FinSi
	Hasta Que (num!=-1)
	// Finaliz� el bucle
	Escribir 'Total de alumnos le�dos: ',contador
FinAlgoritmo

