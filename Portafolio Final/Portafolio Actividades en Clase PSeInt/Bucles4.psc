Algoritmo Bucles4
	Definir digito_leido Como Logico
	Definir car Como Caracter
	digito_leido <- Falso
	Mientras !digito_leido Hacer
		Escribir 'Introduzca un d�gito: '
		Leer car
		Escribir 'Error. Requiero un d�gito'
		digito_leido <- ('0'<=car) Y (car='9')
	FinMientras
	Escribir 'Al fin tecleaste un d�gito'
FinAlgoritmo

