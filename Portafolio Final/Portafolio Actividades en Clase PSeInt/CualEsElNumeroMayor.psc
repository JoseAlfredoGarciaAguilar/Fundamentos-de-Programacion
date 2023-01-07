Algoritmo CualEsElNumeroMayor
	Definir a,b,c,num_mayor Como Real
	Escribir 'Ingresa un número: '
	Leer a
	Escribir 'Ingresa otro número: '
	Leer b
	Escribir 'Ingresa algún otro número: '
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
	Escribir 'El número mayor es: ',num_mayor
FinAlgoritmo

