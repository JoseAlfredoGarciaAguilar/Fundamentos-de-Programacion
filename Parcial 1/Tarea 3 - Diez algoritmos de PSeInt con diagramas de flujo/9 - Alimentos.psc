Algoritmo Alimentos
	Definir Comen Como Entero
	Definir PreArr Como Real
	Definir PreCam Como Real
	Definir CantArr Como Real
	Definir CantCam Como Real
	Definir CostArr Como Real
	Definir CostCam Como Real
	Definir CostTotal Como Real
	Escribir 'Escribe el n�mero de Comensales para la paella'
	Leer Comen
	Escribir 'Escribe el precio por kilo del arroz'
	Leer PreArr
	Escribir 'Escribe el precio por kilo del camar�n'
	Leer PreCam
	CantArr <- (Comen*0.5)/4
	CantCam <- (Comen*0.25)/4
	CostArr <- CantArr*PreArr
	CostCam <- CantCam*PreCam
	CostTotal <- CostArr+CostCam
	Escribir 'Kg necesarios de Arroz = ',CantArr
	Escribir 'Kg necesarios de Camar�n = ',CantCam
	Escribir 'Costo total = $',CostTotal
FinAlgoritmo

