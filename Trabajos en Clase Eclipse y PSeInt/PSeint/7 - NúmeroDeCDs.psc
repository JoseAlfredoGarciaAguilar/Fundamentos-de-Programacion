Algoritmo N�meroDeCDs
	Definir TamDDGB Como Real
	Definir TamDDMB Como Real
	Definir CD Como Entero
	Escribir 'Proporcione el Tama�o del Disco Duro en GB'
	Leer TamDDGB
	TamDDMB <- TamDDGB*1024
	CD <- TRUNC(TamDDMB/700)+1
	Escribir 'N�mero de CDs que necesito = ',CD
FinAlgoritmo

