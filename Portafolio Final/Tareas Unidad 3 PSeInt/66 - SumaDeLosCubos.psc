Algoritmo SumaDeCubos
	Definir primer_valor,segundo_valor,primer_valor_al_cubo,segundo_valor_al_cubo,suma_de_los_cubos,resultado Como Real
	Escribir 'Ingresa el primer valor: '
	Leer primer_valor
	Escribir 'Ingresa el segundo valor: '
	Leer segundo_valor
	primer_valor_al_cubo <- primer_valor^3
	segundo_valor_al_cubo <- segundo_valor^3
	suma_de_los_cubos <- primer_valor_al_cubo+segundo_valor_al_cubo
	resultado <- (suma_de_los_cubos*999)/1000
	Escribir 'Resultado = ',resultado
FinAlgoritmo

