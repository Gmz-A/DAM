print("Hola clase")

numero_alumnos = int(input("Cuantos alumnos sois?"))

print(f"El numoero de alumnos es {numero_alumnos}")

if numero_alumnos < 20:
    alumnos_restantes = 20 - numero_alumnos
    print(f"Faltan {alumnos_restantes} alumnos para empezar")
else:
    print("vamos a empezar la clase")

print("fin del programa")