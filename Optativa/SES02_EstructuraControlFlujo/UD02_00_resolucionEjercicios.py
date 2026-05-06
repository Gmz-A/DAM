import math

print("Ejercicio 1\n")

numero = int(input("Ingrese un numero: \n"))
if numero > 0:
    print("Es un numero positivo")
elif numero == 0:
    print("Es un 0")
else:
    print("El numero es negativo")

print("Ejercicio 2\n")

edad = int(input("Dime tu edad\n"))

if edad >= 65:
    print("Vete a dormir, viejo")
elif edad >= 18:
    print("Puedes pasar")
else: 
    print("No puedes pasar")

print("Ejercicio 3\n")

pacman = int(input("Ingresa un numero de pacman: \n"))
fantasma = int(input("Ingresa otro numero de fantasma: \n"))

if pacman==fantasma:
    formato = input("Ingresa las opciones | Normal o Caramelo |\n")
    if formato == "Normal":
        print("Pacman ha sido atrapado")
    elif formato == "Caramelo":
        print("Pacman ha comido fantasma")
else:
    print("Pacman ha escapado")

#tiempo clase 1:00:28
print("Ejercicio 4\n")
numeroEj4 = int(input("Ingresa un numero: \n"))
if numeroEj4 % 3 == 0 and numeroEj4 % 5 == 0:
    print("Es múltiplo de 3 y 5")
elif numeroEj4 % 3 == 0:
    print("El resultado entre 3 es" + numeroEj4 % 3)
elif numeroEj4 % 5 == 0:
    print("El resultado entre 5 es" + numeroEj4 % 5)
else:
    print("No es multiplo de 3 ni de 5")



print("Ejercicio 5\n")

rol = input("Cual es tu rol -> ")
academia = input("Donde estudias -> ")

if academia == "Prometeo":
    if rol == "Alumno":
        print("Dicrood no oficial")
    elif rol == "Profesor":
        print("Discord Oficial")
else: 
    print("No tienes acceso al servidor")


#EJERCICIOS HECHOS EN CLASE
print("EJERCICIOS EN CLASE")

#Ejercicio 6
print(f"""
    "Doble: {numero*2}"
    "Triple: {numero*3}"
    "Mitad: {numero/2}"
    "Cuadrado: {numero**2}"
    "Raiz: {math.sqrt(numero)}"
""")

#Ejercicio 7
num1 = int(input("Dime un numero \n"))
num2 = int(input("Dime otro numero \n"))
num3 = int(input("Dime otro numero \n"))

print(f"Son mayores que 0? {num1 > 0 and num2 > 0 and num3 > 0}")

#Ejercicio 8
nombre1 = input("Dime un nombre\n")
nombre2 = input("Dime otro nombre\n")
nombre3 = input("Dime otro nombre\n")

print(f"Hay algun Juan? {nombre1=="Juan" or nombre2=="Juan" or nombre3=="Juan"}")

#Ejercicio 9
numero = int(input("Ingrese un numero: \n"))

print(f"Es mayor o igual que 18 y menor que 65? {numero >= 18 and numero < 65}")

#Ejercicio 10
num1 = int(input("Ingrese un numero:\n"))
num2 = int(input("Infrese otro numero: \n"))

print(f"División decimal: {num1/num2}")
print(f"División entera: {num1//num2}")
print(f"Resto: {num1%num2}")