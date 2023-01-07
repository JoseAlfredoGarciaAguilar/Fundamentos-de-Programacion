Algoritmo ComparacionBucles
	Definir control,total,n,contador Como Entero
	Definir suma,num,suma2 Como Real
	Escribir 'Dame la cantidad de números que quieres leer: '
	Leer total
	control <- 1
	suma <- 0.0
	Mientras control<=total Hacer
		Escribir 'Dame número (',control,'): '
		Leer num
		control <- control+1
		suma <- suma+num
	FinMientras // Fin del bucle
	Escribir 'Total Suma = ',suma
	// estos dos trozos de código son lo mismo, son sinónimos, por lo tanto hahcen exactamente lo mismo
	suma2 <- 0
	Escribir 'Dame la cantidad de números que quieres leer: '
	Leer n
	Para i<-1 Hasta n Hacer
		Escribir 'Dame número (',i,'): '
		Leer num
		suma2 <- suma2+num
	FinPara
	// este programa también hace lo mismo que los anteriores
	contador <- 0
	Repetir
		Escribir 'Dame número: '
		Leer num
		Si num!=-1 Entonces
			contador <- contador+1
		FinSi
	Hasta Que (num!=-1)
	// Finalizó el bucle
	Escribir 'Total de alumnos leídos: ',contador
FinAlgoritmo

