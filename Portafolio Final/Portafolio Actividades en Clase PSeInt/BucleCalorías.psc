Algoritmo BucleCalor�as
	Definir num_de_elementos Como Entero
	Definir cuenta Como Entero
	Definir calorias_por_alimento Como Entero
	Definir calorias_total Como Entero
	Escribir "�Cu�ntos alimentos has comido hoy?: "
	Leer num_de_elementos
	Escribir "Escribe el n�mero de calor�as de los alimentos tomados: "
	calorias_total <- 0
	cuenta <- 1
	Mientras cuenta <= num_de_elementos Hacer
		Leer calorias_por_alimento
		calorias_total = calorias_total + calorias_por_alimento
	Fin Mientras
	Escribir "Hoy has consumido ", calorias_total " calor�as en total"
FinAlgoritmo
