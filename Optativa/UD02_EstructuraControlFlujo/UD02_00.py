import math

numero = int(input("Ingrese un numero: \n"))
#Ejercicio 5


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