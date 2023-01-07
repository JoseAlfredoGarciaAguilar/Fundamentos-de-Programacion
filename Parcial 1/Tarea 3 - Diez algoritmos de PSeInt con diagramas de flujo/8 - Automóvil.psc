Algoritmo Automóvil
	Definir Km Como Real
	Definir PreGas100Km Como Real
	Definir PreGas1Km Como Real
	Definir TiempGasHr Como Real
	Definir TiempGasMin Como Real
	Definir Tiemp Como Real
	Definir DinGas Como Real
	Definir Litros100Km Como Real
	Definir Litros1Km Como Real
	Definir NL Como Real
	Definir VMkmh Como Real
	Definir VMms Como Real
	Escribir 'Escribe el total de Kilómetros recorridos'
	Leer Km
	Escribir 'Escribe el precio en pesos de la Gasolina por litro'
	Leer PreGas
	Escribir 'Escribe el dinero gastado en la Gasolina en el viaje'
	Leer DinGas
	Escribir 'Escribe el tiempo tardado en horas en el trayecto'
	Leer TiempGasHr
	Escribir 'Escribe el tiempo tardado en minutos en el trayecto'
	Leer TiempGasMin
	NL <- DinGas/PreGas
	Litros1Km <- NL/Km*10
	Litros100Km <- Litros1Km*100
	PreGas100Km <- (DinGas/Km*100)
	PreGas1Km <- (DinGas/Km)*10
	VMkmh <- Km/TiempGasHr
	VMms <- Km/TiempGasMin
	Escribir 'Litros gastados en 100 km = ',Litros100Km
	Escribir 'Dinero gastado en gasolina en 100 km = ',PreGas100Km
	Escribir 'Litros gastados en 1 km = ',Litros1Km
	Escribir 'Dinero gastado en gasolina en 1 km = ',PreGas1Km
	Escribir 'Velocidad en Km/h = ',VMkmh
	Escribir 'Velocidad en m/s = ',VMms
FinAlgoritmo
