Algoritmo N�meroDePartidos
	Definir PG,PE,PP,PPG,PPE,PPP,TP Como Entero
	Escribir 'Proporciona N�mero de Partidos Ganados'
	Leer PG
	Escribir 'Proporciona N�mero de Partidos Empatados'
	Leer PE
	Escribir 'Proporciona N�mero de Partidos Perdidos'
	Leer PP
	PPG <- PG*3
	PPE <- PE*1
	PPP <- PP*0
	TP <- PPG+PPE+PPP
	Escribir 'Total de Puntos = ',TP
FinAlgoritmo

