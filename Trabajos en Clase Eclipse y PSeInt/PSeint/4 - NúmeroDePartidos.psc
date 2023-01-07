Algoritmo NúmeroDePartidos
	Definir PG,PE,PP,PPG,PPE,PPP,TP Como Entero
	Escribir 'Proporciona Número de Partidos Ganados'
	Leer PG
	Escribir 'Proporciona Número de Partidos Empatados'
	Leer PE
	Escribir 'Proporciona Número de Partidos Perdidos'
	Leer PP
	PPG <- PG*3
	PPE <- PE*1
	PPP <- PP*0
	TP <- PPG+PPE+PPP
	Escribir 'Total de Puntos = ',TP
FinAlgoritmo

