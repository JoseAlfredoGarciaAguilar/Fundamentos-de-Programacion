Algoritmo Sueldo
	Definir ganancia,sueldo_final Como Real
	Escribir '¿Cuánto ganó el empleado?: '
	Leer ganancia
	Si ((ganancia>0) Y (ganancia<=9000)) Entonces
		sueldo_final <- (ganancia*0.2)+ganancia
		Escribir 'El sueldo final es = $',sueldo_final
	FinSi
	Si ((ganancia>9000) Y (ganancia<=15000)) Entonces
		sueldo_final <- (ganancia*0.1)+ganancia
		Escribir 'El sueldo final es = $',sueldo_final
	FinSi
	Si ((ganancia>15000) Y (ganancia<=20000)) Entonces
		sueldo_final <- (ganancia*0.05)+ganancia
		Escribir 'El sueldo final es = $',sueldo_final
	FinSi
	Si (ganancia>20000) Entonces
		sueldo_final <- ganancia*1
		Escribir 'El sueldo final es = $',sueldo_final
	FinSi
	Si (ganancia<0) Entonces
		Escribir 'ERROR. Prueba de nuevo'
	FinSi
FinAlgoritmo

