Algoritmo CálculoDeEdad
	Definir nombre Como Caracter
	Definir mes_de_nacimiento,año_de_nacimiento,año_actual,edad_de_la_persona Como Entero
	Escribir 'Escribe el nombre de la persona: '
	Leer nombre
	Escribir 'Escribe el mes de nacimiento: '
	Leer mes_de_nacimiento
	Escribir 'Escribe el año de nacimiento: '
	Leer año_de_nacimiento
	Escribir 'Escribe el año actual: '
	Leer año_actual
	edad_de_la_persona <- año_actual-año_de_nacimiento
	Si edad_de_la_persona>1 Entonces
		Escribir nombre,' tiene ',edad_de_la_persona,' años de edad, aproximadamente'
	SiNo
		Escribir nombre,' es un bebé que tiene menos de un año de edad'
	FinSi
FinAlgoritmo

