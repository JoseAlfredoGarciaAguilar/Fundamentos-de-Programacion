Algoritmo Notas
	// PROGRAMA PARA DETERMINAR SI UN ALUMNO APROBÓ O REPROBÓ UNA MATERIA AL INSERTAR UNA CALIFICACIÓN
	// Variable de entrada
	Definir calif Como Real
	// Variable de salida
	Definir mensaje Como Caracter
	Escribir 'Escribe la Calificación: '
	Leer calif
	Si (calif>=70) Entonces
		mensaje <- 'Aprobado'
	SiNo
		mensaje <- 'Reprobado'
	FinSi
	Escribir mensaje
FinAlgoritmo

