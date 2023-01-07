Algoritmo OperadoresAsignación
	Definir a,b,c,aux,Z,contador,suma,resta,operador_negativo,producto,residuo,expresion,expresion2,expresion3,x Como Entero
	Definir division,x1 Como Real
	// Operador de asignación
	a <- 0
	Escribir 'Valor de a = ',a
	a <- 20
	Escribir 'Valor de a = ',a
	a <- 1250
	Escribir 'Valor de a = ',a
	b <- 5
	c <- 10
	Escribir 'Valor de b = ',b
	Escribir 'Valor de c = ',c
	aux <- b
	b <- c
	c <- aux
	Escribir 'Valor de b = ',b
	Escribir 'Valor de c = ',c
	// Operadores de asignación
	Z <- 5
	Escribir Z
	Z <- Z+5
	Escribir Z
	Z <- Z-1
	Escribir Z
	Z <- Z*2
	Escribir Z
	Z <- Z/2
	Escribir Z
	Z <- Z MOD 2
	Escribir Z
	contador <- 0
	contador <- contador+1 // contador++
	contador <- contador-1 // contador--
	// Operaciones aritméticas
	suma <- 5+6
	Escribir suma
	// -resta
	resta <- 9-11
	Escribir resta
	operador_negativo <- -40
	Escribir operador_negativo
	// producto
	producto <- 11*11
	Escribir producto
	// division entera
	division <- TRUNC(9/2)
	Escribir division
	// residuo, resto o módulo
	residuo <- 9 MOD 2
	Escribir residuo
	// asociatividad y presencia
	expresion <- 5*2+9/3-1 // los operadores de suma y resta tienen la misma presedencia
	Escribir expresion
	expresion2 <- 5*4/2 MOD 5
	Escribir expresion2
	expresion3 <- (((5*4-1)-(2/5))*2)/5
	Escribir expresion3
	x <- 2/5
	Escribir x
	x1 <- 2/5
	Escribir x1
FinAlgoritmo

