Algoritmo DivisionResiduoyMCD
	Definir numero_a_dividir,divisor,resultado_division,residuo_division Como Real
	Escribir 'Escribe el número a dividir: '
	Leer numero_a_dividir
	Escribir 'Escribe entre cuánto lo quieres dividir: '
	Leer divisor
	resultado_division <- numero_a_dividir/divisor
	Escribir 'Resultado de la División = ',TRUNC(resultado_division)
	residuo_division <- numero_a_dividir MOD divisor
	Escribir 'Residuo o Módulo de la División = ',residuo_division
	Mientras numero_a_dividir<>divisor Hacer
		Si numero_a_dividir>divisor Entonces
			numero_a_dividir <- numero_a_dividir-divisor
		SiNo
			divisor <- divisor-numero_a_dividir
		FinSi
	FinMientras
	Escribir 'El Máximo Común Divisor (MCD) = ',numero_a_dividir
FinAlgoritmo

