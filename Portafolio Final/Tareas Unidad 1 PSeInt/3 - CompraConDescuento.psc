Algoritmo CompraConDescuento
	Definir Pre Como Real
	Definir Porce Como Real
	Definir PreFinal Como Real
	Definir Desc Como Real
	Escribir 'Escribe el Precio Real del Producto'
	Leer Pre
	Escribir 'Escribe el Porcentaje del Descuento'
	Leer Porce
	Desc <- Pre*(Porce*0.01)
	PreFinal <- Pre-Desc
	Escribir 'Precio Final del Producto = ',PreFinal
FinAlgoritmo

