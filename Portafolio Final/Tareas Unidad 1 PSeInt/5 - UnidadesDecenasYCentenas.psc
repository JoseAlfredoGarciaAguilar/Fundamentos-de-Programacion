Algoritmo UnidadesDecenasYCentenas
	Definir Num Como Real
	Definir Cen Como Real
	Definir Dec Como Real
	Definir Uni Como Real
	Escribir 'Escribe el número que deseas desglosar'
	Leer Num
	Cen <- TRUNC((Num MOD 1000)/100)+0
	Dec <- TRUNC((Num MOD 100)/10)+0
	Uni <- TRUNC(Num MOD 10)/1
	Escribir 'Número de centenas = ',Cen
	Escribir 'Número de decenas = ',Dec
	Escribir 'Número de unidades = ',Uni
FinAlgoritmo

