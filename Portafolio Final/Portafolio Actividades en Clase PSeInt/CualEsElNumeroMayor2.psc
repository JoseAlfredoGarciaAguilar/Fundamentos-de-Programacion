Algoritmo CualEsElNumeroMayor2
	Definir a,b,c,num_mayor Como Real
	Escribir 'Ingresa un n�mero: '
	Leer a
	Escribir 'Ingresa otro n�mero: '
	Leer b
	Escribir 'Ingresa alg�n otro n�mero: '
	Leer c
	num_mayor <- 0
	Si a>b Y a>c Entonces
		num_mayor <- a
	FinSi
	Si b>a Y b>c Entonces
		num_mayor <- b
	FinSi
	Si c>a Y c>b Entonces
		num_mayor <- c
	FinSi
	Escribir 'El n�mero mayor es: ',num_mayor
FinAlgoritmo

