Algoritmo PuntajeTotalAlumno
	Definir ReC Como Entero
	Definir ReI Como Entero
	Definir ReB Como Entero
	Definir PT Como Entero
	Escribir 'Proporciona Número de Respuestas Correctas'
	Leer ReC
	Escribir 'Proporciona Número de Respuestas Incorrectas'
	Leer ReI
	Escribir 'Proporciona Número de Respuestas en Blanco'
	Leer ReB
	PT <- ReC*4-ReI*1+ReB*0
	Escribir 'Puntaje Total = ',PT
FinAlgoritmo

