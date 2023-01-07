Algoritmo Puntaje
	Definir correctas,incorrectas,en_blanco,puntaje_total Como Real
	Escribir 'Escribe el número de respuestas correctas: '
	Leer correctas
	Escribir 'Escribe el número de respuestas incorrectas: '
	Leer incorrectas
	Escribir 'Escribe el número de respuestas en blanco: '
	Leer en_blanco
	puntaje_total <- (correctas*4)-(incorrectas*1)+(en_blanco*0)
	Escribir 'Puntaje total = ',puntaje_total
FinAlgoritmo
