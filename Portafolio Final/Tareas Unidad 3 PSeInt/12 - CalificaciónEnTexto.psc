Algoritmo CalificacionEnTexto
	Definir calificacion Como Real
	Escribir 'Escribe la Calificación del Alumno: '
	Leer calificacion
	Si calificacion=10 Entonces
		Escribir 'Matrícula de Honor'
	FinSi
	Si calificacion>=8.5 Y calificacion<10 Entonces
		Escribir 'Sobresaliente'
	FinSi
	Si calificacion>=6.5 Y calificacion<8.5 Entonces
		Escribir 'Notable'
	FinSi
	Si calificacion>=5 Y calificacion<6.5 Entonces
		Escribir 'Aprobado'
	FinSi
	Si calificacion<5 Entonces
		Escribir 'Suspenso'
	FinSi
	Si calificacion<0 Entonces
		Escribir 'ERROR. Prueba de nuevo'
	FinSi
	Si calificacion>10 Entonces
		Escribir 'ERROR. Prueba de nuevo'
	FinSi
FinAlgoritmo

