Algoritmo Menú
	Definir opc Como Entero
	Definir valor1,valor2,resultado Como Real
	Escribir '***************'
	Escribir 'MENÚ DE OPCIONES'
	Escribir '***************'
	Escribir '1-Sumar'
	Escribir '2-Restar'
	Escribir '3-Multiplicar'
	Escribir '4-Dividir'
	Escribir '5-Salir'
	Escribir '***************'
	Escribir 'Dame opción (1-5)'
	Leer opc
	Si opc<1 Y opc>5 Entonces
		Escribir 'Opción inválida... Intente de nuevo'
	FinSi
	Segun opc  Hacer
		1:
			Escribir 'Bienvenido a la Suma'
			Escribir 'Operando 1: '
			Leer valor1
			Escribir 'Operando 2: '
			Leer valor2
			resultado <- valor1+valor2
			Escribir resultado
		2:
			Escribir 'Bienvenido a la Resta'
			Escribir 'Operando 1: '
			Leer valor1
			Escribir 'Operando 2: '
			Leer valor2
			resultado <- valor1-valor2
			Escribir resultado
		3:
			Escribir 'Bienvenido a la Multiplicación'
			Escribir 'Operando 1: '
			Leer valor1
			Escribir 'Operando 2: '
			Leer valor2
			resultado <- valor1*valor2
			Escribir resultado
		4:
			Escribir 'Bienvenido a la suma'
			Escribir 'Operando 1: '
			Leer valor1
			Escribir 'Operando 2: '
			Leer valor2
			resultado <- valor1/valor2
			Escribir resultado
		5:
			Escribir 'Salir. Sesión finalizada'
		De Otro Modo:
			Escribir 'ERROR. Esa opción no existe'
	FinSegun
FinAlgoritmo

