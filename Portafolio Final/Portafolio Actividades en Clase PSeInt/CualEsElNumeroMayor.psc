Algoritmo CualEsElNumeroMayor
	Definir a,b,c,num_mayor Como Real
	Escribir 'Ingresa un n�mero: '
	Leer a
	Escribir 'Ingresa otro n�mero: '
	Leer b
	Escribir 'Ingresa alg�n otro n�mero: '
	Leer c
	Si a>b Entonces
		Si a>c Entonces
			num_mayor <- a
		SiNo
			num_mayor <- c
		FinSi
	SiNo
		Si b>c Entonces
			num_mayor <- b
		SiNo
			num_mayor <- c
		FinSi
	FinSi
	Escribir 'El n�mero mayor es: ',num_mayor
FinAlgoritmo

