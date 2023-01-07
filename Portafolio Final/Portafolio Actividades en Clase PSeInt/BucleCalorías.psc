Algoritmo BucleCalorías
	Definir num_de_elementos Como Entero
	Definir cuenta Como Entero
	Definir calorias_por_alimento Como Entero
	Definir calorias_total Como Entero
	Escribir "¿Cuántos alimentos has comido hoy?: "
	Leer num_de_elementos
	Escribir "Escribe el número de calorías de los alimentos tomados: "
	calorias_total <- 0
	cuenta <- 1
	Mientras cuenta <= num_de_elementos Hacer
		Leer calorias_por_alimento
		calorias_total = calorias_total + calorias_por_alimento
	Fin Mientras
	Escribir "Hoy has consumido ", calorias_total " calorías en total"
FinAlgoritmo
