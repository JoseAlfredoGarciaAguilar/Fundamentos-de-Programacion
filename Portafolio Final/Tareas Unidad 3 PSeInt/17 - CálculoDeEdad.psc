Algoritmo C�lculoDeEdad
	Definir nombre Como Caracter
	Definir mes_de_nacimiento,a�o_de_nacimiento,a�o_actual,edad_de_la_persona Como Entero
	Escribir 'Escribe el nombre de la persona: '
	Leer nombre
	Escribir 'Escribe el mes de nacimiento: '
	Leer mes_de_nacimiento
	Escribir 'Escribe el a�o de nacimiento: '
	Leer a�o_de_nacimiento
	Escribir 'Escribe el a�o actual: '
	Leer a�o_actual
	edad_de_la_persona <- a�o_actual-a�o_de_nacimiento
	Si edad_de_la_persona>1 Entonces
		Escribir nombre,' tiene ',edad_de_la_persona,' a�os de edad, aproximadamente'
	SiNo
		Escribir nombre,' es un beb� que tiene menos de un a�o de edad'
	FinSi
FinAlgoritmo

