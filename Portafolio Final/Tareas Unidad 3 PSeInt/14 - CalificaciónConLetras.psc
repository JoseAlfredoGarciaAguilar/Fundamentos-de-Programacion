Algoritmo CalificaciónConLetras
	Definir calificacion1,calificacion2,calificcion3,calificacion4,promedio Como Real
	Escribir 'Escribe la calificación de la unidad 1: '
	Leer calificacion1
	Escribir 'Escribe la calificación de la unidad 2: '
	Leer calificacion2
	Escribir 'Escribe la calificación de la unidad 3: '
	Leer calificacion3
	Escribir 'Escribe la calificación de la unidad 4: '
	Leer calificacion4
	promedio <- (calificacion1+calificacion2+calificacion3+calificacion4)/4
	Escribir 'Promedio de las 4 Unidades: ',promedio
	Si promedio>=90 Y promedio<=100 Entonces
		Escribir 'La nota es A'
	SiNo
		Si promedio>=80 Y promedio<=89 Entonces
			Escribir 'La nota es B'
		SiNo
			Si promedio>=70 Y promedio<79 Entonces
				Escribir 'La nota es C'
			SiNo
				Si promedio>=60 Y promedio<=69 Entonces
					Escribir 'La nota es D'
				SiNo
					Si promedio>=0 Y promedio<=59 Entonces
						Escribir 'La nota es E'
					SiNo
						Escribir 'ERROR'
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
