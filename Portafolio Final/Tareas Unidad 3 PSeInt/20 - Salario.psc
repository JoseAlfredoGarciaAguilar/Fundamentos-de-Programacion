Algoritmo Salario
	Definir horas,pago,pago_horas_incompletas,pago_especial,sueldo_final Como Real
	Escribir 'Escribe las horas que trabajó el empleado en toda la semana: '
	Leer horas
	Escribir 'Escribe el pago semanal al trabajar 38 horas: '
	Leer pago
	Si horas<=38 Entonces
		pago_horas_incompletas <- (pago/38)*horas
		Escribir 'El empleado ganó $',pago_horas_incompletas
	SiNo
		Si horas>38 Entonces
			pago_especial <- (pago*0.5)+pago
			Escribir 'El empleado ganó $',pago_especial
			sueldo_final <- pago_especial-(pago_especial*0.1)
			Escribir 'Sin embargo, con el cálculo de impuestos, el sueldo final del empleado es $',sueldo_final
		FinSi
	FinSi
FinAlgoritmo
