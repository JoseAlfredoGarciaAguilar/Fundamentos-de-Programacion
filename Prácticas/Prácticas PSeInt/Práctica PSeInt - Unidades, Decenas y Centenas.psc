Algoritmo UnidadesDecenasYCentenas
	Definir Num Como Real
	Definir Cen Como Real
	Definir Dec Como Real
	Definir Uni Como Real
	Escribir 'Escribe el n�mero que deseas desglosar'
	Leer Num
	Cen <- TRUNC((Num MOD 1000)/100)
	Dec <- TRUNC((Num MOD 100)/10)
	Uni <- Num MOD 10
	Escribir 'N�mero de centenas = ',Cen
	Escribir 'N�mero de decenas = ',Dec
	Escribir 'N�mero de unidades = ',Uni
FinAlgoritmo

