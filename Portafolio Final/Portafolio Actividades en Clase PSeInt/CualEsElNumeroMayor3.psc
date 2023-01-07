Algoritmo CualEsElNumeroMayor3
	Definir a,b,c,num_mayor Como Real
	Escribir 'Ingresa un número: '
	Leer a
	Escribir 'Ingresa otro número: '
	Leer b
	Escribir 'Ingresa algún otro número: '
	Leer c
	num_mayor <- 0
	Si a>b Y a>c Entonces
		num_mayor <- a
	SiNo
		Si b>a Y b>c Entonces
			num_mayor <- b
		SiNo
			num_mayor <- c
		FinSi
	FinSi
	Escribir 'El número mayor es: ',num_mayor
FinAlgoritmo

