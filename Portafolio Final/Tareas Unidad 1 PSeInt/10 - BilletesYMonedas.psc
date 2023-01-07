Algoritmo BilletesYMonedas
	Definir CantPesos Como Real
	Definir Sobra Como Real
	Definir B1000 Como Entero
	Definir B500 Como Entero
	Definir B200 Como Entero
	Definir B100 Como Entero
	Definir B50 Como Entero
	Definir B20 Como Entero
	Definir M10 Como Entero
	Definir M5 Como Entero
	Definir M2 Como Entero
	Definir M1 Como Entero
	Definir M05 Como Entero
	Escribir 'Escribe la cantidad de pesos'
	Leer CantPesos
	B1000 <- TRUNC(CantPesos/1000)
	CantPesos <- CantPesos-B1000*1000
	B500 <- TRUNC(CantPesos/500)
	CantPesos <- CantPesos-B500*500
	B200 <- TRUNC(CantPesos/200)
	CantPesos <- CantPesos-B200*200
	B100 <- TRUNC(CantPesos/100)
	CantPesos <- CantPesos-B100*100
	B50 <- TRUNC(CantPesos/50)
	CantPesos <- CantPesos-B50*50
	B20 <- TRUNC(CantPesos/20)
	CantPesos <- CantPesos-B20*20
	M10 <- TRUNC(CantPesos/10)
	CantPesos <- CantPesos-M10*10
	M5 <- TRUNC(CantPesos/5)
	CantPesos <- CantPesos-M5*5
	M2 <- TRUNC(CantPesos/2)
	CantPesos <- CantPesos-M2*2
	M1 <- TRUNC(CantPesos/1)
	CantPesos <- CantPesos-M1*1
	M05 <- TRUNC(CantPesos/0.5)
	CantPesos <- CantPesos-M05*0.5
	Escribir 'Billetes de 1000$ necesarios = ',B1000
	Escribir 'Billetes de 500$ necesarios = ',B500
	Escribir 'Billetes de 200$ necesarios = ',B200
	Escribir 'Billetes de 100$ necesarios = ',B100
	Escribir 'Billetes de 50$ necesarios = ',B50
	Escribir 'Billetes de 20$ necesarios = ',B20
	Escribir 'Monedas de 10$ necesarias = ',M10
	Escribir 'Monedas de 5$ necesarias = ',M5
	Escribir 'Monedas de 2$ necesarias = ',M2
	Escribir 'Monedas de 1$ necesarias = ',M1
	Escribir 'Monedas de 50 centavos necesarias = ',M05
FinAlgoritmo

