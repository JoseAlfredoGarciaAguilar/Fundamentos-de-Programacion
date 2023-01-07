Algoritmo Tiempo
	Definir velocidad,distancia,tiemp,hr,min,seg,km Como Real
	Escribir 'Escribe la velocidad en m/s (metros por segundo): '
	Leer velocidad
	Escribir 'Escribe la distancia recorrida en metros: '
	Leer distancia
	tiemp <- (distancia/velocidad)*10
	km <- distancia*1000
	seg <- distancia/velocidad
	min <- seg/60
	hr <- seg/3600
	Escribir 'Tiempo en horas: ',hr
	Escribir 'Tiempo en minutos: ',min
	Escribir 'Tiempo en segundos: ',seg
FinAlgoritmo
