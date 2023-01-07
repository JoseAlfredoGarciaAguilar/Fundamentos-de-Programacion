Algoritmo Problema1
	Definir i,alumnos,suma,promedio,aprobados,reprobados,max,aux Como Entero
	Definir calificaciones,porcentaje_aprobados,porcentaje_reprobados Como Real
	Definir nombres Como Caracter
	alumnos <- 0
	suma <- 0
	promedio <- 0
	aprobados <- 0
	reprobados <- 0
	Escribir '¿Cuántos alumnos son?: '
	Leer alumnos
	Dimension nombres[alumnos]
	Dimension calificaciones[alumnos]
	Para i<-0 Hasta alumnos-1 Hacer
		Escribir 'Nombre del alumno ',(i+1),': '
		Leer nombres[i]
		Escribir 'Calificación del Alumno ',(i+1),': '
		Leer calificaciones[i]
	FinPara
	Escribir ' '
	Para i<-0 Hasta calificaciones[i] Hacer
		Escribir nombres[i],' ',calificaciones[i]
	FinPara
	Para i<-0 Hasta calificaciones[i]-1 Hacer
		max <- 1
		Para j<-i+1 Hasta calificaciones[i] Hacer
			Si calificaciones[j]>calificaciones[max] Entonces
				max <- j
			FinSi
		FinPara
	FinPara
	Si i!=max Entonces
		aux <- calificaciones[i]
		nomaux <- nombres[i]
		nombres[i] <- nombres[max]
		calificaciones[i] <- calificaciones[max]
		calificaciones[max] <- aux
	FinSi
	Si calificaciones[i]>=70 Entonces
		aprobados <- aprobados+1
	SiNo
		reprobados <- reprobados+1
	FinSi
	Escribir ' '
	Para i<-0 Hasta calificaciones[i] Hacer
		Escribir nombres[i],' ',calificaciones[i]
		suma <- suma+calificaciones[i]
		promedio <- suma/calificaciones[i]
	FinPara
	Escribir ' '
	Escribir 'Promedio Final del grupo = ',promedio
	porcentaje_aprobados <- (100/alumnos)*aprobados
	Escribir 'Porcentaje de aprobados en el grupo: ',porcentaje_aprobados,'%'
	porcentaje_reprobados <- 100-porcentaje_aprobados
	Escribir 'Porcentaje de reprobados en el grupo: ',porcentaje_reprobados,'%'
FinAlgoritmo

