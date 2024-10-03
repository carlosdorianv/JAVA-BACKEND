Algoritmo MaquinaDeReciclaje

		definir contrasena, user como cadena
		definir intentos, CantDeBotellas, peso, PesoTotal, valortotal, saldo,i,j como entero
		definir eleccion, QuiereVender como cadena
		definir login Como Logico
		
		login = Falso
		saldo = 0
		intentos = 0
		
		
		mientras intentos < 3 y no login Hacer
			Escribir "Ingrese su nombre de usuario:"
			leer user
			Escribir "Ingrese su contrasena:"
			leer contrasena
			si user = "a" y contrasena = "a" Entonces
				login = Verdadero
			SiNo
				escribir "Usuarios o contrasenas incorrectos"
				intentos = intentos + 1
			FinSi
		FinMientras
		
		si login = verdadero
			
			Escribir " .=. +-------------------------------------------+ .=."
			Escribir " | | | ¯\\_(-_-)_/¯ MENÚ ¯\\_(O_O)_/¯ | | |"
			Escribir " | | +-------------------------------------------+ | |"
			Escribir " / \\ | 1. Ingresar Botellas | / \\"
			Escribir " | | | 2. Consultar Saldo | | |"
			Escribir " | RE | (=^_^=) | 3. Salir | (=^_^=) | O |"
			Escribir " | CI | +-------------------------------------------+ | TE |"
			Escribir " | CLA | Seleccione una opción: | MATO |"
			Escribir " |_______| |_______|"
			Escribir " \\_____/ \\_____/"
			leer eleccion
			
			segun eleccion hacer
				
				"1": Escribir "Ingrese las botellas a reciclar"
					
					leer CantDeBotellas
					PesoTotal = 0
					valortotal = 0
					
					para i = 1 hasta CantDeBotellas Hacer
						peso = aleatorio(100,3000)
						PesoTotal = pesototal + peso
						si peso < 500 Entonces
							valortotal = valortotal + 50
							
						SiNo
							si peso > 500 y peso < 1500
								valortotal = valortotal + 125
							SiNo
								si peso > 1500
									valortotal = valortotal + 200
								FinSi
							FinSi
						FinSi
						
						
					FinPara
					saldo = valortotal + saldo
					escribir "El valor de sus botellas es:" valortotal " $"
					
					escribir "Quiere vender las botellas?"
					leer QuiereVender
					
					si quierevender = "s" o quierevender = "S" Entonces
						escribir "Se ha vendido el monto de: " saldo "gracias por reciclar."
						escribir "Haz reciclado: " pesototal "KEEP GOING MATE!"
						saldo = 0
					FinSi
					
				"2": escribir "Su saldo es: " saldo
					
				"3": escribir "GRACIAS POR CUIDAR EL MEDIO AMBIENTE!!!!!!11111"
					
				de otro modo:
					escribir "Opcion incorrecta: "
FinSegun



FinSi
FinAlgoritmo