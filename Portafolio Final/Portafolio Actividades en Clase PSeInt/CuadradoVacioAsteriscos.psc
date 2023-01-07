Algoritmo CuadradoVacioAsteriscos
	Definir lado,numeroasteriscos,cont Como Entero
	Escribir 'Escribe el lado del cuadrado: '
	Leer lado
	numeroasteriscos <- lado
	// Dibujamos la parte de arriba del cuadrado
	Para cont<-0 Hasta numeroasteriscos Hacer
		Escribir '*'
	FinPara
	Escribir ' '
	// Usamos un bucle anidado para dibujar los asteriscos del medio
	Para cont<-1 Hasta numeroasteriscos-2 Hacer
		Escribir ' '
		// Este bucle dibuja los espacios entre el primer y último asterisco
		Para i<-0 Hasta numeroasteriscos-2 Hacer
			Escribir ' '
		FinPara
		Escribir '*'
		Escribir ' '
	FinPara
	// Dibujamos la parte de abajo del cuadrado
	Para cont<-0 Hasta numeroasteriscos Hacer
		Escribir '*'
	FinPara
FinAlgoritmo

